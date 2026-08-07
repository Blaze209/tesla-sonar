package org.godotengine.godot;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class Dictionary extends HashMap<String, Object> {
    protected String[] keys_cache;

    public String[] get_keys() {
        String[] strArr = new String[size()];
        Iterator<String> it = keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        return strArr;
    }

    public Object[] get_values() {
        Object[] objArr = new Object[size()];
        Iterator<String> it = keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            objArr[i11] = get(it.next());
            i11++;
        }
        return objArr;
    }

    public void set_keys(String[] strArr) {
        this.keys_cache = strArr;
    }

    public void set_values(Object[] objArr) {
        int i11 = 0;
        for (String str : this.keys_cache) {
            put(str, objArr[i11]);
            i11++;
        }
        this.keys_cache = null;
    }
}
