package cc;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.appstate.AppStateModule;
import com.reactnativecommunity.clipboard.ClipboardModule;

/* JADX INFO: loaded from: classes3.dex */
public class i extends o {
    public i(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        n(new Intent("com.instagram.share.ADD_TO_STORY"));
    }

    private void q(ReadableMap readableMap) {
        String string;
        if (!n.j("backgroundImage", readableMap) && !n.j("backgroundVideo", readableMap) && !n.j("stickerImage", readableMap)) {
            throw new IllegalArgumentException("Invalid background or sticker assets provided.");
        }
        Activity currentActivity = this.f19028a.getCurrentActivity();
        if (currentActivity == null) {
            q.a("Something went wrong");
            return;
        }
        this.f19029b.putExtra("source_application", readableMap.getString("appId"));
        this.f19029b.putExtra("bottom_background_color", "#906df4");
        this.f19029b.putExtra("top_background_color", "#837DF4");
        if (n.j("attributionURL", readableMap)) {
            this.f19029b.putExtra("content_url", readableMap.getString("attributionURL"));
        }
        if (n.j("backgroundTopColor", readableMap)) {
            this.f19029b.putExtra("top_background_color", readableMap.getString("backgroundTopColor"));
        }
        if (n.j("backgroundBottomColor", readableMap)) {
            this.f19029b.putExtra("bottom_background_color", readableMap.getString("backgroundBottomColor"));
        }
        Boolean boolValueOf = Boolean.FALSE;
        if (n.j("useInternalStorage", readableMap)) {
            boolValueOf = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool = boolValueOf;
        if (n.j("linkUrl", readableMap)) {
            this.f19029b.putExtra("link_url", readableMap.getString("linkUrl"));
        }
        if (n.j("linkText", readableMap)) {
            this.f19029b.putExtra("link_text", readableMap.getString("linkText"));
        }
        boolean z11 = n.j("backgroundImage", readableMap) || n.j("backgroundVideo", readableMap);
        if (z11) {
            boolean zJ = n.j("backgroundImage", readableMap);
            String str = ClipboardModule.MIMETYPE_JPEG;
            if (zJ) {
                string = readableMap.getString("backgroundImage");
            } else if (n.j("backgroundVideo", readableMap)) {
                string = readableMap.getString("backgroundVideo");
                str = "video/*";
            } else {
                string = "";
            }
            bc.f fVar = new bc.f(string, str, AppStateModule.APP_STATE_BACKGROUND, bool, this.f19028a);
            this.f19029b.setDataAndType(fVar.d(), fVar.c());
            this.f19029b.setFlags(1);
        }
        if (n.j("stickerImage", readableMap)) {
            bc.f fVar2 = new bc.f(readableMap.getString("stickerImage"), ClipboardModule.MIMETYPE_PNG, "sticker", bool, this.f19028a);
            if (!z11) {
                this.f19029b.setType("image/*");
            }
            this.f19029b.putExtra("interactive_asset_uri", fVar2.d());
            currentActivity.grantUriPermission("com.instagram.android", fVar2.d(), 1);
        }
    }

    @Override // cc.n
    protected String b() {
        return null;
    }

    @Override // cc.n
    protected String h() {
        return "com.instagram.android";
    }

    @Override // cc.n
    protected String i() {
        return "https://play.google.com/store/apps/details?id=com.instagram.android";
    }

    @Override // cc.o, cc.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        q(readableMap);
        p(readableMap);
    }
}
