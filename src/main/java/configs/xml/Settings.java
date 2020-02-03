package configs.xml;

public class Settings {

    private boolean saveCache;

    public Settings(boolean saveCache){
        this.saveCache = saveCache;
    }

    public void saveCache(){
        if (saveCache){
            System.out.println("Saving....");
        }else {
            System.out.println("Error!");
        }
    }

    public boolean isSaveCache(){
        return this.saveCache;
    }

    public void setSaveCache(boolean saveCache){
        this.saveCache = saveCache;
    }

}
