package kq;

import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.n3;
import p020r2.y3;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0012\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0019R0\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001f\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b\u001b\u0010#¨\u0006%"}, d2 = {"Lkq/c;", "Lkq/a;", "", "Lkq/e;", "mutablePermissions", "<init>", "(Ljava/util/List;)V", "Ljn0/h0;", "a", "()V", "", "", "", "permissionsStatus", "f", "(Ljava/util/Map;)V", "Ljava/util/List;", "Lkq/f;", "b", "c", "()Ljava/util/List;", "permissions", "Lr2/y3;", DateTokenConverter.CONVERTER_KEY, "revokedPermissions", "()Z", "allPermissionsGranted", "e", "getShouldShowRationale", "shouldShowRationale", "Landroidx/activity/result/ActivityResultLauncher;", "", "Landroidx/activity/result/ActivityResultLauncher;", "getLauncher$permissions_release", "()Landroidx/activity/result/ActivityResultLauncher;", "(Landroidx/activity/result/ActivityResultLauncher;)V", "launcher", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements kq.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<e> mutablePermissions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<f> permissions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y3 revokedPermissions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y3 allPermissionsGranted;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y3 shouldShowRationale;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ActivityResultLauncher<String[]> launcher;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<Boolean> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            boolean z11;
            List<f> listC = c.this.c();
            if ((listC instanceof Collection) && listC.isEmpty()) {
                z11 = true;
            } else {
                Iterator<T> it = listC.iterator();
                while (it.hasNext()) {
                    if (!i.g(((f) it.next()).getStatus())) {
                        if (c.this.d().isEmpty()) {
                            break;
                        }
                        z11 = false;
                    }
                }
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lkq/f;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<List<? extends f>> {
        b() {
            super(0);
        }

        @Override // wn0.a
        public final List<? extends f> invoke() {
            List<f> listC = c.this.c();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC) {
                if (!s.f(((f) obj).getStatus(), g.b.f89321a)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: kq.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class C1878c extends u implements wn0.a<Boolean> {
        C1878c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            List<f> listC = c.this.c();
            boolean z11 = false;
            if (!(listC instanceof Collection) || !listC.isEmpty()) {
                Iterator<T> it = listC.iterator();
                while (it.hasNext()) {
                    if (i.f(((f) it.next()).getStatus())) {
                        z11 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z11);
        }
    }

    public c(List<e> mutablePermissions) {
        s.k(mutablePermissions, "mutablePermissions");
        this.mutablePermissions = mutablePermissions;
        this.permissions = mutablePermissions;
        this.revokedPermissions = n3.e(new b());
        this.allPermissionsGranted = n3.e(new a());
        this.shouldShowRationale = n3.e(new C1878c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kq.a
    public void a() {
        h0 h0Var;
        ActivityResultLauncher<String[]> activityResultLauncher = this.launcher;
        if (activityResultLauncher != 0) {
            List<f> listC = c();
            ArrayList arrayList = new ArrayList(v.y(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(((f) it.next()).getPermission());
            }
            activityResultLauncher.b(arrayList.toArray(new String[0]));
            h0Var = h0.f84049a;
        } else {
            h0Var = null;
        }
        if (h0Var == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }

    @Override // kq.a
    public boolean b() {
        return ((Boolean) this.allPermissionsGranted.getValue()).booleanValue();
    }

    public List<f> c() {
        return this.permissions;
    }

    public List<f> d() {
        return (List) this.revokedPermissions.getValue();
    }

    public final void e(ActivityResultLauncher<String[]> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void f(Map<String, Boolean> permissionsStatus) {
        Object next;
        s.k(permissionsStatus, "permissionsStatus");
        for (String str : permissionsStatus.keySet()) {
            Iterator<T> it = this.mutablePermissions.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.f(((e) next).getPermission(), str));
            e eVar = (e) next;
            if (eVar != null && permissionsStatus.get(str) != null) {
                eVar.c();
            }
        }
    }
}
