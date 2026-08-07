package bn0;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class a extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f17835d = a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f17836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ReentrantLock f17837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Condition f17838c;

    /* JADX INFO: renamed from: bn0.a$a, reason: collision with other inner class name */
    class C0357a implements FileFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Pattern f17839a;

        C0357a(Pattern pattern) {
            this.f17839a = pattern;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return this.f17839a.matcher(file.getName()).matches();
        }
    }

    private a(int i11, int i12) {
        super(i11, i12, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f17837b = reentrantLock;
        this.f17838c = reentrantLock.newCondition();
    }

    @SuppressFBWarnings({"DMI_HARDCODED_ABSOLUTE_FILENAME"})
    private static int a() {
        int iB = b("/sys/devices/system/cpu/", "cpu[0-9]+");
        if (iB <= 0) {
            iB = Runtime.getRuntime().availableProcessors();
        }
        if (iB <= 0) {
            return 1;
        }
        return (iB * 2) + 1;
    }

    private static int b(String str, String str2) {
        try {
            File[] fileArrListFiles = new File(str).listFiles(new C0357a(Pattern.compile(str2)));
            if (fileArrListFiles == null) {
                return 0;
            }
            return fileArrListFiles.length;
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static a d() {
        int i11 = f17835d;
        return new a(i11, i11);
    }

    public static a e() {
        return new a(1, 1);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.f17837b.lock();
        while (this.f17836a) {
            try {
                try {
                    this.f17838c.await();
                } catch (InterruptedException unused) {
                    thread.interrupt();
                }
            } catch (Throwable th2) {
                this.f17837b.unlock();
                throw th2;
            }
        }
        this.f17837b.unlock();
    }
}
