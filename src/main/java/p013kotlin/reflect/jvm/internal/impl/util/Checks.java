package p013kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.text.q;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class Checks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Name f89057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f89058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection<Name> f89059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l<FunctionDescriptor, String> f89060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Check[] f89061e;

    static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f89062a = new a();

        a() {
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FunctionDescriptor functionDescriptor) {
            s.k(functionDescriptor, "<this>");
            return null;
        }
    }

    static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f89063a = new b();

        b() {
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FunctionDescriptor functionDescriptor) {
            s.k(functionDescriptor, "<this>");
            return null;
        }
    }

    static final class c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f89064a = new c();

        c() {
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FunctionDescriptor functionDescriptor) {
            s.k(functionDescriptor, "<this>");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Checks(Name name, q qVar, Collection<Name> collection, l<? super FunctionDescriptor, String> lVar, Check... checkArr) {
        this.f89057a = name;
        this.f89058b = qVar;
        this.f89059c = collection;
        this.f89060d = lVar;
        this.f89061e = checkArr;
    }

    public final CheckResult checkAll(FunctionDescriptor functionDescriptor) {
        s.k(functionDescriptor, "functionDescriptor");
        for (Check check : this.f89061e) {
            String strInvoke = check.invoke(functionDescriptor);
            if (strInvoke != null) {
                return new CheckResult.IllegalSignature(strInvoke);
            }
        }
        String strInvoke2 = this.f89060d.invoke(functionDescriptor);
        return strInvoke2 != null ? new CheckResult.IllegalSignature(strInvoke2) : CheckResult.SuccessCheck.INSTANCE;
    }

    public final boolean isApplicable(FunctionDescriptor functionDescriptor) {
        s.k(functionDescriptor, "functionDescriptor");
        if (this.f89057a != null && !s.f(functionDescriptor.getName(), this.f89057a)) {
            return false;
        }
        if (this.f89058b != null) {
            String strAsString = functionDescriptor.getName().asString();
            s.j(strAsString, "asString(...)");
            if (!this.f89058b.i(strAsString)) {
                return false;
            }
        }
        Collection<Name> collection = this.f89059c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ Checks(Name name, Check[] checkArr, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, checkArr, (l<? super FunctionDescriptor, String>) ((i11 & 4) != 0 ? a.f89062a : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Name name, Check[] checks, l<? super FunctionDescriptor, String> additionalChecks) {
        this(name, (q) null, (Collection<Name>) null, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        s.k(name, "name");
        s.k(checks, "checks");
        s.k(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(q qVar, Check[] checkArr, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, checkArr, (l<? super FunctionDescriptor, String>) ((i11 & 4) != 0 ? b.f89063a : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(q regex, Check[] checks, l<? super FunctionDescriptor, String> additionalChecks) {
        this((Name) null, regex, (Collection<Name>) null, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        s.k(regex, "regex");
        s.k(checks, "checks");
        s.k(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(Collection collection, Check[] checkArr, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((Collection<Name>) collection, checkArr, (l<? super FunctionDescriptor, String>) ((i11 & 4) != 0 ? c.f89064a : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Collection<Name> nameList, Check[] checks, l<? super FunctionDescriptor, String> additionalChecks) {
        this((Name) null, (q) null, nameList, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        s.k(nameList, "nameList");
        s.k(checks, "checks");
        s.k(additionalChecks, "additionalChecks");
    }
}
