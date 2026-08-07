package va;

import android.content.Context;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\u000e\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lva/m;", "Lza/d;", "Landroidx/room/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "", "databaseVersion", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILza/d;)V", "", "writable", "Ljn0/h0;", "p", "(Z)V", "destinationFile", "c", "(Ljava/io/File;Z)V", "databaseFile", "n", "enabled", "setWriteAheadLoggingEnabled", "close", "()V", "Landroidx/room/e;", "databaseConfiguration", "o", "(Landroidx/room/e;)V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "Ljava/io/File;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Callable;", "e", "I", "f", "Lza/d;", "getDelegate", "()Lza/d;", "g", "Landroidx/room/e;", "h", "Z", "verified", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lza/c;", "getWritableDatabase", "()Lza/c;", "writableDatabase", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m implements za.d, androidx.room.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String copyFromAssetPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final File copyFromFile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Callable<InputStream> copyFromInputStream;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int databaseVersion;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final za.d delegate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private androidx.room.e databaseConfiguration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean verified;

    public m(Context context, String str, File file, Callable<InputStream> callable, int i11, za.d delegate) {
        s.k(context, "context");
        s.k(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i11;
        this.delegate = delegate;
    }

    private final void c(File destinationFile, boolean writable) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.copyFromAssetPath != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
        } else if (this.copyFromFile != null) {
            readableByteChannelNewChannel = new FileInputStream(this.copyFromFile).getChannel();
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
            } catch (Exception e11) {
                throw new IOException("inputStreamCallable exception on call", e11);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        s.h(channel);
        wa.e.a(readableByteChannelNewChannel, channel);
        File parentFile = destinationFile.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + destinationFile.getAbsolutePath());
        }
        s.h(fileCreateTempFile);
        n(fileCreateTempFile, writable);
        if (fileCreateTempFile.renameTo(destinationFile)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + destinationFile.getAbsolutePath() + ").");
    }

    private final void n(File databaseFile, boolean writable) {
        androidx.room.e eVar = this.databaseConfiguration;
        if (eVar == null) {
            s.B("databaseConfiguration");
            eVar = null;
        }
        eVar.getClass();
    }

    private final void p(boolean writable) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.context.getDatabasePath(databaseName);
        androidx.room.e eVar = this.databaseConfiguration;
        androidx.room.e eVar2 = null;
        if (eVar == null) {
            s.B("databaseConfiguration");
            eVar = null;
        }
        bb.a aVar = new bb.a(databaseName, this.context.getFilesDir(), eVar.multiInstanceInvalidation);
        try {
            bb.a.c(aVar, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    s.h(databasePath);
                    c(databasePath, writable);
                    aVar.d();
                    return;
                } catch (IOException e11) {
                    throw new RuntimeException("Unable to copy database file.", e11);
                }
            }
            try {
                s.h(databasePath);
                int iH = wa.b.h(databasePath);
                if (iH == this.databaseVersion) {
                    aVar.d();
                    return;
                }
                androidx.room.e eVar3 = this.databaseConfiguration;
                if (eVar3 == null) {
                    s.B("databaseConfiguration");
                } else {
                    eVar2 = eVar3;
                }
                if (eVar2.e(iH, this.databaseVersion)) {
                    aVar.d();
                    return;
                }
                if (this.context.deleteDatabase(databaseName)) {
                    try {
                        c(databasePath, writable);
                        h0 h0Var = h0.f84049a;
                    } catch (IOException e12) {
                        Log.w("ROOM", "Unable to copy database file.", e12);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.d();
                return;
            } catch (IOException e13) {
                Log.w("ROOM", "Unable to read database version.", e13);
                aVar.d();
                return;
            }
        } catch (Throwable th2) {
            aVar.d();
            throw th2;
        }
        aVar.d();
        throw th2;
    }

    @Override // za.d, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    @Override // za.d
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // androidx.room.f
    public za.d getDelegate() {
        return this.delegate;
    }

    @Override // za.d
    public za.c getWritableDatabase() {
        if (!this.verified) {
            p(true);
            this.verified = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public final void o(androidx.room.e databaseConfiguration) {
        s.k(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // za.d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        getDelegate().setWriteAheadLoggingEnabled(enabled);
    }
}
