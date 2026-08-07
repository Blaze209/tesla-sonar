package go0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0015\u0017BA\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0015\u0010\u001eR\u001e\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0016\u0010%\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010$R\u0014\u0010(\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lgo0/a;", "Lgo0/h;", "", "Ljava/lang/Class;", "jClass", "", "", "parameterNames", "Lgo0/a$a;", "callMode", "Lgo0/a$b;", "origin", "Ljava/lang/reflect/Method;", "methods", "<init>", "(Ljava/lang/Class;Ljava/util/List;Lgo0/a$a;Lgo0/a$b;Ljava/util/List;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Class;", "b", "Ljava/util/List;", "c", "Lgo0/a$a;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/reflect/Type;", "e", "()Ljava/util/List;", "parameterTypes", "f", "erasedParameterTypes", "g", "defaultValues", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> jClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> parameterNames;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC1418a callMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Method> methods;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<Type> parameterTypes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<Class<?>> erasedParameterTypes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Object> defaultValues;

    /* JADX INFO: renamed from: go0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lgo0/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum EnumC1418a {
        CALL_BY_NAME,
        POSITIONAL_CALL;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lgo0/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        JAVA,
        KOTLIN;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    }

    public a(Class<?> jClass, List<String> parameterNames, EnumC1418a callMode, b origin, List<Method> methods) {
        s.k(jClass, "jClass");
        s.k(parameterNames, "parameterNames");
        s.k(callMode, "callMode");
        s.k(origin, "origin");
        s.k(methods, "methods");
        this.jClass = jClass;
        this.parameterNames = parameterNames;
        this.callMode = callMode;
        this.methods = methods;
        List<Method> list = methods;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.parameterTypes = arrayList;
        List<Method> list2 = this.methods;
        ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            s.h(returnType);
            Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(returnType);
            if (wrapperByPrimitive != null) {
                returnType = wrapperByPrimitive;
            }
            arrayList2.add(returnType);
        }
        this.erasedParameterTypes = arrayList2;
        List<Method> list3 = this.methods;
        ArrayList arrayList3 = new ArrayList(v.y(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.defaultValues = arrayList3;
        if (this.callMode == EnumC1418a.POSITIONAL_CALL && origin == b.JAVA && !v.M0(this.parameterNames, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // go0.h
    public List<Type> a() {
        return this.parameterTypes;
    }

    @Override // go0.h
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) d();
    }

    public void c(Object[] objArr) {
        h.a.a(this, objArr);
    }

    @Override // go0.h
    public Object call(Object[] args) {
        s.k(args, "args");
        c(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            Object obj = args[i11];
            int i13 = i12 + 1;
            Object objQ = (obj == null && this.callMode == EnumC1418a.CALL_BY_NAME) ? this.defaultValues.get(i12) : f.q(obj, this.erasedParameterTypes.get(i12));
            if (objQ == null) {
                f.p(i12, this.parameterNames.get(i12), this.erasedParameterTypes.get(i12));
                throw null;
            }
            arrayList.add(objQ);
            i11++;
            i12 = i13;
        }
        return f.g(this.jClass, v0.y(v.v1(this.parameterNames, arrayList)), this.methods);
    }

    public Void d() {
        return null;
    }

    @Override // go0.h
    public Type getReturnType() {
        return this.jClass;
    }

    public /* synthetic */ a(Class cls, List list, EnumC1418a enumC1418a, b bVar, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        List list3;
        if ((i11 & 16) != 0) {
            List list4 = list;
            ArrayList arrayList = new ArrayList(v.y(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list3 = arrayList;
        } else {
            list3 = list2;
        }
        this(cls, list, enumC1418a, bVar, list3);
    }
}
