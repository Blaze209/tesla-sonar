package com.documentscanner;

import android.app.Activity;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.contract.ActivityResultContracts$StartIntentSenderForResult;
import com.documentscanner.DocumentScannerModule;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import expo.modules.interfaces.permissions.PermissionsResponse;
import h.e;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;
import xn.a;
import yx.b;
import yx.c;
import yx.d;

/* JADX INFO: loaded from: classes3.dex */
@a(name = "DocumentScanner")
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/documentscanner/DocumentScannerModule;", "Lcom/documentscanner/NativeDocumentScannerSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Landroid/app/Activity;", "currentActivity", "Landroid/net/Uri;", "croppedImageUri", "", "quality", "getImageInBase64", "(Landroid/app/Activity;Landroid/net/Uri;I)Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "scanDocument", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "Companion", "a", "react-native-document-scanner-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DocumentScannerModule extends NativeDocumentScannerSpec {
    public static final String NAME = "DocumentScanner";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentScannerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scanDocument$lambda$0(ReadableMap readableMap, DocumentScannerModule documentScannerModule, Activity activity, int i11, Promise promise, WritableMap writableMap, h.a aVar) {
        List<d.a> listB;
        if (aVar.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.RESULT_CODE java.lang.String() != -1) {
            if (aVar.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.RESULT_CODE java.lang.String() == 0) {
                writableMap.putString(PermissionsResponse.STATUS_KEY, "cancel");
                promise.resolve(writableMap);
                return;
            }
            return;
        }
        d dVarA = d.a(aVar.getData());
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (dVarA != null && (listB = dVarA.b()) != null) {
            Iterator<d.a> it = listB.iterator();
            while (it.hasNext()) {
                Uri uriA = it.next().a();
                s.j(uriA, "getImageUri(...)");
                String string = uriA.toString();
                if (readableMap.hasKey("responseType") && Objects.equals(readableMap.getString("responseType"), "base64")) {
                    try {
                        string = documentScannerModule.getImageInBase64(activity, uriA, i11);
                    } catch (FileNotFoundException e11) {
                        promise.reject("document scan error", e11.getMessage());
                    }
                }
                writableNativeArray.pushString(string);
            }
        }
        writableMap.putArray("scannedImages", writableNativeArray);
        writableMap.putString(PermissionsResponse.STATUS_KEY, "success");
        promise.resolve(writableMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 scanDocument$lambda$1(ActivityResultLauncher activityResultLauncher, IntentSender intentSender) {
        s.h(intentSender);
        activityResultLauncher.b(new e.a(intentSender).a());
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scanDocument$lambda$3(Promise promise, Exception error) {
        s.k(error, "error");
        promise.reject("document scan error", error.getMessage());
    }

    public final String getImageInBase64(Activity currentActivity, Uri croppedImageUri, int quality) {
        s.k(currentActivity, "currentActivity");
        s.k(croppedImageUri, "croppedImageUri");
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(currentActivity.getContentResolver().openInputStream(croppedImageUri));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        s.j(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @Override // com.documentscanner.NativeDocumentScannerSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DocumentScanner";
    }

    @Override // com.documentscanner.NativeDocumentScannerSpec
    public void scanDocument(final ReadableMap options, final Promise promise) {
        s.k(options, "options");
        s.k(promise, "promise");
        final Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        final WritableNativeMap writableNativeMap = new WritableNativeMap();
        b.a aVarD = new b.a().c(101, new int[0]).d(1);
        s.j(aVarD, "setScannerMode(...)");
        if (options.hasKey("maxNumDocuments")) {
            aVarD.b(options.getInt("maxNumDocuments"));
        }
        final int i11 = options.hasKey("croppedImageQuality") ? options.getInt("croppedImageQuality") : 100;
        yx.a aVarA = c.a(aVarD.a());
        s.j(aVarA, "getClient(...)");
        s.i(currentActivity, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        final ActivityResultLauncher activityResultLauncherL = ((ComponentActivity) currentActivity).getActivityResultRegistry().l("document-scanner", new ActivityResultContracts$StartIntentSenderForResult(), new ActivityResultCallback() { // from class: hk.a
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DocumentScannerModule.scanDocument$lambda$0(options, this, currentActivity, i11, promise, writableNativeMap, (h.a) obj);
            }
        });
        s.j(activityResultLauncherL, "register(...)");
        Task<IntentSender> taskC = aVarA.c(currentActivity);
        final l lVar = new l() { // from class: hk.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return DocumentScannerModule.scanDocument$lambda$1(activityResultLauncherL, (IntentSender) obj);
            }
        };
        taskC.addOnSuccessListener(new OnSuccessListener() { // from class: hk.c
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                lVar.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: hk.d
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                DocumentScannerModule.scanDocument$lambda$3(promise, exc);
            }
        });
    }
}
