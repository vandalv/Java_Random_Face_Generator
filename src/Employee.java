//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class Employee extends Person implements Serializable {
    BufferedImage bufferedImage;
    private int DEFAULT_WIDTH = 280, DEFAULT_HEIGHT = 339;
    private String employerName;
    private LocalDate employmentDate;
    private BigDecimal salary;
    private String jobTitle;
    private final String[] workList = new String[]{"robotnik", "sprzedawca", "manager"};
    public byte[] fileContent;

    public Employee() {
    }

    public String getEmployerName() {
        return this.employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public LocalDate getEmploymentDate() {
        return this.employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setEmployeeImage(BufferedImage employeeImage) throws IOException {
        createGraphics();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Employee employee = (Employee) o;
            return Objects.equals(this.employerName, employee.employerName) && Objects.equals(this.employmentDate, employee.employmentDate) && Objects.equals(this.salary, employee.salary) && Objects.equals(this.jobTitle, employee.jobTitle);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.employerName, this.employmentDate, this.salary, this.jobTitle});
    }

    public LocalDate employmentDate() {
        Random random = new Random();
        return LocalDate.of(2020, 1, 1).plusYears((long) random.nextInt(30)).plusMonths((long) random.nextInt(12)).plusDays((long) random.nextInt(31));
    }

    public BigDecimal randSalary() {
        return new BigDecimal(BigInteger.valueOf((long) (new Random()).nextInt(10001)), 0);
    }

    public String randomJobtitle() {
        Random random = new Random();
        int index = random.nextInt(this.workList.length);
        return this.workList[index];
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " " + this.employmentDate + " " + this.salary + " " + this.jobTitle + "\n";
    }


    public byte[] createGraphics() throws IOException {
            BufferedImage bufferedImage = new BufferedImage(280, 339, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = bufferedImage.createGraphics();
            Random rand = new Random();
            BufferedImage image = null;
            try {
                image = ImageIO.read(new File("faceParts/chin/chin"+rand.nextInt(5)+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedImage overlay = null;
            try {
                overlay = ImageIO.read(new File("faceParts/ears/ears"+rand.nextInt(5)+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedImage eyes = null;
            try {
                eyes = ImageIO.read(new File("faceParts/eyes/eyes"+rand.nextInt(5)+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedImage eyebrows = null;
            try {
                eyebrows = ImageIO.read(new File("faceParts/eyebrows/eyebrows"+rand.nextInt(5)+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedImage hair = null;
            try {
                hair = ImageIO.read(new File("faceParts/hair/hair"+rand.nextInt(18)+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedImage lips = null;
            try {
                lips = ImageIO.read(new File("faceParts/lips/lips"+rand.nextInt(5)+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedImage nose = null;
            try {
                nose = ImageIO.read(new File("faceParts/nose/nose"+rand.nextInt(5)+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g2.drawImage(image, 0, 0, null);
            g2.drawImage(overlay, 0, 0, null);
            g2.drawImage(eyes, 0, 0, null);
            g2.drawImage(eyebrows, 0, 0, null);
            g2.drawImage(hair, 0, 0, null);
            g2.drawImage(lips, 0, 0, null);
            g2.drawImage(nose, 0, 0, null);
            g2.dispose();
            ImageIO.write(bufferedImage, "PNG", new File("frankenstein.png"));
            File file = new File("face.jpg");
            ImageIO.write(bufferedImage, "jpg", file);
            file = new File("face.png");
            ImageIO.write(bufferedImage, "png", file);
            file = new File("face.gif");
            ImageIO.write(bufferedImage, "gif", file);
            this.fileContent = Files.readAllBytes(file.toPath());
        return this.fileContent;
    }
}
