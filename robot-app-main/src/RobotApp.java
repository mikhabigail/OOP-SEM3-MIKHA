import java.util.Scanner;

import Model.Layout;
import Model.Position;
import Model.Robot;

public class RobotApp {
    public static void main(String[] args){
        new RobotApp();
    }

    private Layout layout;
    private Robot robot;
    private Scanner scanner;

    public RobotApp() {
        // contoh konfigurasi (inisiasi object layout) area permainan: X = 10, Y = 10, icon area yang tidak ditempati robot adalah '*'
        this.layout = new Layout(10, 10, '*'); // inisiasi objek layout
        this.robot = new Robot('o', new Position(0, 3)); // inisiasi objek robot
        this.scanner = new Scanner(System.in);
        String instruction = "";
        System.out.println("-------- Permainan Dimulai --------");
        do{
            draw();
            instruction = waitInstruction();
            executeInstruction(instruction);
        } while(!instruction.equals("x"));
        System.out.println("-------- Permainan Berakhir --------");

            //materi di kelas
            char arah = instruction.charAt(0);
            String langkah_ = instruction.substring(1, instruction.length());
            System.out.println("char: " + arah + "Langkah: " + langkah_);
        
            int langkah = Integer.parseInt(langkah_);
            
            // hitung (materi di kelas)
            // Position current_position = robot.getPosition();
            // int x_hitung = current_position.getX();
            // int y_hitung = current_position.getY();
    }

    private void executeInstruction(String instruction){
        if (instruction.length() < 2) {
            System.out.println("Inputan tidak valid. Silahkan masukkan banyaknya langkah kembali!");
            return;
        }
        
        char direction = instruction.charAt(0);
        int steps;
        try {
            steps = Integer.parseInt(instruction.substring(1));
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Silahkan masukkan ulang nomor step yang benar!");
            return;
        }

        Position newPosition = new Position(robot.getPosition().getX(), robot.getPosition().getY());
            switch(direction) {
                case 'd':
                    newPosition.setY(newPosition.getY() + steps);
                    break;
                case 'a':
                    newPosition.setY(newPosition.getY() - steps);;
                    break;
                case 'w':
                    newPosition.setX(newPosition.getX() - steps);
                    break;
                case 's':
                    newPosition.setX(newPosition.getX() + steps);
                    break;
                default:
                    System.out.println("Instruksi tidak valid. Silakan coba lagi menggunakkan 'd', 'a', 'w', 's'.");
                    return;
        }

        // Mengecek apakah robot keluar dari area permainan
        if(isValidPosition(newPosition)) {
            robot.setPosition(newPosition);
        } else {
            System.out.println("Robot tidak dapat keluar dari area permainan");
        }
    }

    private boolean isValidPosition(Position pos) {
        return pos.getX() >= 0 && pos.getX() < layout.getMaxX() && pos.getY() >= 0 && pos.getY() < layout.getMaxY();
    }

    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'keatas 3 langkah'");
        System.out.print("Masukan instruksi: ");
        return scanner.nextLine();
    }

    private void draw() {
        System.out.println("------ Posisi Terbaru ------");
        for (int a =  0; a < layout.getMaxY(); a++) {
            for (int b =  0; b < layout.getMaxX(); b++) {
                if (a == robot.getPosition().getX() && b == robot.getPosition().getY()) {
                    System.out.print(robot.getIcon()); // Gambar robot pada posisi yang tepat
                } else {
                    System.out.println(layout.getArea()[a][b]); // Gambar area permainan lainnya
                }
            }
            System.out.println();
        }
    }
}