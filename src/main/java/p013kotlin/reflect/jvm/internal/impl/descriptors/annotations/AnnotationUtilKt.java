package p013kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import jn0.x;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes9.dex */
public final class AnnotationUtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Name f86730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Name f86731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Name f86732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Name f86733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Name f86734e;

    static {
        Name nameIdentifier = Name.identifier("message");
        s.j(nameIdentifier, "identifier(...)");
        f86730a = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("replaceWith");
        s.j(nameIdentifier2, "identifier(...)");
        f86731b = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("level");
        s.j(nameIdentifier3, "identifier(...)");
        f86732c = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("expression");
        s.j(nameIdentifier4, "identifier(...)");
        f86733d = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("imports");
        s.j(nameIdentifier5, "identifier(...)");
        f86734e = nameIdentifier5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType b(KotlinBuiltIns kotlinBuiltIns, ModuleDescriptor module) {
        s.k(module, "module");
        SimpleType arrayType = module.getBuiltIns().getArrayType(Variance.INVARIANT, kotlinBuiltIns.getStringType());
        s.j(arrayType, "getArrayType(...)");
        return arrayType;
    }

    public static final AnnotationDescriptor createDeprecatedAnnotation(KotlinBuiltIns kotlinBuiltIns, String message, String replaceWith, String level, boolean z11) {
        s.k(kotlinBuiltIns, "<this>");
        s.k(message, "message");
        s.k(replaceWith, "replaceWith");
        s.k(level, "level");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.replaceWith, v0.m(x.a(f86733d, new StringValue(replaceWith)), x.a(f86734e, new ArrayValue(v.m(), new a(kotlinBuiltIns)))), false, 8, null);
        FqName fqName = StandardNames.FqNames.deprecated;
        Pair pairA = x.a(f86730a, new StringValue(message));
        Pair pairA2 = x.a(f86731b, new AnnotationValue(builtInAnnotationDescriptor));
        Name name = f86732c;
        ClassId classId = ClassId.Companion.topLevel(StandardNames.FqNames.deprecationLevel);
        Name nameIdentifier = Name.identifier(level);
        s.j(nameIdentifier, "identifier(...)");
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, v0.m(pairA, pairA2, x.a(name, new EnumValue(classId, nameIdentifier))), z11);
    }

    public static /* synthetic */ AnnotationDescriptor createDeprecatedAnnotation$default(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        if ((i11 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return createDeprecatedAnnotation(kotlinBuiltIns, str, str2, str3, z11);
    }
}
