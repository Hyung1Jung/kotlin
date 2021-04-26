import java.util.HashMap;
import java.util.Map;

public class MutableCustomKey {
    public MutableCustomKey(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MutableCustomKey other = (MutableCustomKey) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public static void main(String[] args) {
        MutableCustomKey key = new MutableCustomKey("Shamik");
        Map<MutableCustomKey, String> map = new HashMap<MutableCustomKey, String>();
        map.put(key, "Shamik Mitra");
        MutableCustomKey refKey = new MutableCustomKey("Shamik");
        String val = map.get(refKey);
        System.out.println("Value Found " + val);
        key.setName("Bubun");
        String val1 = map.get(refKey);
        System.out.println("Due to MutableKey value not found " + val1);
    }
}