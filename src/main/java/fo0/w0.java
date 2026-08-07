package fo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import p013kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001,B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R'\u00104\u001a\u0012\u0012\u000e\u0012\f0/R\b\u0012\u0004\u0012\u00028\u00000\u00000.8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000206058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010?\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010)R\u0016\u0010A\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010)R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000B0\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010<R\u0016\u0010G\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020H058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u00108R\u0014\u0010K\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010LR\u0014\u0010O\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010LR\u0014\u0010R\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020U8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020U8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010W¨\u0006["}, d2 = {"Lfo0/w0;", "", "T", "Lfo0/c1;", "Lco0/d;", "Lfo0/x0;", "Lfo0/w2;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "classId", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", Gender.OTHER, "(Lkotlin/reflect/jvm/internal/impl/name/ClassId;Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;)Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", Gender.NONE, "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "E", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "A", "", "index", "B", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "value", "", "j", "(Ljava/lang/Object;)Z", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Class;", "a", "()Ljava/lang/Class;", "Lkotlin/Lazy;", "Lfo0/w0$a;", "e", "Lkotlin/Lazy;", "R", "()Lkotlin/Lazy;", "data", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "z", "()Ljava/util/Collection;", "constructorDescriptors", "l", "simpleName", "c", "qualifiedName", "Lco0/h;", "getConstructors", "constructors", "f", "()Ljava/lang/Object;", "objectInstance", "Lco0/q;", "getSupertypes", "supertypes", "isAbstract", "()Z", "isSealed", "isInner", "isValue", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w0<T> extends c1 implements co0.d<T>, x0, w2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Class<T> jClass;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy<w0<T>.a> data;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u0018R-\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001d8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R%\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010!R#\u0010.\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010#\u001a\u0004\b+\u0010,R!\u00102\u001a\b\u0012\u0004\u0012\u00020/0\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\f\u001a\u0004\b1\u0010\u0014R!\u00106\u001a\b\u0012\u0004\u0012\u0002030\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b5\u0010\u0014R)\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000%0\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\f\u001a\u0004\b8\u0010\u0014R%\u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\f\u001a\u0004\b<\u0010!R%\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\f\u001a\u0004\b?\u0010!R%\u0010C\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\f\u001a\u0004\bB\u0010!R%\u0010F\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\f\u001a\u0004\bE\u0010!R%\u0010I\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\f\u001a\u0004\bH\u0010!R%\u0010L\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\f\u001a\u0004\bK\u0010!R%\u0010O\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\f\u001a\u0004\bN\u0010!R%\u0010R\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u0010\f\u001a\u0004\bQ\u0010!¨\u0006S"}, d2 = {"Lfo0/w0$a;", "Lfo0/c1$b;", "Lfo0/c1;", "<init>", "(Lfo0/w0;)V", "Ljava/lang/Class;", "jClass", "", "B", "(Ljava/lang/Class;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", DateTokenConverter.CONVERTER_KEY, "Lfo0/z2$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "e", "J", "()Ljava/util/List;", "annotations", "f", "S", "()Ljava/lang/String;", "simpleName", "g", "R", "qualifiedName", "", "Lco0/h;", "h", "K", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lco0/d;", IntegerTokenConverter.CONVERTER_KEY, "getNestedClasses", "nestedClasses", "j", "Lkotlin/Lazy;", "Q", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lco0/r;", "k", "getTypeParameters", "typeParameters", "Lco0/q;", "l", "T", "supertypes", "m", "getSealedSubclasses", "sealedSubclasses", "Lfo0/a0;", "n", "L", "declaredNonStaticMembers", "o", Gender.MALE, "declaredStaticMembers", "p", Gender.OTHER, "inheritedNonStaticMembers", "q", "P", "inheritedStaticMembers", "r", "H", "allNonStaticMembers", "s", "I", "allStaticMembers", "t", "getDeclaredMembers", "declaredMembers", "u", "getAllMembers", "allMembers", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends c1.b {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        static final /* synthetic */ co0.m<Object>[] f66272w = {p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "annotations", "getAnnotations()Ljava/util/List;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final z2.a descriptor;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z2.a annotations;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z2.a simpleName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final z2.a qualifiedName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final z2.a constructors;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final z2.a nestedClasses;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final Lazy objectInstance;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final z2.a typeParameters;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final z2.a supertypes;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final z2.a sealedSubclasses;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final z2.a declaredNonStaticMembers;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final z2.a declaredStaticMembers;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final z2.a inheritedNonStaticMembers;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final z2.a inheritedStaticMembers;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final z2.a allNonStaticMembers;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final z2.a allStaticMembers;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final z2.a declaredMembers;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final z2.a allMembers;

        public a() {
            super();
            this.descriptor = z2.c(new c0(w0.this));
            this.annotations = z2.c(new n0(this));
            this.simpleName = z2.c(new o0(w0.this, this));
            this.qualifiedName = z2.c(new p0(w0.this));
            this.constructors = z2.c(new q0(w0.this));
            this.nestedClasses = z2.c(new r0(this));
            this.objectInstance = jn0.m.a(jn0.p.PUBLICATION, new s0(this, w0.this));
            this.typeParameters = z2.c(new t0(this, w0.this));
            this.supertypes = z2.c(new u0(this, w0.this));
            this.sealedSubclasses = z2.c(new v0(this));
            this.declaredNonStaticMembers = z2.c(new d0(w0.this));
            this.declaredStaticMembers = z2.c(new e0(w0.this));
            this.inheritedNonStaticMembers = z2.c(new f0(w0.this));
            this.inheritedStaticMembers = z2.c(new g0(w0.this));
            this.allNonStaticMembers = z2.c(new h0(this));
            this.allStaticMembers = z2.c(new i0(this));
            this.declaredMembers = z2.c(new j0(this));
            this.allMembers = z2.c(new k0(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List A(a aVar) {
            return i3.e(aVar.N());
        }

        private final String B(Class<?> jClass) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                p013kotlin.jvm.internal.s.h(simpleName);
                return p013kotlin.text.t.r1(simpleName, enclosingMethod.getName() + CoreConstants.DOLLAR, null, 2, null);
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                p013kotlin.jvm.internal.s.h(simpleName);
                return p013kotlin.text.t.q1(simpleName, CoreConstants.DOLLAR, null, 2, null);
            }
            p013kotlin.jvm.internal.s.h(simpleName);
            return p013kotlin.text.t.r1(simpleName, enclosingConstructor.getName() + CoreConstants.DOLLAR, null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List C(w0 w0Var) {
            Collection<ConstructorDescriptor> collectionZ = w0Var.z();
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(collectionZ, 10));
            Iterator<T> it = collectionZ.iterator();
            while (it.hasNext()) {
                arrayList.add(new h1(w0Var, (ConstructorDescriptor) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List D(a aVar) {
            return p013kotlin.collections.v.P0(aVar.L(), aVar.M());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection E(w0 w0Var) {
            return w0Var.C(w0Var.T(), c1.d.DECLARED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection F(w0 w0Var) {
            return w0Var.C(w0Var.U(), c1.d.DECLARED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ClassDescriptor G(w0 w0Var) {
            ClassId classIdQ = w0Var.Q();
            RuntimeModuleData runtimeModuleDataB = w0Var.R().getValue().b();
            ClassDescriptor classDescriptorDeserializeClass = (classIdQ.isLocal() && w0Var.a().isAnnotationPresent(Metadata.class)) ? runtimeModuleDataB.getDeserialization().deserializeClass(classIdQ) : FindClassInModuleKt.findClassAcrossModuleDependencies(runtimeModuleDataB.getModule(), classIdQ);
            return classDescriptorDeserializeClass == null ? w0Var.O(classIdQ, runtimeModuleDataB) : classDescriptorDeserializeClass;
        }

        private final Collection<a0<?>> M() {
            T tB = this.declaredStaticMembers.b(this, f66272w[10]);
            p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
            return (Collection) tB;
        }

        private final Collection<a0<?>> O() {
            T tB = this.inheritedNonStaticMembers.b(this, f66272w[11]);
            p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
            return (Collection) tB;
        }

        private final Collection<a0<?>> P() {
            T tB = this.inheritedStaticMembers.b(this, f66272w[12]);
            p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
            return (Collection) tB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection U(w0 w0Var) {
            return w0Var.C(w0Var.T(), c1.d.INHERITED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection V(w0 w0Var) {
            return w0Var.C(w0Var.U(), c1.d.INHERITED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List W(a aVar) {
            Collection contributedDescriptors$default = ResolutionScope.DefaultImpls.getContributedDescriptors$default(aVar.N().getUnsubstitutedInnerClassesScope(), null, null, 3, null);
            ArrayList<DeclarationDescriptor> arrayList = new ArrayList();
            for (T t11 : contributedDescriptors$default) {
                if (!DescriptorUtils.isEnumEntry((DeclarationDescriptor) t11)) {
                    arrayList.add(t11);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (DeclarationDescriptor declarationDescriptor : arrayList) {
                ClassDescriptor classDescriptor = declarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptor : null;
                Class<?> clsQ = classDescriptor != null ? i3.q(classDescriptor) : null;
                w0 w0Var = clsQ != null ? new w0(clsQ) : null;
                if (w0Var != null) {
                    arrayList2.add(w0Var);
                }
            }
            return arrayList2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object X(a aVar, w0 w0Var) throws IllegalAccessException {
            ClassDescriptor classDescriptorN = aVar.N();
            if (classDescriptorN.getKind() != ClassKind.OBJECT) {
                return null;
            }
            Object obj = ((!classDescriptorN.isCompanionObject() || CompanionObjectMappingUtilsKt.isMappedIntrinsicCompanionObject(CompanionObjectMapping.INSTANCE, classDescriptorN)) ? w0Var.a().getDeclaredField("INSTANCE") : w0Var.a().getEnclosingClass().getDeclaredField(classDescriptorN.getName().asString())).get(null);
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl.Data.objectInstance_delegate$lambda$11");
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String Y(w0 w0Var) {
            if (w0Var.a().isAnonymousClass()) {
                return null;
            }
            ClassId classIdQ = w0Var.Q();
            if (classIdQ.isLocal()) {
                return null;
            }
            return classIdQ.asSingleFqName().asString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List Z(a aVar) {
            Collection<ClassDescriptor> sealedSubclasses = aVar.N().getSealedSubclasses();
            p013kotlin.jvm.internal.s.j(sealedSubclasses, "getSealedSubclasses(...)");
            ArrayList arrayList = new ArrayList();
            for (ClassDescriptor classDescriptor : sealedSubclasses) {
                p013kotlin.jvm.internal.s.i(classDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class<?> clsQ = i3.q(classDescriptor);
                w0 w0Var = clsQ != null ? new w0(clsQ) : null;
                if (w0Var != null) {
                    arrayList.add(w0Var);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a0(w0 w0Var, a aVar) {
            if (w0Var.a().isAnonymousClass()) {
                return null;
            }
            ClassId classIdQ = w0Var.Q();
            if (classIdQ.isLocal()) {
                return aVar.B(w0Var.a());
            }
            String strAsString = classIdQ.getShortClassName().asString();
            p013kotlin.jvm.internal.s.j(strAsString, "asString(...)");
            return strAsString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List b0(a aVar, w0 w0Var) {
            Collection<KotlinType> supertypes = aVar.N().getTypeConstructor().getSupertypes();
            p013kotlin.jvm.internal.s.j(supertypes, "getSupertypes(...)");
            ArrayList arrayList = new ArrayList(supertypes.size());
            for (KotlinType kotlinType : supertypes) {
                p013kotlin.jvm.internal.s.h(kotlinType);
                arrayList.add(new t2(kotlinType, new l0(kotlinType, aVar, w0Var)));
            }
            if (!KotlinBuiltIns.isSpecialClassWithNoSupertypes(aVar.N())) {
                if (arrayList.isEmpty()) {
                    SimpleType anyType = DescriptorUtilsKt.getBuiltIns(aVar.N()).getAnyType();
                    p013kotlin.jvm.internal.s.j(anyType, "getAnyType(...)");
                    arrayList.add(new t2(anyType, m0.f66186a));
                } else {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        ClassKind kind = DescriptorUtils.getClassDescriptorForType(((t2) it.next()).getType()).getKind();
                        p013kotlin.jvm.internal.s.j(kind, "getKind(...)");
                        if (kind == ClassKind.INTERFACE || kind == ClassKind.ANNOTATION_CLASS) {
                        }
                    }
                    SimpleType anyType2 = DescriptorUtilsKt.getBuiltIns(aVar.N()).getAnyType();
                    p013kotlin.jvm.internal.s.j(anyType2, "getAnyType(...)");
                    arrayList.add(new t2(anyType2, m0.f66186a));
                }
            }
            return CollectionsKt.compact(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Type c0(KotlinType kotlinType, a aVar, w0 w0Var) {
            ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = kotlinType.getConstructor().mo500getDeclarationDescriptor();
            if (!(classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor)) {
                throw new x2("Supertype not a class: " + classifierDescriptorMo500getDeclarationDescriptor);
            }
            Class<?> clsQ = i3.q((ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor);
            if (clsQ == null) {
                throw new x2("Unsupported superclass of " + aVar + ": " + classifierDescriptorMo500getDeclarationDescriptor);
            }
            if (p013kotlin.jvm.internal.s.f(w0Var.a().getSuperclass(), clsQ)) {
                Type genericSuperclass = w0Var.a().getGenericSuperclass();
                p013kotlin.jvm.internal.s.h(genericSuperclass);
                return genericSuperclass;
            }
            Class<?>[] interfaces = w0Var.a().getInterfaces();
            p013kotlin.jvm.internal.s.j(interfaces, "getInterfaces(...)");
            int iC0 = p013kotlin.collections.n.C0(interfaces, clsQ);
            if (iC0 >= 0) {
                Type type = w0Var.a().getGenericInterfaces()[iC0];
                p013kotlin.jvm.internal.s.h(type);
                return type;
            }
            throw new x2("No superclass of " + aVar + " in Java reflection for " + classifierDescriptorMo500getDeclarationDescriptor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Type d0() {
            return Object.class;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List e0(a aVar, w0 w0Var) {
            List<TypeParameterDescriptor> declaredTypeParameters = aVar.N().getDeclaredTypeParameters();
            p013kotlin.jvm.internal.s.j(declaredTypeParameters, "getDeclaredTypeParameters(...)");
            List<TypeParameterDescriptor> list = declaredTypeParameters;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            for (TypeParameterDescriptor typeParameterDescriptor : list) {
                p013kotlin.jvm.internal.s.h(typeParameterDescriptor);
                arrayList.add(new v2(w0Var, typeParameterDescriptor));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List x(a aVar) {
            return p013kotlin.collections.v.P0(aVar.H(), aVar.I());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List y(a aVar) {
            return p013kotlin.collections.v.P0(aVar.L(), aVar.O());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List z(a aVar) {
            return p013kotlin.collections.v.P0(aVar.M(), aVar.P());
        }

        public final Collection<a0<?>> H() {
            T tB = this.allNonStaticMembers.b(this, f66272w[13]);
            p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
            return (Collection) tB;
        }

        public final Collection<a0<?>> I() {
            T tB = this.allStaticMembers.b(this, f66272w[14]);
            p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
            return (Collection) tB;
        }

        public final List<Annotation> J() {
            T tB = this.annotations.b(this, f66272w[1]);
            p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
            return (List) tB;
        }

        public final Collection<co0.h<T>> K() {
            T tB = this.constructors.b(this, f66272w[4]);
            p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
            return (Collection) tB;
        }

        public final Collection<a0<?>> L() {
            T tB = this.declaredNonStaticMembers.b(this, f66272w[9]);
            p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
            return (Collection) tB;
        }

        public final ClassDescriptor N() {
            T tB = this.descriptor.b(this, f66272w[0]);
            p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
            return (ClassDescriptor) tB;
        }

        public final T Q() {
            return (T) this.objectInstance.getValue();
        }

        public final String R() {
            return (String) this.qualifiedName.b(this, f66272w[3]);
        }

        public final String S() {
            return (String) this.simpleName.b(this, f66272w[2]);
        }

        public final List<co0.q> T() {
            T tB = this.supertypes.b(this, f66272w[7]);
            p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
            return (List) tB;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66292a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KotlinClassHeader.Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KotlinClassHeader.Kind.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KotlinClassHeader.Kind.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f66292a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"fo0/w0$c", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/GivenFunctionsMemberScope;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "c", "()Ljava/util/List;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends GivenFunctionsMemberScope {
        c(ClassDescriptorImpl classDescriptorImpl, StorageManager storageManager) {
            super(storageManager, classDescriptorImpl);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
        protected List<FunctionDescriptor> c() {
            return p013kotlin.collections.v.m();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class d extends p013kotlin.jvm.internal.o implements wn0.p<MemberDeserializer, ProtoBuf.Property, PropertyDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f66293a = new d();

        d() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PropertyDescriptor invoke(MemberDeserializer p11, ProtoBuf.Property p12) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            p013kotlin.jvm.internal.s.k(p12, "p1");
            return p11.loadProperty(p12);
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "loadProperty";
        }

        @Override // p013kotlin.jvm.internal.f
        public final co0.g getOwner() {
            return p013kotlin.jvm.internal.o0.b(MemberDeserializer.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }
    }

    public w0(Class<T> jClass) {
        p013kotlin.jvm.internal.s.k(jClass, "jClass");
        this.jClass = jClass;
        this.data = jn0.m.a(jn0.p.PUBLICATION, new b0(this));
    }

    private final ClassDescriptor N(ClassId classId, RuntimeModuleData moduleData) {
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new EmptyPackageFragmentDescriptor(moduleData.getModule(), classId.getPackageFqName()), classId.getShortClassName(), Modality.FINAL, ClassKind.CLASS, p013kotlin.collections.v.e(moduleData.getModule().getBuiltIns().getAny().getDefaultType()), SourceElement.NO_SOURCE, false, moduleData.getDeserialization().getStorageManager());
        classDescriptorImpl.initialize(new c(classDescriptorImpl, moduleData.getDeserialization().getStorageManager()), p013kotlin.collections.d1.d(), null);
        return classDescriptorImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassDescriptor O(ClassId classId, RuntimeModuleData moduleData) {
        KotlinClassHeader classHeader;
        if (a().isSynthetic()) {
            return N(classId, moduleData);
        }
        ReflectKotlinClass reflectKotlinClassCreate = ReflectKotlinClass.Factory.create(a());
        KotlinClassHeader.Kind kind = (reflectKotlinClassCreate == null || (classHeader = reflectKotlinClassCreate.getClassHeader()) == null) ? null : classHeader.getKind();
        switch (kind == null ? -1 : b.f66292a[kind.ordinal()]) {
            case -1:
            case 6:
                throw new x2("Unresolved class: " + a() + " (kind = " + kind + CoreConstants.RIGHT_PARENTHESIS_CHAR);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
                return N(classId, moduleData);
            case 5:
                throw new x2("Unknown class: " + a() + " (kind = " + kind + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a P(w0 w0Var) {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassId Q() {
        return e3.f66120a.c(a());
    }

    @Override // fo0.c1
    public Collection<FunctionDescriptor> A(Name name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        MemberScope memberScopeT = T();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return p013kotlin.collections.v.P0(memberScopeT.getContributedFunctions(name, noLookupLocation), U().getContributedFunctions(name, noLookupLocation));
    }

    @Override // fo0.c1
    public PropertyDescriptor B(int index) {
        Class<?> declaringClass;
        if (p013kotlin.jvm.internal.s.f(a().getSimpleName(), "DefaultImpls") && (declaringClass = a().getDeclaringClass()) != null && declaringClass.isInterface()) {
            co0.d dVarE = vn0.a.e(declaringClass);
            p013kotlin.jvm.internal.s.i(dVarE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((w0) dVarE).B(index);
        }
        ClassDescriptor descriptor = getDescriptor();
        DeserializedClassDescriptor deserializedClassDescriptor = descriptor instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) descriptor : null;
        if (deserializedClassDescriptor != null) {
            ProtoBuf.Class classProto = deserializedClassDescriptor.getClassProto();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> classLocalVariable = JvmProtoBuf.classLocalVariable;
            p013kotlin.jvm.internal.s.j(classLocalVariable, "classLocalVariable");
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.getExtensionOrNull(classProto, classLocalVariable, index);
            if (property != null) {
                return (PropertyDescriptor) i3.h(a(), property, deserializedClassDescriptor.getC().getNameResolver(), deserializedClassDescriptor.getC().getTypeTable(), deserializedClassDescriptor.getMetadataVersion(), d.f66293a);
            }
        }
        return null;
    }

    @Override // fo0.c1
    public Collection<PropertyDescriptor> E(Name name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        MemberScope memberScopeT = T();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return p013kotlin.collections.v.P0(memberScopeT.getContributedVariables(name, noLookupLocation), U().getContributedVariables(name, noLookupLocation));
    }

    public final Lazy<w0<T>.a> R() {
        return this.data;
    }

    @Override // fo0.x0
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor getDescriptor() {
        return this.data.getValue().N();
    }

    public final MemberScope T() {
        return getDescriptor().getDefaultType().getMemberScope();
    }

    public final MemberScope U() {
        MemberScope staticScope = getDescriptor().getStaticScope();
        p013kotlin.jvm.internal.s.j(staticScope, "getStaticScope(...)");
        return staticScope;
    }

    @Override // p013kotlin.jvm.internal.h
    public Class<T> a() {
        return this.jClass;
    }

    @Override // co0.d
    public String c() {
        return this.data.getValue().R();
    }

    public boolean equals(Object other) {
        return (other instanceof w0) && p013kotlin.jvm.internal.s.f(vn0.a.c(this), vn0.a.c((co0.d) other));
    }

    @Override // co0.d
    public T f() {
        return this.data.getValue().Q();
    }

    @Override // co0.b
    public List<Annotation> getAnnotations() {
        return this.data.getValue().J();
    }

    @Override // co0.d
    public Collection<co0.h<T>> getConstructors() {
        return this.data.getValue().K();
    }

    @Override // co0.d
    public List<co0.q> getSupertypes() {
        return this.data.getValue().T();
    }

    @Override // co0.d
    public int hashCode() {
        return vn0.a.c(this).hashCode();
    }

    @Override // co0.d
    public boolean isAbstract() {
        return getDescriptor().getModality() == Modality.ABSTRACT;
    }

    @Override // co0.d
    public boolean isInner() {
        return getDescriptor().isInner();
    }

    @Override // co0.d
    public boolean isSealed() {
        return getDescriptor().getModality() == Modality.SEALED;
    }

    @Override // co0.d
    public boolean isValue() {
        return getDescriptor().isValue();
    }

    @Override // co0.d
    public boolean j(Object value) {
        Integer functionClassArity = ReflectClassUtilKt.getFunctionClassArity(a());
        if (functionClassArity != null) {
            return p013kotlin.jvm.internal.u0.o(value, functionClassArity.intValue());
        }
        Class wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(a());
        if (wrapperByPrimitive == null) {
            wrapperByPrimitive = a();
        }
        return wrapperByPrimitive.isInstance(value);
    }

    @Override // co0.d
    public String l() {
        return this.data.getValue().S();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("class ");
        ClassId classIdQ = Q();
        FqName packageFqName = classIdQ.getPackageFqName();
        if (packageFqName.isRoot()) {
            str = "";
        } else {
            str = packageFqName.asString() + CoreConstants.DOT;
        }
        String strAsString = classIdQ.getRelativeClassName().asString();
        p013kotlin.jvm.internal.s.j(strAsString, "asString(...)");
        sb2.append(str + p013kotlin.text.t.U(strAsString, CoreConstants.DOT, CoreConstants.DOLLAR, false, 4, null));
        return sb2.toString();
    }

    @Override // fo0.c1
    public Collection<ConstructorDescriptor> z() {
        ClassDescriptor descriptor = getDescriptor();
        if (descriptor.getKind() == ClassKind.INTERFACE || descriptor.getKind() == ClassKind.OBJECT) {
            return p013kotlin.collections.v.m();
        }
        Collection<ClassConstructorDescriptor> constructors = descriptor.getConstructors();
        p013kotlin.jvm.internal.s.j(constructors, "getConstructors(...)");
        return constructors;
    }
}
