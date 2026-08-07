package fo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.load.java.DescriptorsJvmAbiUtil;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b \u0018\u0000 P*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004QRSTB5\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010#R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\t0\t048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010@\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000A8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0018\u0010H\u001a\u0006\u0012\u0002\b\u00030E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0002\b\u0003\u0018\u00010E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0014\u0010K\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010<R\u0014\u0010L\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010<R\u0014\u0010M\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010<R\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006U"}, d2 = {"Lfo0/j2;", "V", "Lfo0/a0;", "Lco0/m;", "Lfo0/c1;", "container", "", "name", "signature", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptorInitialValue", "", "rawBoundReceiver", "<init>", "(Lfo0/c1;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "descriptor", "(Lfo0/c1;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "boundReceiver", "(Lfo0/c1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/reflect/Member;", "Y", "()Ljava/lang/reflect/Member;", "fieldOrMethod", "receiver1", "receiver2", "a0", "(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "g", "Lfo0/c1;", Gender.NONE, "()Lfo0/c1;", "h", "Ljava/lang/String;", "getName", IntegerTokenConverter.CONVERTER_KEY, "e0", "j", "Ljava/lang/Object;", "Lkotlin/Lazy;", "Ljava/lang/reflect/Field;", "k", "Lkotlin/Lazy;", "_javaField", "Lfo0/z2$a;", "kotlin.jvm.PlatformType", "l", "Lfo0/z2$a;", "_descriptor", "Z", "()Ljava/lang/Object;", "S", "()Z", "isBound", "d0", "()Ljava/lang/reflect/Field;", "javaField", "Lfo0/j2$c;", "c0", "()Lfo0/j2$c;", "getter", "Lgo0/h;", Gender.MALE, "()Lgo0/h;", "caller", Gender.OTHER, "defaultCaller", "isLateinit", "isConst", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "m", "a", "c", DateTokenConverter.CONVERTER_KEY, "b", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class j2<V> extends a0<V> implements co0.m<V> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f66159n = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c1 container;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String signature;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Object rawBoundReceiver;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy<Field> _javaField;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final z2.a<PropertyDescriptor> _descriptor;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lfo0/j2$a;", "PropertyType", "ReturnType", "Lfo0/a0;", "Lco0/m$a;", "Lco0/h;", "<init>", "()V", "Lfo0/j2;", "V", "()Lfo0/j2;", "property", "Lfo0/c1;", Gender.NONE, "()Lfo0/c1;", "container", "Lgo0/h;", Gender.OTHER, "()Lgo0/h;", "defaultCaller", "", "S", "()Z", "isBound", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyAccessorDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class a<PropertyType, ReturnType> extends a0<ReturnType> implements co0.h<ReturnType>, co0.m.a<PropertyType> {
        @Override // fo0.a0
        /* JADX INFO: renamed from: N */
        public c1 getContainer() {
            return a().getContainer();
        }

        @Override // fo0.a0
        public go0.h<?> O() {
            return null;
        }

        @Override // fo0.a0
        public boolean S() {
            return a().S();
        }

        public abstract PropertyAccessorDescriptor U();

        /* JADX INFO: renamed from: V */
        public abstract j2<PropertyType> a();

        @Override // co0.h
        public boolean isExternal() {
            return U().isExternal();
        }

        @Override // co0.h
        public boolean isInfix() {
            return U().isInfix();
        }

        @Override // co0.h
        public boolean isInline() {
            return U().isInline();
        }

        @Override // co0.h
        public boolean isOperator() {
            return U().isOperator();
        }

        @Override // co0.c
        public boolean isSuspend() {
            return U().isSuspend();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"Lfo0/j2$c;", "V", "Lfo0/j2$a;", "Lco0/m$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "g", "Lfo0/z2$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "Lgo0/h;", "h", "Lkotlin/Lazy;", Gender.MALE, "()Lgo0/h;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class c<V> extends a<V, V> implements co0.m.b<V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final /* synthetic */ co0.m<Object>[] f66166i = {p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final z2.a descriptor = z2.c(new k2(this));

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Lazy caller = jn0.m.a(jn0.p.PUBLICATION, new l2(this));

        /* JADX INFO: Access modifiers changed from: private */
        public static final go0.h Y(c cVar) {
            return o2.b(cVar, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PropertyGetterDescriptor Z(c cVar) {
            PropertyGetterDescriptor getter = cVar.a().U().getGetter();
            if (getter != null) {
                return getter;
            }
            PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(cVar.a().U(), Annotations.Companion.getEMPTY());
            p013kotlin.jvm.internal.s.j(propertyGetterDescriptorImplCreateDefaultGetter, "createDefaultGetter(...)");
            return propertyGetterDescriptorImplCreateDefaultGetter;
        }

        @Override // fo0.a0
        public go0.h<?> M() {
            return (go0.h) this.caller.getValue();
        }

        @Override // fo0.j2.a
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public PropertyGetterDescriptor U() {
            T tB = this.descriptor.b(this, f66166i[0]);
            p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
            return (PropertyGetterDescriptor) tB;
        }

        public boolean equals(Object other) {
            return (other instanceof c) && p013kotlin.jvm.internal.s.f(a(), ((c) other).a());
        }

        @Override // co0.c
        public String getName() {
            return "<get-" + a().getName() + '>';
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "getter of " + a();
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\t¨\u0006 "}, d2 = {"Lfo0/j2$d;", "V", "Lfo0/j2$a;", "Ljn0/h0;", "Lco0/i$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertySetterDescriptor;", "g", "Lfo0/z2$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "Lgo0/h;", "h", "Lkotlin/Lazy;", Gender.MALE, "()Lgo0/h;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class d<V> extends a<V, jn0.h0> implements co0.i.a<V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final /* synthetic */ co0.m<Object>[] f66169i = {p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final z2.a descriptor = z2.c(new m2(this));

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Lazy caller = jn0.m.a(jn0.p.PUBLICATION, new n2(this));

        /* JADX INFO: Access modifiers changed from: private */
        public static final go0.h Y(d dVar) {
            return o2.b(dVar, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PropertySetterDescriptor Z(d dVar) {
            PropertySetterDescriptor setter = dVar.a().U().getSetter();
            if (setter != null) {
                return setter;
            }
            PropertyDescriptor propertyDescriptorU = dVar.a().U();
            Annotations.Companion companion = Annotations.Companion;
            PropertySetterDescriptorImpl propertySetterDescriptorImplCreateDefaultSetter = DescriptorFactory.createDefaultSetter(propertyDescriptorU, companion.getEMPTY(), companion.getEMPTY());
            p013kotlin.jvm.internal.s.j(propertySetterDescriptorImplCreateDefaultSetter, "createDefaultSetter(...)");
            return propertySetterDescriptorImplCreateDefaultSetter;
        }

        @Override // fo0.a0
        public go0.h<?> M() {
            return (go0.h) this.caller.getValue();
        }

        @Override // fo0.j2.a
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public PropertySetterDescriptor U() {
            T tB = this.descriptor.b(this, f66169i[0]);
            p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
            return (PropertySetterDescriptor) tB;
        }

        public boolean equals(Object other) {
            return (other instanceof d) && p013kotlin.jvm.internal.s.f(a(), ((d) other).a());
        }

        @Override // co0.c
        public String getName() {
            return "<set-" + a().getName() + '>';
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "setter of " + a();
        }
    }

    private j2(c1 c1Var, String str, String str2, PropertyDescriptor propertyDescriptor, Object obj) {
        this.container = c1Var;
        this.name = str;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this._javaField = jn0.m.a(jn0.p.PUBLICATION, new h2(this));
        z2.a<PropertyDescriptor> aVarB = z2.b(propertyDescriptor, new i2(this));
        p013kotlin.jvm.internal.s.j(aVarB, "lazySoft(...)");
        this._descriptor = aVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropertyDescriptor U(j2 j2Var) {
        return j2Var.getContainer().v(j2Var.getName(), j2Var.signature);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field V(j2 j2Var) {
        Class<?> enclosingClass;
        p pVarF = e3.f66120a.f(j2Var.U());
        if (!(pVarF instanceof p.c)) {
            if (pVarF instanceof p.a) {
                return ((p.a) pVarF).getField();
            }
            if ((pVarF instanceof p.b) || (pVarF instanceof p.d)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        p.c cVar = (p.c) pVarF;
        PropertyDescriptor propertyDescriptorB = cVar.getDescriptor();
        JvmMemberSignature.Field jvmFieldSignature$default = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, cVar.getProto(), cVar.getNameResolver(), cVar.getTypeTable(), false, 8, null);
        if (jvmFieldSignature$default == null) {
            return null;
        }
        if (DescriptorsJvmAbiUtil.isPropertyWithBackingFieldInOuterClass(propertyDescriptorB) || JvmProtoBufUtil.isMovedFromInterfaceCompanion(cVar.getProto())) {
            enclosingClass = j2Var.getContainer().a().getEnclosingClass();
        } else {
            DeclarationDescriptor containingDeclaration = propertyDescriptorB.getContainingDeclaration();
            enclosingClass = containingDeclaration instanceof ClassDescriptor ? i3.q((ClassDescriptor) containingDeclaration) : j2Var.getContainer().a();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(jvmFieldSignature$default.getName());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // fo0.a0
    public go0.h<?> M() {
        return getGetter().M();
    }

    @Override // fo0.a0
    /* JADX INFO: renamed from: N, reason: from getter */
    public c1 getContainer() {
        return this.container;
    }

    @Override // fo0.a0
    public go0.h<?> O() {
        return getGetter().O();
    }

    @Override // fo0.a0
    public boolean S() {
        return this.rawBoundReceiver != p013kotlin.jvm.internal.f.NO_RECEIVER;
    }

    protected final Member Y() {
        if (!U().isDelegated()) {
            return null;
        }
        p pVarF = e3.f66120a.f(U());
        if (pVarF instanceof p.c) {
            p.c cVar = (p.c) pVarF;
            if (cVar.getSignature().hasDelegateMethod()) {
                JvmProtoBuf.JvmMethodSignature delegateMethod = cVar.getSignature().getDelegateMethod();
                if (!delegateMethod.hasName() || !delegateMethod.hasDesc()) {
                    return null;
                }
                return getContainer().u(cVar.getNameResolver().getString(delegateMethod.getName()), cVar.getNameResolver().getString(delegateMethod.getDesc()));
            }
        }
        return d0();
    }

    public final Object Z() {
        return go0.o.h(this.rawBoundReceiver, U());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final Object a0(Member fieldOrMethod, Object receiver1, Object receiver2) throws IllegalPropertyDelegateAccessException {
        try {
            Object obj = f66159n;
            if ((receiver1 == obj || receiver2 == obj) && U().getExtensionReceiverParameter() == null) {
                throw new RuntimeException(CoreConstants.SINGLE_QUOTE_CHAR + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objZ = S() ? Z() : receiver1;
            if (objZ == obj) {
                objZ = null;
            }
            if (!S()) {
                receiver1 = receiver2;
            }
            if (receiver1 == obj) {
                receiver1 = null;
            }
            AccessibleObject accessibleObject = fieldOrMethod instanceof AccessibleObject ? (AccessibleObject) fieldOrMethod : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(eo0.a.a(this));
            }
            if (fieldOrMethod == 0) {
                return null;
            }
            if (fieldOrMethod instanceof Field) {
                return ((Field) fieldOrMethod).get(objZ);
            }
            if (!(fieldOrMethod instanceof Method)) {
                throw new AssertionError("delegate field/method " + fieldOrMethod + " neither field nor method");
            }
            int length = ((Method) fieldOrMethod).getParameterTypes().length;
            if (length == 0) {
                return ((Method) fieldOrMethod).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) fieldOrMethod;
                if (objZ == null) {
                    Class<?> cls = ((Method) fieldOrMethod).getParameterTypes()[0];
                    p013kotlin.jvm.internal.s.j(cls, "get(...)");
                    objZ = i3.g(cls);
                }
                return method.invoke(null, objZ);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + fieldOrMethod + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) fieldOrMethod;
            if (receiver1 == null) {
                Class<?> cls2 = ((Method) fieldOrMethod).getParameterTypes()[1];
                p013kotlin.jvm.internal.s.j(cls2, "get(...)");
                receiver1 = i3.g(cls2);
            }
            return method2.invoke(null, objZ, receiver1);
        } catch (IllegalAccessException e11) {
            throw new IllegalPropertyDelegateAccessException(e11);
        }
    }

    @Override // fo0.a0
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public PropertyDescriptor U() {
        PropertyDescriptor propertyDescriptorInvoke = this._descriptor.invoke();
        p013kotlin.jvm.internal.s.j(propertyDescriptorInvoke, "invoke(...)");
        return propertyDescriptorInvoke;
    }

    /* JADX INFO: renamed from: c0 */
    public abstract c<V> getGetter();

    public final Field d0() {
        return this._javaField.getValue();
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public boolean equals(Object other) {
        j2<?> j2VarD = i3.d(other);
        return j2VarD != null && p013kotlin.jvm.internal.s.f(getContainer(), j2VarD.getContainer()) && p013kotlin.jvm.internal.s.f(getName(), j2VarD.getName()) && p013kotlin.jvm.internal.s.f(this.signature, j2VarD.signature) && p013kotlin.jvm.internal.s.f(this.rawBoundReceiver, j2VarD.rawBoundReceiver);
    }

    @Override // co0.c
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    @Override // co0.m
    public boolean isConst() {
        return U().isConst();
    }

    @Override // co0.m
    public boolean isLateinit() {
        return U().isLateInit();
    }

    @Override // co0.c
    public boolean isSuspend() {
        return false;
    }

    public String toString() {
        return d3.f66112a.k(U());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j2(c1 container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        p013kotlin.jvm.internal.s.k(container, "container");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j2(c1 container, PropertyDescriptor descriptor) {
        p013kotlin.jvm.internal.s.k(container, "container");
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        String strAsString = descriptor.getName().asString();
        p013kotlin.jvm.internal.s.j(strAsString, "asString(...)");
        this(container, strAsString, e3.f66120a.f(descriptor).getString(), descriptor, p013kotlin.jvm.internal.f.NO_RECEIVER);
    }
}
