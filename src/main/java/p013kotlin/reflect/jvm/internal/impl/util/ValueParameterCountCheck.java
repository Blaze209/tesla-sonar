package p013kotlin.reflect.jvm.internal.impl.util;

import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ValueParameterCountCheck implements Check {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f89077a;

    public static final class AtLeast extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f89078b;

        public AtLeast(int i11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("must have at least ");
            sb2.append(i11);
            sb2.append(" value parameter");
            sb2.append(i11 > 1 ? "s" : "");
            super(sb2.toString(), null);
            this.f89078b = i11;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            s.k(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() >= this.f89078b;
        }
    }

    public static final class Equals extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f89079b;

        public Equals(int i11) {
            super("must have exactly " + i11 + " value parameters", null);
            this.f89079b = i11;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            s.k(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == this.f89079b;
        }
    }

    public static final class NoValueParameters extends ValueParameterCountCheck {
        public static final NoValueParameters INSTANCE = new NoValueParameters();

        private NoValueParameters() {
            super("must have no value parameters", null);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            s.k(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().isEmpty();
        }
    }

    public static final class SingleValueParameter extends ValueParameterCountCheck {
        public static final SingleValueParameter INSTANCE = new SingleValueParameter();

        private SingleValueParameter() {
            super("must have a single value parameter", null);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            s.k(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == 1;
        }
    }

    public /* synthetic */ ValueParameterCountCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return this.f89077a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
    public String invoke(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }

    private ValueParameterCountCheck(String str) {
        this.f89077a = str;
    }
}
