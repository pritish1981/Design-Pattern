package singleton.assignment.question1;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private static FileBasedConfigurationManagerImpl fbcmi = null;

    private FileBasedConfigurationManagerImpl(){
        super();
    }

    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
        return properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
        String value = properties.getProperty(key);
        if(value!=null){
            return convert(value , type);
        }

        return null;
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
        properties.setProperty(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
        if(value != null){
            properties.setProperty(key, value.toString());
        }
        else{
            removeConfiguration(key);
        }
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
         properties.remove(key);
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'clear'");
        properties.clear();
    }

    public static FileBasedConfigurationManager getInstance() {
        // TODO Auto-generated method stub
        if(fbcmi == null){
            synchronized(FileBasedConfigurationManagerImpl.class){
                if(fbcmi == null){
                	fbcmi = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return fbcmi;
    }

    public static void resetInstance() {
        // TODO Auto-generated method stub
        fbcmi = null;
    }
}

