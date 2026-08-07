package cc;

import android.content.ComponentName;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes3.dex */
public class u extends o {
    public u(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cc.n
    protected String b() {
        return null;
    }

    @Override // cc.n
    protected String h() {
        return "com.whatsapp.w4b";
    }

    @Override // cc.n
    protected String i() {
        return "market://details?id=com.whatsapp.w4b";
    }

    @Override // cc.o, cc.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        if (readableMap.hasKey("whatsAppNumber")) {
            try {
                f().setComponent(new ComponentName("com.whatsapp.w4b", "com.whatsapp.Conversation"));
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
