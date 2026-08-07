package cc;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ReactApplicationContext f19028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Intent f19029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f19030c = "Share";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected bc.f f19031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ReadableMap f19032e;

    public n(ReactApplicationContext reactApplicationContext) {
        this.f19028a = reactApplicationContext;
        n(new Intent("android.intent.action.SEND"));
        f().setType("text/plain");
    }

    private ComponentName[] c(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        Intent intent = new Intent(f().getAction());
        intent.setType(f().getType());
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> listQueryIntentActivities = this.f19028a.getPackageManager().queryIntentActivities(intent, 0);
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            String string = readableArray.getString(i11);
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                if (resolveInfo.activityInfo.packageName.equals(string)) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
                }
            }
        }
        return (ComponentName[]) arrayList.toArray(new ComponentName[0]);
    }

    public static boolean j(String str, ReadableMap readableMap) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? false : true;
    }

    public static boolean k(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    protected static String o(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("URLEncoder.encode() failed for " + str);
        }
    }

    protected String a() {
        return null;
    }

    protected abstract String b();

    protected bc.f d(ReadableMap readableMap) {
        String string = j("filename", readableMap) ? readableMap.getString("filename") : null;
        Boolean boolValueOf = Boolean.FALSE;
        if (j("useInternalStorage", readableMap)) {
            boolValueOf = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool = boolValueOf;
        return j("type", readableMap) ? new bc.f(readableMap.getString(ImagesContract.URL), readableMap.getString("type"), string, bool, this.f19028a) : new bc.f(readableMap.getString(ImagesContract.URL), string, bool, this.f19028a);
    }

    protected bc.g e(ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        if (j("filenames", readableMap)) {
            ReadableArray array = readableMap.getArray("filenames");
            for (int i11 = 0; i11 < array.size(); i11++) {
                arrayList.add(array.getString(i11));
            }
        }
        Boolean boolValueOf = Boolean.FALSE;
        if (j("useInternalStorage", readableMap)) {
            boolValueOf = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool = boolValueOf;
        return j("type", readableMap) ? new bc.g(readableMap.getArray("urls"), arrayList, readableMap.getString("type"), bool, this.f19028a) : new bc.g(readableMap.getArray("urls"), arrayList, bool, this.f19028a);
    }

    protected Intent f() {
        return this.f19029b;
    }

    protected Intent[] g(Intent intent, Uri uri) {
        List<ResolveInfo> listQueryIntentActivities = this.f19028a.getPackageManager().queryIntentActivities(intent, 0);
        Intent[] intentArr = new Intent[listQueryIntentActivities.size()];
        for (int i11 = 0; i11 < listQueryIntentActivities.size(); i11++) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(i11);
            String str = resolveInfo.activityInfo.packageName;
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
            intent2.setAction("android.intent.action.VIEW");
            intent2.setDataAndType(uri, intent.getType());
            intent2.addFlags(1);
            intentArr[i11] = new Intent(intent2);
        }
        return intentArr;
    }

    protected abstract String h();

    protected abstract String i();

    public void l(ReadableMap readableMap) {
        this.f19032e = readableMap;
        if (j("isNewTask", readableMap) && readableMap.getBoolean("isNewTask")) {
            f().addFlags(268468224);
        }
        if (j("subject", readableMap)) {
            f().putExtra("android.intent.extra.SUBJECT", readableMap.getString("subject"));
        }
        if (j(Scopes.EMAIL, readableMap)) {
            f().putExtra("android.intent.extra.EMAIL", new String[]{readableMap.getString(Scopes.EMAIL)});
        }
        if (j("title", readableMap)) {
            this.f19030c = readableMap.getString("title");
        }
        String string = j("message", readableMap) ? readableMap.getString("message") : "";
        String string2 = j("social", readableMap) ? readableMap.getString("social") : "";
        if (string2.equals("sms")) {
            String string3 = readableMap.getString("recipient");
            if (!string3.isEmpty()) {
                f().putExtra(PlaceTypes.ADDRESS, string3);
            }
        }
        if (string2.equals("whatsapp") && readableMap.hasKey("whatsAppNumber")) {
            f().putExtra("jid", readableMap.getString("whatsAppNumber") + "@s.whatsapp.net");
        }
        if (string2.equals("whatsappbusiness") && readableMap.hasKey("whatsAppNumber")) {
            f().putExtra("jid", readableMap.getString("whatsAppNumber") + "@s.whatsapp.net");
        }
        if (j("urls", readableMap)) {
            bc.g gVarE = e(readableMap);
            if (!gVarE.f()) {
                if (TextUtils.isEmpty(string)) {
                    f().putExtra("android.intent.extra.TEXT", readableMap.getArray("urls").getString(0));
                    return;
                }
                f().putExtra("android.intent.extra.TEXT", string + " " + readableMap.getArray("urls").getString(0));
                return;
            }
            ArrayList<Uri> arrayListD = gVarE.d();
            ClipData clipData = new ClipData(new ClipDescription("Files", new String[]{gVarE.c()}), new ClipData.Item(arrayListD.get(0)));
            for (int i11 = 1; i11 < arrayListD.size(); i11++) {
                clipData.addItem(new ClipData.Item(arrayListD.get(i11)));
            }
            f().setClipData(clipData);
            f().setAction("android.intent.action.SEND_MULTIPLE");
            f().setType(gVarE.c());
            f().putParcelableArrayListExtra("android.intent.extra.STREAM", arrayListD);
            f().addFlags(1);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            f().putExtra("android.intent.extra.TEXT", string);
            return;
        }
        if (!j(ImagesContract.URL, readableMap)) {
            if (TextUtils.isEmpty(string)) {
                return;
            }
            f().putExtra("android.intent.extra.TEXT", string);
            return;
        }
        bc.f fVarD = d(readableMap);
        this.f19031d = fVarD;
        if (fVarD.f()) {
            Uri uriD = this.f19031d.d();
            ClipData clipDataNewUri = ClipData.newUri(this.f19028a.getContentResolver(), "File", uriD);
            f().setType(this.f19031d.c());
            f().setClipData(clipDataNewUri);
            f().putExtra("android.intent.extra.STREAM", uriD);
            f().addFlags(1);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            f().putExtra("android.intent.extra.TEXT", string);
            return;
        }
        if (TextUtils.isEmpty(string)) {
            f().putExtra("android.intent.extra.TEXT", readableMap.getString(ImagesContract.URL));
            return;
        }
        f().putExtra("android.intent.extra.TEXT", string + " " + readableMap.getString(ImagesContract.URL));
    }

    protected void m() {
        Intent intentCreateChooser;
        IntentSender intentSenderC;
        Activity currentActivity = this.f19028a.getCurrentActivity();
        if (currentActivity == null) {
            q.a("Something went wrong");
            return;
        }
        if (q.d()) {
            intentSenderC = q.c(this.f19028a);
            intentCreateChooser = Intent.createChooser(f(), this.f19030c, intentSenderC);
        } else {
            intentCreateChooser = Intent.createChooser(f(), this.f19030c);
            intentSenderC = null;
        }
        intentCreateChooser.addFlags(1073741824);
        if (j("showAppsToView", this.f19032e) && j(ImagesContract.URL, this.f19032e)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setType(this.f19031d.c());
            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", g(intent, this.f19031d.d()));
        }
        if (j("excludedActivityTypes", this.f19032e)) {
            intentCreateChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", c(this.f19032e.getArray("excludedActivityTypes")));
            currentActivity.startActivityForResult(intentCreateChooser, 16845);
        } else {
            currentActivity.startActivityForResult(intentCreateChooser, 16845);
        }
        if (intentSenderC == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("success", true);
            writableMapCreateMap.putString("message", "OK");
            q.b(writableMapCreateMap);
        }
    }

    protected void n(Intent intent) {
        this.f19029b = intent;
    }
}
