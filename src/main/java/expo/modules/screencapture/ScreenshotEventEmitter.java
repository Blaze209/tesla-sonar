package expo.modules.screencapture;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.util.Log;
import androidx.core.content.b;
import ch.qos.logback.core.CoreConstants;
import expo.modules.core.interfaces.LifecycleEventListener;
import java.util.Locale;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import wn0.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lexpo/modules/screencapture/ScreenshotEventEmitter;", "Lexpo/modules/core/interfaces/LifecycleEventListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function0;", "Ljn0/h0;", "onCapture", "<init>", "(Landroid/content/Context;Lwn0/a;)V", "", "hasPermissions", "(Landroid/content/Context;)Z", "Landroid/net/Uri;", "uri", "", "getFilePathFromContentResolver", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;", "path", "isPathOfNewScreenshot", "(Ljava/lang/String;)Z", "onHostResume", "()V", "onHostPause", "onHostDestroy", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "isListening", "Z", "previousPath", "Ljava/lang/String;", "Landroid/database/ContentObserver;", "contentObserver", "Landroid/database/ContentObserver;", "expo-screen-capture_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenshotEventEmitter implements LifecycleEventListener {
    private final ContentObserver contentObserver;
    private final Context context;
    private boolean isListening;
    private String previousPath;

    public ScreenshotEventEmitter(Context context, final a<h0> onCapture) {
        s.k(context, "context");
        s.k(onCapture, "onCapture");
        this.context = context;
        this.isListening = true;
        this.previousPath = "";
        final Handler handler = new Handler(Looper.getMainLooper());
        this.contentObserver = new ContentObserver(handler) { // from class: expo.modules.screencapture.ScreenshotEventEmitter$contentObserver$1
            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange, Uri uri) {
                super.onChange(selfChange, uri);
                if (this.this$0.isListening) {
                    ScreenshotEventEmitter screenshotEventEmitter = this.this$0;
                    if (!screenshotEventEmitter.hasPermissions(screenshotEventEmitter.getContext())) {
                        Log.e("expo-screen-capture", "Could not listen for screenshots, do not have READ_EXTERNAL_STORAGE permission.");
                        return;
                    }
                    ScreenshotEventEmitter screenshotEventEmitter2 = this.this$0;
                    String filePathFromContentResolver = screenshotEventEmitter2.getFilePathFromContentResolver(screenshotEventEmitter2.getContext(), uri);
                    if (filePathFromContentResolver == null || !this.this$0.isPathOfNewScreenshot(filePathFromContentResolver)) {
                        return;
                    }
                    this.this$0.previousPath = filePathFromContentResolver;
                    onCapture.invoke();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFilePathFromContentResolver(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                cursorQuery.close();
                return string;
            }
        } catch (Exception e11) {
            Log.e("expo-screen-capture", "Error retrieving filepath: " + e11);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasPermissions(Context context) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            return b.checkSelfPermission(context, "android.permission.DETECT_SCREEN_CAPTURE") == 0;
        }
        if (i11 >= 33) {
            return b.checkSelfPermission(context, "android.permission.READ_MEDIA_IMAGES") == 0;
        }
        return b.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPathOfNewScreenshot(String path) {
        Locale locale = Locale.ROOT;
        String lowerCase = path.toLowerCase(locale);
        s.j(lowerCase, "toLowerCase(...)");
        if (t.h0(lowerCase, "screenshot", false, 2, null)) {
            String lowerCase2 = path.toLowerCase(locale);
            s.j(lowerCase2, "toLowerCase(...)");
            if (!t.h0(lowerCase2, ".pending", false, 2, null) && (this.previousPath.length() == 0 || path.compareTo(this.previousPath) != 0)) {
                return true;
            }
        }
        return false;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostDestroy() {
        this.context.getContentResolver().unregisterContentObserver(this.contentObserver);
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostPause() {
        this.isListening = false;
        this.context.getContentResolver().unregisterContentObserver(this.contentObserver);
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostResume() {
        this.isListening = true;
        this.context.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.contentObserver);
    }
}
