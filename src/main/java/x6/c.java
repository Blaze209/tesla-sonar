package x6;

import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co0.m;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R,\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lx6/c;", "Lkotlin/properties/c;", "Landroid/content/Context;", "Lu6/h;", "Ly6/f;", "", "name", "Lv6/b;", "corruptionHandler", "Lkotlin/Function1;", "", "Lu6/f;", "produceMigrations", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Ljava/lang/String;Lv6/b;Lwn0/l;Lkotlinx/coroutines/CoroutineScope;)V", "thisRef", "Lco0/m;", "property", "b", "(Landroid/content/Context;Lco0/m;)Lu6/h;", "a", "Ljava/lang/String;", "Lv6/b;", "c", "Lwn0/l;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CoroutineScope;", "", "e", "Ljava/lang/Object;", "lock", "f", "Lu6/h;", "INSTANCE", "datastore-preferences_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements p013kotlin.properties.c<Context, u6.h<y6.f>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v6.b<y6.f> corruptionHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l<Context, List<u6.f<y6.f>>> produceMigrations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile u6.h<y6.f> INSTANCE;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "b", "()Ljava/io/File;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<File> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f122802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f122803d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f122802c = context;
            this.f122803d = cVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f122802c;
            s.j(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f122803d.name);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(String name, v6.b<y6.f> bVar, l<? super Context, ? extends List<? extends u6.f<y6.f>>> produceMigrations, CoroutineScope scope) {
        s.k(name, "name");
        s.k(produceMigrations, "produceMigrations");
        s.k(scope, "scope");
        this.name = name;
        this.corruptionHandler = bVar;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // p013kotlin.properties.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u6.h<y6.f> getValue(Context thisRef, m<?> property) {
        u6.h<y6.f> hVar;
        s.k(thisRef, "thisRef");
        s.k(property, "property");
        u6.h<y6.f> hVar2 = this.INSTANCE;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    y6.e eVar = y6.e.f125155a;
                    v6.b<y6.f> bVar = this.corruptionHandler;
                    l<Context, List<u6.f<y6.f>>> lVar = this.produceMigrations;
                    s.j(applicationContext, "applicationContext");
                    this.INSTANCE = eVar.b(bVar, lVar.invoke(applicationContext), this.scope, new a(applicationContext, this));
                }
                hVar = this.INSTANCE;
                s.h(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
