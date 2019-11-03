package utilities.jshop2;

public class Factory {
    private String outputDirectory;
    private boolean isJSHOP2;
    private boolean isCSV;
    private double resource;
    private int riskAttitude;

    private static Factory instance;

    public static Factory getInstance() {
        if (instance == null)
            instance = new Factory();
        return instance;
    }

    private Factory() {

    }

    public boolean isJSHOP2() {
        return isJSHOP2;
    }

    public void setIsJSHOP2(boolean isJSHOP) {
        isJSHOP2 = isJSHOP;
    }

    public double getResource() {
        return resource;
    }

    public void setResource(double r) {
        resource = r;
    }

    public int getRiskAttitude() {
        return riskAttitude;
    }

    public void setRiskAttitude(int r) {
        riskAttitude = r;
    }

    public boolean isCSV() {
        return isCSV;
    }

    public void setCSV(boolean CSV) {
        isCSV = CSV;
    }

    public String getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    public AlgorithmInterface getAlgorithm() {
        if (isJSHOP2)
            return JSHOP2.getInstance();
        else return MyJSHOP2.getInstance();
    }
}
