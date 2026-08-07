package ie0;

import android.database.CursorWindow;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes8.dex */
public class g {
    public static void a() {
        try {
            Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
            declaredField.setAccessible(true);
            declaredField.set(null, 104857600);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
