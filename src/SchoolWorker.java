public class SchoolWorker {

    public static class OkulProgrami {

        public static void main(String[] args) {
            OkulProgrami okulProgrami = new OkulProgrami();

            okulProgrami.etrafiTemizle();
            okulProgrami.satisYap();
            okulProgrami.okuluAc();
            okulProgrami.okuluKapat();
        }

        public void etrafiTemizle() {
            System.out.println("Etraf temizlendi.");
        }

        public void satisYap() {
            System.out.println("Satış yapıldı ");
        }

        public void okuluAc() {
            System.out.println("Okul açıldı.");
        }

        public void okuluKapat() {
            System.out.println("Okul kapatıldı.");
        }
    }

    public static void main(String[] args) {

    }
}