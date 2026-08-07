package fo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lfo0/d3;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "receiver", "Ljn0/h0;", "c", "(Ljava/lang/StringBuilder;Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "callable", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/StringBuilder;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;)V", "descriptor", "", "e", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "k", "(Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "f", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Ljava/lang/String;", "invoke", "h", "Lfo0/x1;", "parameter", "j", "(Lfo0/x1;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "type", "l", "(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "b", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderer", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d3 f66112a = new d3();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final DescriptorRenderer renderer = DescriptorRenderer.FQ_NAMES_IN_TYPES;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66114a;

        static {
            int[] iArr = new int[co0.l.a.values().length];
            try {
                iArr[co0.l.a.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[co0.l.a.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[co0.l.a.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66114a = iArr;
        }
    }

    private d3() {
    }

    private final void c(StringBuilder sb2, ReceiverParameterDescriptor receiverParameterDescriptor) {
        if (receiverParameterDescriptor != null) {
            KotlinType type = receiverParameterDescriptor.getType();
            p013kotlin.jvm.internal.s.j(type, "getType(...)");
            sb2.append(l(type));
            sb2.append(".");
        }
    }

    private final void d(StringBuilder sb2, CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorI = i3.i(callableDescriptor);
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        c(sb2, receiverParameterDescriptorI);
        boolean z11 = (receiverParameterDescriptorI == null || extensionReceiverParameter == null) ? false : true;
        if (z11) {
            sb2.append("(");
        }
        c(sb2, extensionReceiverParameter);
        if (z11) {
            sb2.append(")");
        }
    }

    private final String e(CallableDescriptor descriptor) {
        if (descriptor instanceof PropertyDescriptor) {
            return k((PropertyDescriptor) descriptor);
        }
        if (descriptor instanceof FunctionDescriptor) {
            return f((FunctionDescriptor) descriptor);
        }
        throw new IllegalStateException(("Illegal callable: " + descriptor).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(ValueParameterDescriptor valueParameterDescriptor) {
        d3 d3Var = f66112a;
        KotlinType type = valueParameterDescriptor.getType();
        p013kotlin.jvm.internal.s.j(type, "getType(...)");
        return d3Var.l(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(ValueParameterDescriptor valueParameterDescriptor) {
        d3 d3Var = f66112a;
        KotlinType type = valueParameterDescriptor.getType();
        p013kotlin.jvm.internal.s.j(type, "getType(...)");
        return d3Var.l(type);
    }

    public final String f(FunctionDescriptor descriptor) throws IOException {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        d3 d3Var = f66112a;
        d3Var.d(sb2, descriptor);
        DescriptorRenderer descriptorRenderer = renderer;
        Name name = descriptor.getName();
        p013kotlin.jvm.internal.s.j(name, "getName(...)");
        sb2.append(descriptorRenderer.renderName(name, true));
        List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
        p013kotlin.jvm.internal.s.j(valueParameters, "getValueParameters(...)");
        p013kotlin.collections.g0.v0(valueParameters, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : b3.f66093a);
        sb2.append(": ");
        KotlinType returnType = descriptor.getReturnType();
        p013kotlin.jvm.internal.s.h(returnType);
        sb2.append(d3Var.l(returnType));
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return string;
    }

    public final String h(FunctionDescriptor invoke) throws IOException {
        p013kotlin.jvm.internal.s.k(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        d3 d3Var = f66112a;
        d3Var.d(sb2, invoke);
        List<ValueParameterDescriptor> valueParameters = invoke.getValueParameters();
        p013kotlin.jvm.internal.s.j(valueParameters, "getValueParameters(...)");
        p013kotlin.collections.g0.v0(valueParameters, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : c3.f66105a);
        sb2.append(" -> ");
        KotlinType returnType = invoke.getReturnType();
        p013kotlin.jvm.internal.s.h(returnType);
        sb2.append(d3Var.l(returnType));
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return string;
    }

    public final String j(x1 parameter) {
        p013kotlin.jvm.internal.s.k(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i11 = a.f66114a[parameter.getKind().ordinal()];
        if (i11 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i11 == 2) {
            sb2.append("instance parameter");
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sb2.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        sb2.append(f66112a.e(parameter.m().U()));
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return string;
    }

    public final String k(PropertyDescriptor descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.isVar() ? "var " : "val ");
        d3 d3Var = f66112a;
        d3Var.d(sb2, descriptor);
        DescriptorRenderer descriptorRenderer = renderer;
        Name name = descriptor.getName();
        p013kotlin.jvm.internal.s.j(name, "getName(...)");
        sb2.append(descriptorRenderer.renderName(name, true));
        sb2.append(": ");
        KotlinType type = descriptor.getType();
        p013kotlin.jvm.internal.s.j(type, "getType(...)");
        sb2.append(d3Var.l(type));
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return string;
    }

    public final String l(KotlinType type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        return renderer.renderType(type);
    }
}
