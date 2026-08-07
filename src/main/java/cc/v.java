package cc;

import android.content.ComponentName;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes3.dex */
public class v extends o {
    public v(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cc.n
    protected String b() {
        return null;
    }

    @Override // cc.n
    protected String h() {
        return "com.whatsapp";
    }

    @Override // cc.n
    protected String i() {
        return "market://details?id=com.whatsapp";
    }

    @Override // cc.o, cc.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        if (readableMap.hasKey("whatsAppNumber")) {
            try {
                f().setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
                m();
                Thread.sleep(10L);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        f().setComponent(null);
        m();
    }
}
