package f;

import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.ActivityResultRegistry;
import androidx.p002activity.result.contract.ActivityResultContract;
import ezvcard.property.Gender;
import java.util.UUID;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k0;
import p020r2.l0;
import p020r2.n3;
import p020r2.o;
import p020r2.y3;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"I", Gender.OTHER, "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Lkotlin/Function1;", "Ljn0/h0;", "onResult", "Lf/h;", "a", "(Landroidx/activity/result/contract/ActivityResultContract;Lwn0/l;Lr2/l;I)Lf/h;", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"I", Gender.OTHER, "Lr2/l0;", "Lr2/k0;", "b", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a<I> f63695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ActivityResultRegistry f63696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f63697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ActivityResultContract<I, O> f63698f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ y3<l<O, h0>> f63699g;

        /* JADX INFO: renamed from: f.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"f/c$a$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C1303a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f.a f63700a;

            public C1303a(f.a aVar) {
                this.f63700a = aVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f63700a.c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(f.a<I> aVar, ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract<I, O> activityResultContract, y3<? extends l<? super O, h0>> y3Var) {
            super(1);
            this.f63695c = aVar;
            this.f63696d = activityResultRegistry;
            this.f63697e = str;
            this.f63698f = activityResultContract;
            this.f63699g = y3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(y3 y3Var, Object obj) {
            ((l) y3Var.getValue()).invoke(obj);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            f.a<I> aVar = this.f63695c;
            ActivityResultRegistry activityResultRegistry = this.f63696d;
            String str = this.f63697e;
            ActivityResultContract<I, O> activityResultContract = this.f63698f;
            final y3<l<O, h0>> y3Var = this.f63699g;
            aVar.b((ActivityResultLauncher<I>) activityResultRegistry.l(str, activityResultContract, new ActivityResultCallback() { // from class: f.b
                @Override // androidx.p002activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    c.a.c(y3Var, obj);
                }
            }));
            return new C1303a(this.f63695c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", Gender.OTHER, "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f63701c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    public static final <I, O> h<I, O> a(ActivityResultContract<I, O> activityResultContract, l<? super O, h0> lVar, p020r2.l lVar2, int i11) {
        ActivityResultRegistry activityResultRegistry;
        if (o.J()) {
            o.S(-1408504823, i11, -1, "androidx.activity.compose.rememberLauncherForActivityResult (ActivityResultRegistry.kt:82)");
        }
        y3 y3VarO = n3.o(activityResultContract, lVar2, i11 & 14);
        y3 y3VarO2 = n3.o(lVar, lVar2, (i11 >> 3) & 14);
        String str = (String) a3.b.c(new Object[0], null, null, b.f63701c, lVar2, 3072, 6);
        h.d dVarA = f.f63714a.a(lVar2, 6);
        if (dVarA == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        ActivityResultRegistry activityResultRegistry2 = dVarA.getActivityResultRegistry();
        Object objI = lVar2.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI == companion.a()) {
            objI = new f.a();
            lVar2.B(objI);
        }
        f.a aVar = (f.a) objI;
        Object objI2 = lVar2.I();
        if (objI2 == companion.a()) {
            objI2 = new h(aVar, y3VarO);
            lVar2.B(objI2);
        }
        h<I, O> hVar = (h) objI2;
        boolean zK = lVar2.K(aVar) | lVar2.K(activityResultRegistry2) | lVar2.n(str) | lVar2.K(activityResultContract) | lVar2.n(y3VarO2);
        Object objI3 = lVar2.I();
        if (zK || objI3 == companion.a()) {
            activityResultRegistry = activityResultRegistry2;
            Object aVar2 = new a(aVar, activityResultRegistry, str, activityResultContract, y3VarO2);
            lVar2.B(aVar2);
            objI3 = aVar2;
        } else {
            activityResultRegistry = activityResultRegistry2;
        }
        ActivityResultRegistry activityResultRegistry3 = activityResultRegistry;
        Function0.a(activityResultRegistry3, str, activityResultContract, (l) objI3, lVar2, (i11 << 6) & 896);
        if (o.J()) {
            o.R();
        }
        return hVar;
    }
}
