package y6;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import u6.i0;
import u6.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JU\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ly6/e;", "", "<init>", "()V", "Lv6/b;", "Ly6/f;", "corruptionHandler", "", "Lu6/f;", "migrations", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lu6/h;", "b", "(Lv6/b;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lwn0/a;)Lu6/h;", "Lu6/i0;", PlaceTypes.STORAGE, "a", "(Lu6/i0;Lv6/b;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)Lu6/h;", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f125155a = new e();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "b", "()Ljava/io/File;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<File> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<File> f125156c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.a<? extends File> aVar) {
            super(0);
            this.f125156c = aVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File fileInvoke = this.f125156c.invoke();
            if (s.f(sn0.h.C(fileInvoke), "preferences_pb")) {
                File absoluteFile = fileInvoke.getAbsoluteFile();
                s.j(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    private e() {
    }

    public final u6.h<f> a(i0<f> storage, v6.b<f> corruptionHandler, List<? extends u6.f<f>> migrations, CoroutineScope scope) {
        s.k(storage, "storage");
        s.k(migrations, "migrations");
        s.k(scope, "scope");
        return new d(u6.i.f115493a.b(storage, corruptionHandler, migrations, scope));
    }

    public final u6.h<f> b(v6.b<f> corruptionHandler, List<? extends u6.f<f>> migrations, CoroutineScope scope, wn0.a<? extends File> produceFile) {
        s.k(migrations, "migrations");
        s.k(scope, "scope");
        s.k(produceFile, "produceFile");
        return new d(a(new n(h.f125160a, null, new a(produceFile), 2, null), corruptionHandler, migrations, scope));
    }
}
