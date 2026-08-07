package cc;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.internal.ImagesContract;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public class h extends o {
    public h(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private String q(String str) {
        String[] strArrSplit = str.split("/");
        return strArrSplit[strArrSplit.length - 1];
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
        if (!n.j("type", readableMap)) {
            Log.e("RNShare", "No type provided");
            return;
        }
        String string = readableMap.getString("type");
        if (string.startsWith("text")) {
            s(this.f19030c);
            return;
        }
        if (!n.j(ImagesContract.URL, readableMap)) {
            Log.e("RNShare", "No url provided");
            return;
        }
        String string2 = readableMap.getString(ImagesContract.URL);
        if (string2.startsWith("instagram://")) {
            t(string2);
            return;
        }
        String strQ = q(string);
        r(string2, this.f19030c, Boolean.valueOf(string.startsWith("image")), strQ);
    }

    protected void r(String str, String str2, Boolean bool, String str3) {
        bc.f fVar;
        Boolean boolValueOf = Boolean.valueOf(n.j("useInternalStorage", this.f19032e) && this.f19032e.getBoolean("useInternalStorage"));
        if (bool.booleanValue()) {
            fVar = new bc.f(str, "image/" + str3, "image", boolValueOf, this.f19028a);
        } else {
            fVar = new bc.f(str, "video/" + str3, MediaStreamTrack.VIDEO_TRACK_KIND, boolValueOf, this.f19028a);
        }
        Uri uriD = fVar.d();
        Intent intent = new Intent("android.intent.action.SEND");
        if (bool.booleanValue()) {
            intent.setType("image/*");
        } else {
            intent.setType("video/*");
        }
        intent.putExtra("android.intent.extra.STREAM", uriD);
        intent.setPackage("com.instagram.android");
        Intent intent2 = new Intent("com.instagram.share.ADD_TO_STORY");
        intent2.setDataAndType(uriD, str3);
        intent2.addFlags(1);
        intent2.setPackage("com.instagram.android");
        Intent intentCreateChooser = Intent.createChooser(intent, str2);
        intentCreateChooser.addFlags(268435456);
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
        this.f19028a.getCurrentActivity().grantUriPermission("com.instagram.android", uriD, 1);
        this.f19028a.startActivity(intentCreateChooser);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("success", true);
        writableMapCreateMap.putString("message", f().getPackage());
        q.b(writableMapCreateMap);
    }

    protected void s(String str) {
        f().setPackage("com.instagram.android");
        f().setType("text/plain");
        f().setAction("android.intent.action.SEND");
        super.m();
    }

    protected void t(String str) {
        Uri uri = Uri.parse(str);
        f().setAction("android.intent.action.VIEW");
        f().setData(uri);
        super.m();
    }
}
