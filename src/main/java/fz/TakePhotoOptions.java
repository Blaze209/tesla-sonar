package fz;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import gz.OutputFile;
import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fz.s, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001d"}, d2 = {"Lfz/s;", "", "Lgz/e;", Action.FILE_ATTRIBUTE, "Lfz/f;", "flash", "", "enableShutterSound", "<init>", "(Lgz/e;Lfz/f;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz/e;", "b", "()Lgz/e;", "Lfz/f;", "c", "()Lfz/f;", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TakePhotoOptions {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OutputFile file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final f flash;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enableShutterSound;

    /* JADX INFO: renamed from: fz.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lfz/s$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/bridge/ReadableMap;", "map", "Lfz/s;", "a", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;)Lfz/s;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TakePhotoOptions a(Context context, ReadableMap map) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(map, "map");
            f fVarA = map.hasKey("flash") ? f.INSTANCE.a(map.getString("flash")) : f.OFF;
            boolean z11 = map.hasKey("enableShutterSound") ? map.getBoolean("enableShutterSound") : false;
            File fileA = map.hasKey("path") ? gz.c.INSTANCE.a(map.getString("path")) : context.getCacheDir();
            p013kotlin.jvm.internal.s.h(fileA);
            return new TakePhotoOptions(new OutputFile(context, fileA, ".jpg"), fVarA, z11);
        }

        private Companion() {
        }
    }

    public TakePhotoOptions(OutputFile file, f flash, boolean z11) {
        p013kotlin.jvm.internal.s.k(file, "file");
        p013kotlin.jvm.internal.s.k(flash, "flash");
        this.file = file;
        this.flash = flash;
        this.enableShutterSound = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnableShutterSound() {
        return this.enableShutterSound;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OutputFile getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getFlash() {
        return this.flash;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TakePhotoOptions)) {
            return false;
        }
        TakePhotoOptions takePhotoOptions = (TakePhotoOptions) other;
        return p013kotlin.jvm.internal.s.f(this.file, takePhotoOptions.file) && this.flash == takePhotoOptions.flash && this.enableShutterSound == takePhotoOptions.enableShutterSound;
    }

    public int hashCode() {
        return (((this.file.hashCode() * 31) + this.flash.hashCode()) * 31) + Boolean.hashCode(this.enableShutterSound);
    }

    public String toString() {
        return "TakePhotoOptions(file=" + this.file + ", flash=" + this.flash + ", enableShutterSound=" + this.enableShutterSound + ")";
    }
}
