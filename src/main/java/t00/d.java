package t00;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import s00.q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lt00/d;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "fileUrl", "Lcom/facebook/react/bridge/ReadableMap;", "optionMap", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "c", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "uuid", "b", "(Ljava/lang/String;)V", "options", "a", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", DateTokenConverter.CONVERTER_KEY, "filePath", "e", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext reactContext;

    public d(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    public final void a(ReadableMap options, Promise promise) {
        s.k(options, "options");
        s.k(promise, "promise");
        try {
            promise.resolve(c.INSTANCE.e(options, this.reactContext));
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    public final void b(String uuid) {
        s.k(uuid, "uuid");
        q.f109347a.a(uuid);
        Log.d("cancelCompression", uuid);
    }

    public final void c(String fileUrl, ReadableMap optionMap, Promise promise) {
        s.k(fileUrl, "fileUrl");
        s.k(optionMap, "optionMap");
        s.k(promise, "promise");
        c.Companion bVar = c.INSTANCE;
        c cVarD = bVar.d(optionMap);
        String strI = q.i(fileUrl, this.reactContext, cVarD.getUuid(), cVarD.getProgressDivider());
        if (cVarD.getCompressionMethod() == c.EnumC2388c.auto) {
            bVar.b(strI, cVarD, promise, this.reactContext);
        } else {
            bVar.c(strI, cVarD, promise, this.reactContext);
        }
    }

    public final void d(ReadableMap options, Promise promise) {
        s.k(options, "options");
        s.k(promise, "promise");
        try {
            promise.resolve(c.INSTANCE.g(options, this.reactContext));
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    public final void e(String filePath, Promise promise) {
        s.k(filePath, "filePath");
        s.k(promise, "promise");
        try {
            String strI = q.i(filePath, this.reactContext, new Object[0]);
            String path = Uri.parse(strI).getPath();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(path);
            double length = new File(path).length();
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
            s.h(strExtractMetadata);
            int i11 = Integer.parseInt(strExtractMetadata);
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
            s.h(strExtractMetadata2);
            int i12 = Integer.parseInt(strExtractMetadata2);
            String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
            s.h(strExtractMetadata3);
            double d11 = Double.parseDouble(strExtractMetadata3);
            String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(5);
            s.h(strI);
            String strSubstring = strI.substring(t.C0(strI, ".", 0, false, 6, null) + 1);
            s.j(strSubstring, "substring(...)");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("size", length);
            writableMapCreateMap.putInt(Snapshot.WIDTH, i12);
            writableMapCreateMap.putInt(Snapshot.HEIGHT, i11);
            writableMapCreateMap.putDouble("duration", d11 / ((double) 1000));
            writableMapCreateMap.putString("extension", strSubstring);
            writableMapCreateMap.putString("creationTime", String.valueOf(strExtractMetadata4));
            promise.resolve(writableMapCreateMap);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }
}
