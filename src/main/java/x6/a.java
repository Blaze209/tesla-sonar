package x6;

import android.content.Context;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "name", "Lv6/b;", "Ly6/f;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Lu6/f;", "produceMigrations", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/properties/c;", "Lu6/h;", "a", "(Ljava/lang/String;Lv6/b;Lwn0/l;Lkotlinx/coroutines/CoroutineScope;)Lkotlin/properties/c;", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: x6.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/content/Context;", "it", "", "Lu6/f;", "Ly6/f;", "a", "(Landroid/content/Context;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class C2646a extends u implements l<Context, List<? extends u6.f<y6.f>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2646a f122795c = new C2646a();

        C2646a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<u6.f<y6.f>> invoke(Context it) {
            s.k(it, "it");
            return v.m();
        }
    }

    public static final p013kotlin.properties.c<Context, u6.h<y6.f>> a(String name, v6.b<y6.f> bVar, l<? super Context, ? extends List<? extends u6.f<y6.f>>> produceMigrations, CoroutineScope scope) {
        s.k(name, "name");
        s.k(produceMigrations, "produceMigrations");
        s.k(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ p013kotlin.properties.c b(String str, v6.b bVar, l lVar, CoroutineScope coroutineScope, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bVar = null;
        }
        if ((i11 & 4) != 0) {
            lVar = C2646a.f122795c;
        }
        if ((i11 & 8) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        }
        return a(str, bVar, lVar, coroutineScope);
    }
}
