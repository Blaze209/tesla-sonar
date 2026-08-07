package xo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.annotation.Annotation;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.JsonEncodingException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lro0/q;", "serializer", "actualSerializer", "", "classDiscriminator", "Ljn0/h0;", "e", "(Lro0/q;Lro0/q;Ljava/lang/String;)V", "Lto0/n;", "kind", "b", "(Lto0/n;)V", "Lto0/f;", "Lwo0/b;", "json", "c", "(Lto0/f;Lwo0/b;)Ljava/lang/String;", "serialName", "Lkotlinx/serialization/json/JsonElement;", "element", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Void;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o0 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f123879a;

        static {
            int[] iArr = new int[wo0.a.values().length];
            try {
                iArr[wo0.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wo0.a.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wo0.a.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f123879a = iArr;
        }
    }

    public static final void b(to0.n kind) {
        p013kotlin.jvm.internal.s.k(kind, "kind");
        if (kind instanceof to0.n.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof to0.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof to0.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(to0.f fVar, wo0.b json) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        p013kotlin.jvm.internal.s.k(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof wo0.e) {
                return ((wo0.e) annotation).discriminator();
            }
        }
        return json.getConfiguration().getClassDiscriminator();
    }

    public static final Void d(String str, JsonElement element) {
        p013kotlin.jvm.internal.s.k(element, "element");
        throw new JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + p013kotlin.jvm.internal.o0.b(element.getClass()).l() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ro0.q<?> qVar, ro0.q<?> qVar2, String str) {
        if ((qVar instanceof ro0.m) && vo0.k0.a(qVar2.getDescriptor()).contains(str)) {
            String serialName = ((ro0.m) qVar).getDescriptor().getSerialName();
            throw new IllegalStateException(("Sealed class '" + qVar2.getDescriptor().getSerialName() + "' cannot be serialized as base class '" + serialName + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
