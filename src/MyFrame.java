//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener, Serializable {
    BufferedImage nose;
    BufferedImage lips;
    BufferedImage hair;
    BufferedImage eyebrows;
    BufferedImage eyes;
    BufferedImage overlay;
    Random rand;
    BufferedImage image;
    Graphics2D g8;
    BufferedImage combined8;
    JLabel picLabel2;
    BufferedImage buffImage;
    ByteArrayInputStream bis11;
    BufferedImage bImage2;
    JMenuBar menuBar;
    JTabbedPane tabbedPane;
    JMenuBar mb;
    JMenu menu;
    JMenuItem i1;
    JMenuItem i2;
    JMenuItem i3;
    String tempo;
    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JTextField tf4;
    JTextField tf5;
    JTextField tf6;
    JTextField tf7;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn10;
    JComboBox cbox;
    Employee[] eMar = EmployeesAr.getArray();
    int recordNumber = 0;
    int counter = 0;
    byte[] data;
    JPanel dPanel;
    JLabel picLabel1;


    MyFrame() throws IOException {
        for(int i = 0; i < this.eMar.length; ++i) {
            if (this.eMar[i] != null) {
                ++this.counter;
            }
        }

        this.setTitle("Valery Dauzhuk Lab6");
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setSize(550, 820);
        menuBar = new JMenuBar();
        JPanel panel0 = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel lb1 = new JLabel("ID                   ");
        JLabel lb2 = new JLabel("First Name    ");
        JLabel lb3 = new JLabel("Last Name    ");
        JLabel lb4 = new JLabel("Birth Date     ");
        JLabel lb5 = new JLabel("Release Date");
        JLabel lb6 = new JLabel("Salary             ");
        JLabel lb7 = new JLabel("Job Title        ");
        JLabel lb8 = new JLabel("Total number of records: " + this.counter);
        panel0.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        panel1.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        panel2.setBorder(BorderFactory.createEmptyBorder(30, 50, 50, 100));
        panel1.setPreferredSize(new Dimension(500, 50));
        panel1.setPreferredSize(new Dimension(500, 100));
        panel2.setPreferredSize(new Dimension(500, 680));
        tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        this.add(tabbedPane, BorderLayout.CENTER);
        JPanel cPanel = new JPanel();
        dPanel = new JPanel();
        tabbedPane.addTab("Edit employee", null, cPanel, null);
        tabbedPane.addTab("Face Generator", null, dPanel, null);
        this.mb = new JMenuBar();
        this.menu = new JMenu("Menu");
        this.i1 = new JMenuItem("Add");
        this.i2 = new JMenuItem("Write");
        this.i3 = new JMenuItem("Exit");
        this.menu.add(this.i1);
        this.menu.add(this.i2);
        this.menu.add(this.i3);
        this.btn1 = new JButton("Add");
        this.btn2 = new JButton("Save");
        this.btn3 = new JButton("Write");
        this.btn4 = new JButton("Find");
        this.btn5 = new JButton("<");
        this.btn6 = new JButton(">");
        this.btn7 = new JButton(">>");
        this.btn8 = new JButton("<<");
        this.btn10 = new JButton("Generate Random Face");
        String[] cboxArray = new String[]{"Id", "Name"};
        this.cbox = new JComboBox(cboxArray);
        this.btn1.setFocusPainted(false);
        this.btn1.setContentAreaFilled(false);
        this.btn2.setFocusPainted(false);
        this.btn2.setContentAreaFilled(false);
        this.btn3.setFocusPainted(false);
        this.btn3.setContentAreaFilled(false);
        this.btn4.setFocusPainted(false);
        this.btn4.setContentAreaFilled(false);
        this.btn5.setFocusPainted(false);
        this.btn5.setContentAreaFilled(false);
        this.btn6.setFocusPainted(false);
        this.btn6.setContentAreaFilled(false);
        this.btn7.setFocusPainted(false);
        this.btn7.setContentAreaFilled(false);
        this.btn8.setFocusPainted(false);
        this.btn8.setContentAreaFilled(false);
        this.btn10.setFocusPainted(false);
        this.btn10.setContentAreaFilled(false);
        this.tf1 = new JTextField();
        this.tf2 = new JTextField();
        this.tf3 = new JTextField();
        this.tf4 = new JTextField();
        this.tf5 = new JTextField();
        this.tf6 = new JTextField();
        this.tf7 = new JTextField();
        panel1.setBackground(Color.white);
        panel2.setBackground(Color.white);
        this.getContentPane().add(panel0, "North");
        this.getContentPane().add(panel1, "North");
        this.getContentPane().add(panel2, "South");
        this.btn1.setPreferredSize(new Dimension(100, 30));
        this.btn2.setPreferredSize(new Dimension(100, 30));
        this.btn3.setPreferredSize(new Dimension(100, 30));
        this.btn4.setPreferredSize(new Dimension(100, 30));
        this.btn5.setPreferredSize(new Dimension(100, 30));
        this.btn6.setPreferredSize(new Dimension(100, 30));
        this.btn7.setPreferredSize(new Dimension(100, 30));
        this.btn8.setPreferredSize(new Dimension(100, 30));
        this.tf1.setPreferredSize(new Dimension(250, 30));
        this.tf2.setPreferredSize(new Dimension(250, 30));
        this.tf3.setPreferredSize(new Dimension(250, 30));
        this.tf4.setPreferredSize(new Dimension(250, 30));
        this.tf5.setPreferredSize(new Dimension(250, 30));
        this.tf6.setPreferredSize(new Dimension(250, 30));
        this.tf7.setPreferredSize(new Dimension(250, 30));
        this.mb.add(this.menu);
        panel0.add(this.mb);
        this.i1.addActionListener(this);
        this.i2.addActionListener(this);
        this.i3.addActionListener(this);
        panel1.add(this.btn1);
        panel1.add(this.btn2);
        panel1.add(this.btn3);
        panel1.add(this.btn4);
        panel1.add(this.btn5);
        panel1.add(this.btn6);
        panel1.add(this.btn7);
        panel1.add(this.btn8);
        panel2.add(lb1, "Center");
        panel2.add(this.tf1, "Center");
        panel2.add(lb2, "Center");
        panel2.add(this.tf2, "Center");
        panel2.add(lb3, "Center");
        panel2.add(this.tf3, "Center");
        panel2.add(lb4, "Center");
        panel2.add(this.tf4, "Center");
        panel2.add(lb5, "Center");
        panel2.add(this.tf5, "Center");
        panel2.add(lb6, "Center");
        panel2.add(this.tf6, "Center");
        panel2.add(lb7, "Center");
        panel2.add(this.tf7, "Center");
        panel2.add(lb8, "Center");
        panel2.add(this.cbox, "Center");
        this.btn1.addActionListener(this);
        this.btn2.addActionListener(this);
        this.btn3.addActionListener(this);
        this.btn4.addActionListener(this);
        this.btn5.addActionListener(this);
        this.btn6.addActionListener(this);
        this.btn7.addActionListener(this);
        this.btn8.addActionListener(this);
        this.btn10.addActionListener(this);
        this.tf1.setText(String.valueOf(this.eMar[0].getId()));
        this.tf2.setText(this.eMar[0].getName());
        this.tf3.setText(this.eMar[0].getSurname());
        this.tf4.setText(String.valueOf(this.eMar[0].getBirthDate()));
        this.tf5.setText(String.valueOf(this.eMar[0].getEmploymentDate()));
        this.tf6.setText(String.valueOf(this.eMar[0].getSalary()));
        this.tf7.setText(String.valueOf(this.eMar[0].getJobTitle()));
        cPanel.add(panel1);
        cPanel.add(panel2);
        data = this.eMar[0].fileContent;
        bis11 = new ByteArrayInputStream(data);
        bImage2 = null;
        try {
            bImage2 = ImageIO.read(bis11);
            buffImage = new BufferedImage(280, 339, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = buffImage.createGraphics();
            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, 0, buffImage.getWidth(), buffImage.getHeight());
            g2d.drawImage(buffImage, 0, 0, null);
            g2d.drawImage(bImage2, 0, 0, null);
            g2d.dispose();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        try {
            ImageIO.write(buffImage, "PNG", new File("output.png") );
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        ImageIO.read(new File("output.png"));
        picLabel1 = new JLabel(new ImageIcon("output.png"));
        panel2.add(picLabel1);
        dPanel.add(this.btn10, "North");
        picLabel2 = new JLabel();
        picLabel2.setPreferredSize(new Dimension(360, 339));
        dPanel.add(picLabel2, "Center");
        btn3.addActionListener(createStartTaskActionListener(this));
        btn2.addActionListener(createStartTaskActionListener(this));
        this.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.i3) {
            System.exit(0);
        }


        if (e.getSource() == this.btn1 || e.getSource() == this.i1) {
            this.tf1.setText("");
            this.tf2.setText("");
            this.tf3.setText("");
            this.tf4.setText("");
            this.tf5.setText("");
            this.tf6.setText("");
            this.tf7.setText("");
            System.out.println(this.eMar.length);
            System.out.println(this.counter);
        }

        if (e.getSource() == this.btn2) {
            Employee createdPerson = new Employee();
            this.eMar[this.counter] = createdPerson;
            this.eMar[this.counter].setId(Long.parseLong(this.tf1.getText()));
            this.eMar[this.counter].setName(this.tf2.getText());
            this.eMar[this.counter].setSurname(this.tf3.getText());
            this.eMar[this.counter].setBirthDate(LocalDate.parse(this.tf4.getText()));
            this.eMar[this.counter].setEmploymentDate(LocalDate.parse(this.tf5.getText()));
            this.eMar[this.counter].setSalary(new BigDecimal(this.tf6.getText()));
            this.eMar[this.counter].setJobTitle(this.tf7.getText());
            this.counter = 0;

            int i;
            for(i = 0; i < this.eMar.length; ++i) {
                if (this.eMar[i] != null) {
                    ++this.counter;
                }
            }

            for(i = 0; i < this.eMar.length; ++i) {
                if (this.eMar[i] != null) {
                    System.out.print(this.eMar[i]);
                }
            }

            System.out.println(this.counter);
        }

        if (e.getSource() == this.btn3 || e.getSource() == this.i2) {
            try {
                FileOutputStream fos = new FileOutputStream("test.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(this.eMar);
                oos.close();
                System.out.println("File Saved");
            } catch (Exception var6) {
                System.out.println("Error in output:" + var6.toString());
            }

            try {
                FileInputStream fis = new FileInputStream("test.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Employee[] allemps = (Employee[])ois.readObject();

                for(int i = 0; i < this.counter; ++i) {
                    PrintStream var10000 = System.out;
                    long var10001 = allemps[i].getId();
                    var10000.println(var10001 + " " + allemps[i].getName() + " " + allemps[i].getSurname() + " " + allemps[i].getBirthDate() + " " + allemps[i].getEmploymentDate() + " " + allemps[i].getSalary() + " " + allemps[i].getJobTitle());
                }

                ois.close();
                System.out.println("File Imported");
            } catch (Exception var7) {
                System.out.println("Error in output:" + var7.toString());
            }
        }

        int i;
        if (e.getSource() == this.btn4) {
            if (this.cbox.getSelectedItem() == "Name") {
                this.tempo = this.tf2.getText();

                for(i = 0; i < this.counter; ++i) {
                    if (this.eMar[i].getName().equals(this.tempo)) {
                        this.tf1.setText(String.valueOf(this.eMar[i].getId()));
                        this.tf2.setText(this.eMar[i].getName());
                        this.tf3.setText(this.eMar[i].getSurname());
                        this.tf4.setText(String.valueOf(this.eMar[i].getBirthDate()));
                        this.tf5.setText(String.valueOf(this.eMar[i].getEmploymentDate()));
                        this.tf6.setText(String.valueOf(this.eMar[i].getSalary()));
                        this.tf7.setText(String.valueOf(this.eMar[i].getJobTitle()));
                        this.recordNumber = i;
                    }
                }
            }

            if (this.cbox.getSelectedItem() == "Id") {
                this.tempo = this.tf1.getText();

                for(i = 0; i < this.counter; ++i) {
                    if (String.valueOf(this.eMar[i].getId()).equals(this.tempo)) {
                        this.tf1.setText(String.valueOf(this.eMar[i].getId()));
                        this.tf2.setText(this.eMar[i].getName());
                        this.tf3.setText(this.eMar[i].getSurname());
                        this.tf4.setText(String.valueOf(this.eMar[i].getBirthDate()));
                        this.tf5.setText(String.valueOf(this.eMar[i].getEmploymentDate()));
                        this.tf6.setText(String.valueOf(this.eMar[i].getSalary()));
                        this.tf7.setText(String.valueOf(this.eMar[i].getJobTitle()));
                        this.recordNumber = i;
                    }
                }
            }
        }

        if (e.getSource() == this.btn5) {
            if (this.recordNumber == 0) {
                this.recordNumber = this.counter - 1;
                this.tf1.setText(String.valueOf(this.eMar[this.recordNumber].getId()));
                this.tf2.setText(this.eMar[this.recordNumber].getName());
                this.tf3.setText(this.eMar[this.recordNumber].getSurname());
                this.tf4.setText(String.valueOf(this.eMar[this.recordNumber].getBirthDate()));
                this.tf5.setText(String.valueOf(this.eMar[this.recordNumber].getEmploymentDate()));
                this.tf6.setText(String.valueOf(this.eMar[this.recordNumber].getSalary()));
                this.tf7.setText(String.valueOf(this.eMar[this.recordNumber].getJobTitle()));
                data = this.eMar[this.recordNumber].fileContent;
                ByteArrayInputStream bis = new ByteArrayInputStream(data);
                BufferedImage bImage = null;
                try {
                    bImage = ImageIO.read(bis);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                try {
                    ImageIO.write(bImage, "PNG", new File("output"+this.recordNumber+".png"));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                this.picLabel1.setIcon(new ImageIcon("output"+this.recordNumber+".png"));
                revalidate();
                repaint();
            } else {
                --this.recordNumber;
                this.tf1.setText(String.valueOf(this.eMar[this.recordNumber].getId()));
                this.tf2.setText(this.eMar[this.recordNumber].getName());
                this.tf3.setText(this.eMar[this.recordNumber].getSurname());
                this.tf4.setText(String.valueOf(this.eMar[this.recordNumber].getBirthDate()));
                this.tf5.setText(String.valueOf(this.eMar[this.recordNumber].getEmploymentDate()));
                this.tf6.setText(String.valueOf(this.eMar[this.recordNumber].getSalary()));
                this.tf7.setText(String.valueOf(this.eMar[this.recordNumber].getJobTitle()));
                data = this.eMar[this.recordNumber].fileContent;
                ByteArrayInputStream bis = new ByteArrayInputStream(data);
                BufferedImage bImage = null;
                try {
                    bImage = ImageIO.read(bis);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                try {
                    ImageIO.write(bImage, "png", new File("output"+this.recordNumber+".png") );
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                this.picLabel1.setIcon(new ImageIcon("output"+this.recordNumber+".png"));
                revalidate();
                repaint();
            }
        }

        if (e.getSource() == this.btn6) {
            if (this.recordNumber == this.counter - 1) {
                this.recordNumber = 0;
                this.tf1.setText(String.valueOf(this.eMar[this.recordNumber].getId()));
                this.tf2.setText(this.eMar[this.recordNumber].getName());
                this.tf3.setText(this.eMar[this.recordNumber].getSurname());
                this.tf4.setText(String.valueOf(this.eMar[this.recordNumber].getBirthDate()));
                this.tf5.setText(String.valueOf(this.eMar[this.recordNumber].getEmploymentDate()));
                this.tf6.setText(String.valueOf(this.eMar[this.recordNumber].getSalary()));
                this.tf7.setText(String.valueOf(this.eMar[this.recordNumber].getJobTitle()));
                data = this.eMar[this.recordNumber].fileContent;
                ByteArrayInputStream bis = new ByteArrayInputStream(data);
                BufferedImage bImage = null;
                try {
                    bImage = ImageIO.read(bis);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                try {
                    ImageIO.write(bImage, "PNG", new File("output"+this.recordNumber+".png"));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                this.picLabel1.setIcon(new ImageIcon("output"+this.recordNumber+".png"));
                revalidate();
                repaint();
            } else {
                ++this.recordNumber;
                this.tf1.setText(String.valueOf(this.eMar[this.recordNumber].getId()));
                this.tf2.setText(this.eMar[this.recordNumber].getName());
                this.tf3.setText(this.eMar[this.recordNumber].getSurname());
                this.tf4.setText(String.valueOf(this.eMar[this.recordNumber].getBirthDate()));
                this.tf5.setText(String.valueOf(this.eMar[this.recordNumber].getEmploymentDate()));
                this.tf6.setText(String.valueOf(this.eMar[this.recordNumber].getSalary()));
                this.tf7.setText(String.valueOf(this.eMar[this.recordNumber].getJobTitle()));
                data = this.eMar[this.recordNumber].fileContent;
                ByteArrayInputStream bis = new ByteArrayInputStream(data);
                BufferedImage bImage = null;
                try {
                    bImage = ImageIO.read(bis);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                try {
                    ImageIO.write(bImage, "PNG", new File("output"+this.recordNumber+".png"));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                this.picLabel1.setIcon(new ImageIcon("output"+this.recordNumber+".png"));
                revalidate();
                repaint();
            }
        }

        if (e.getSource() == this.btn7) {
            i = this.counter - 1;
            this.tf1.setText(String.valueOf(this.eMar[i].getId()));
            this.tf2.setText(this.eMar[i].getName());
            this.tf3.setText(this.eMar[i].getSurname());
            this.tf4.setText(String.valueOf(this.eMar[i].getBirthDate()));
            this.tf5.setText(String.valueOf(this.eMar[i].getEmploymentDate()));
            this.tf6.setText(String.valueOf(this.eMar[i].getSalary()));
            this.tf7.setText(String.valueOf(this.eMar[i].getJobTitle()));
            data = this.eMar[i].fileContent;
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            BufferedImage bImage = null;
            try {
                bImage = ImageIO.read(bis);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            try {
                ImageIO.write(bImage, "PNG", new File("output"+this.recordNumber+".png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            this.picLabel1.setIcon(new ImageIcon("output"+i+".png"));
            revalidate();
            repaint();
        }

        if (e.getSource() == this.btn8) {
            this.tf1.setText(String.valueOf(this.eMar[0].getId()));
            this.tf2.setText(this.eMar[0].getName());
            this.tf3.setText(this.eMar[0].getSurname());
            this.tf4.setText(String.valueOf(this.eMar[0].getBirthDate()));
            this.tf5.setText(String.valueOf(this.eMar[0].getEmploymentDate()));
            this.tf6.setText(String.valueOf(this.eMar[0].getSalary()));
            this.tf7.setText(String.valueOf(this.eMar[0].getJobTitle()));
            data = this.eMar[0].fileContent;
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            BufferedImage bImage = null;
            try {
                bImage = ImageIO.read(bis);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            try {
                ImageIO.write(bImage, "PNG", new File("output"+this.recordNumber+".png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            this.picLabel1.setIcon(new ImageIcon("output0.png"));
            revalidate();
            repaint();
        }
        if (e.getSource() == this.btn10) {
            rand = new Random();
            image = null;
            try {
                image = ImageIO.read(new File("faceParts/chin/chin"+rand.nextInt(5)+".png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            overlay = null;
            try {
                overlay = ImageIO.read(new File("faceParts/ears/ears"+rand.nextInt(5)+".png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            eyes = null;
            try {
                eyes = ImageIO.read(new File("faceParts/eyes/eyes"+rand.nextInt(5)+".png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            eyebrows = null;
            try {
                eyebrows = ImageIO.read(new File("faceParts/eyebrows/eyebrows"+rand.nextInt(5)+".png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            hair = null;
            try {
                hair = ImageIO.read(new File("faceParts/hair/hair"+rand.nextInt(18)+".png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            lips = null;

            try {
                lips = ImageIO.read(new File("faceParts/lips/lips"+rand.nextInt(5)+".png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            nose = null;
            try {
                nose = ImageIO.read(new File("faceParts/nose/nose"+rand.nextInt(5)+".png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            combined8 = new BufferedImage(280, 339, BufferedImage.TYPE_INT_ARGB);
            g8 = combined8.createGraphics();
            g8.drawImage(image, 0, 0, null);
            g8.drawImage(overlay, 0, 0, null);
            g8.drawImage(eyes, 0, 0, null);
            g8.drawImage(eyebrows, 0, 0, null);
            g8.drawImage(hair, 0, 0, null);
            g8.drawImage(lips, 0, 0, null);
            g8.drawImage(nose, 0, 0, null);
            g8.dispose();
            try {
                ImageIO.write(combined8, "PNG", new File("randomfrankenstein.png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            BufferedImage hej = null;
            try {
                hej = ImageIO.read(new File("randomfrankenstein.png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            this.picLabel2.setIcon(new ImageIcon(hej));
            revalidate();
            repaint();
        }
    }


    private static ActionListener createStartTaskActionListener(Component parent) {
        UIManager.put("ProgressMonitor.progressText", "Operation In Progress");
        return (ae) -> {
            new Thread(() -> {
                ProgressMonitor pm = new ProgressMonitor(parent, "Operation In Progress",
                        "Task starting", 0, 100);
                pm.setMillisToDecideToPopup(100);
                pm.setMillisToPopup(100);
                for (int i = 1; i <= 100; i++) {
                    pm.setNote(i + " %");
                    pm.setProgress(i);
                    try {
                        TimeUnit.MILLISECONDS.sleep(200);
                    } catch (InterruptedException e) {
                        System.err.println(e);
                    }
                }
                pm.setNote("Task finished");
            }).start();
        };
    }
}
