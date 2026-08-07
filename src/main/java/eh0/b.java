package eh0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import sn0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Leh0/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "", "e", "c", "(Ljava/lang/Throwable;)V", "g", "b", "", "a", "Z", "isExceptionHandlerRegistered", "isErrorHandlerEnabled", "Llg0/a;", "Llg0/a;", "exceptionLogger", "", "Ljava/io/File;", "Ljava/util/List;", "getDirectoriesToDeleteOnError", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "directoriesToDeleteOnError", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isExceptionHandlerRegistered;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isErrorHandlerEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final lg0.a exceptionLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<? extends File> directoriesToDeleteOnError;

    public b(Context context) {
        s.k(context, "context");
        this.isErrorHandlerEnabled = true;
        this.exceptionLogger = new lg0.a(context);
        this.directoriesToDeleteOnError = v.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(b bVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th2) {
        s.h(th2);
        bVar.c(th2);
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            System.exit(1);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    public final void b() {
        this.exceptionLogger.a();
    }

    public final void c(Throwable e11) {
        s.k(e11, "e");
        if (this.isErrorHandlerEnabled) {
            try {
                this.exceptionLogger.g(e11);
            } catch (Exception unused) {
            }
            try {
                Iterator<T> it = this.directoriesToDeleteOnError.iterator();
                while (it.hasNext()) {
                    h.B((File) it.next());
                }
            } catch (Exception unused2) {
            }
        }
    }

    public final synchronized void d() {
        if (this.isExceptionHandlerRegistered) {
            return;
        }
        this.isExceptionHandlerRegistered = true;
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: eh0.a
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                b.e(this.f62959a, defaultUncaughtExceptionHandler, thread, th2);
            }
        });
    }

    public final void f(List<? extends File> list) {
        s.k(list, "<set-?>");
        this.directoriesToDeleteOnError = list;
    }

    public final synchronized void g() {
        if (this.isExceptionHandlerRegistered) {
            this.isErrorHandlerEnabled = false;
        }
    }
}
