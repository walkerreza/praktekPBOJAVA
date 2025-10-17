public class laptop {
    private String merk;
    private processor proc;

    public laptop() {
        this.merk = "";
        this.proc = new processor();
    }

    public laptop(String merk, processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public processor getProc() {
        return proc;
    }

    public void setProc(processor proc) {
        this.proc = proc;
    }

    public void info(){
        System.out.println ("merk laptop = " + merk );
        proc.info();
    }
    
    }

