package r00;

import android.media.ExifInterface;
import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import s00.i;
import s00.q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lr00/c;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "imagePath", "Lcom/facebook/react/bridge/ReadableMap;", "optionMap", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "b", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "filePath", "a", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext reactContext;

    public c(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    public final void a(String filePath, Promise promise) {
        s.k(filePath, "filePath");
        s.k(promise, "promise");
        try {
            String strI = q.i(filePath, this.reactContext, new Object[0]);
            String path = Uri.parse(strI).getPath();
            WritableMap writableMapCreateMap = Arguments.createMap();
            double length = new File(path).length();
            s.h(path);
            ExifInterface exifInterface = new ExifInterface(path);
            for (String str : q.f109347a.e()) {
                String attribute = exifInterface.getAttribute(str);
                if (attribute != null) {
                    writableMapCreateMap.putString(str, attribute);
                }
            }
            s.h(strI);
            String strSubstring = strI.substring(t.C0(strI, ".", 0, false, 6, null) + 1);
            s.j(strSubstring, "substring(...)");
            writableMapCreateMap.putDouble("size", length);
            writableMapCreateMap.putString("extension", strSubstring);
            promise.resolve(writableMapCreateMap);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    public final void b(String imagePath, ReadableMap optionMap, Promise promise) {
        s.k(imagePath, "imagePath");
        s.k(optionMap, "optionMap");
        s.k(promise, "promise");
        try {
            b bVarA = b.INSTANCE.a(optionMap);
            String strI = q.i(imagePath, this.reactContext, bVarA.getUuid(), bVarA.getProgressDivider());
            if (bVarA.getCompressionMethod() == b.EnumC2258b.auto) {
                promise.resolve(a.f106319a.a(strI, bVarA, this.reactContext));
            } else {
                promise.resolve(a.f106319a.l(strI, bVarA, this.reactContext));
            }
            i.c(strI);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }
}
