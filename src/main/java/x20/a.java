package x20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.f.a;
import com.squareup.wire.q;
import ezvcard.property.Gender;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B'\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00020\u00132\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00028\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001a\u00100\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b(\u0010+R\u001a\u00105\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u00102\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u00108\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010)R\u001a\u0010=\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b7\u0010<R\u0014\u0010?\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010>R\u0014\u0010A\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>R\u0018\u0010E\u001a\u0006\u0012\u0002\b\u00030C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010DR\u0018\u0010F\u001a\u0006\u0012\u0002\b\u00030C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010DR\u0014\u0010G\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010<R\u0014\u0010I\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010<¨\u0006J"}, d2 = {"Lx20/a;", "Lcom/squareup/wire/f;", Gender.MALE, "Lcom/squareup/wire/f$a;", "B", "Lx20/b;", "Lcom/squareup/wire/q;", "wireField", "Ljava/lang/reflect/Field;", "messageField", "Ljava/lang/Class;", "builderType", "<init>", "(Lcom/squareup/wire/q;Ljava/lang/reflect/Field;Ljava/lang/Class;)V", "", "name", "q", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;", "type", "Ljava/lang/reflect/Method;", "r", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "builder", "", "value", "Ljn0/h0;", "u", "(Lcom/squareup/wire/f$a;Ljava/lang/Object;)V", "t", "message", "p", "(Lcom/squareup/wire/f;)Ljava/lang/Object;", "s", "(Lcom/squareup/wire/f$a;)Ljava/lang/Object;", "Lcom/squareup/wire/q$a;", "b", "Lcom/squareup/wire/q$a;", "f", "()Lcom/squareup/wire/q$a;", AnnotatedPrivateKey.LABEL, "c", "Ljava/lang/String;", "g", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "k", "wireFieldJsonName", "e", "declaredName", "", "I", "j", "()I", "tag", "keyAdapterString", "h", "adapterString", "", IntegerTokenConverter.CONVERTER_KEY, "Z", "()Z", "redacted", "Ljava/lang/reflect/Field;", "builderField", "Ljava/lang/reflect/Method;", "builderMethod", "l", "Lcom/squareup/wire/ProtoAdapter;", "()Lcom/squareup/wire/ProtoAdapter;", "keyAdapter", "singleAdapter", "isMap", "m", "isMessage", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public final class a<M extends com.squareup.wire.f<M, B>, B extends com.squareup.wire.f.a<M, B>> extends b<M, B> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q.a label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String wireFieldJsonName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String declaredName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int tag;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String keyAdapterString;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String adapterString;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean redacted;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Field builderField;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Method builderMethod;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Field messageField;

    public a(q wireField, Field messageField, Class<B> builderType) {
        String strDeclaredName;
        s.k(wireField, "wireField");
        s.k(messageField, "messageField");
        s.k(builderType, "builderType");
        this.messageField = messageField;
        this.label = wireField.label();
        String name = messageField.getName();
        s.j(name, "messageField.name");
        this.name = name;
        this.wireFieldJsonName = wireField.jsonName();
        if (wireField.declaredName().length() == 0) {
            strDeclaredName = messageField.getName();
            s.j(strDeclaredName, "messageField.name");
        } else {
            strDeclaredName = wireField.declaredName();
        }
        this.declaredName = strDeclaredName;
        this.tag = wireField.tag();
        this.keyAdapterString = wireField.keyAdapter();
        this.adapterString = wireField.adapter();
        this.redacted = wireField.redacted();
        this.builderField = q(builderType, getName());
        String name2 = getName();
        Class<?> type = messageField.getType();
        s.j(type, "messageField.type");
        this.builderMethod = r(builderType, name2, type);
    }

    private final Field q(Class<?> builderType, String name) {
        try {
            Field field = builderType.getField(name);
            s.j(field, "builderType.getField(name)");
            return field;
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + builderType.getName() + CoreConstants.DOT + name);
        }
    }

    private final Method r(Class<?> builderType, String name, Class<?> type) {
        try {
            Method method = builderType.getMethod(name, type);
            s.j(method, "builderType.getMethod(name, type)");
            return method;
        } catch (NoSuchMethodException unused) {
            throw new AssertionError("No builder method " + builderType.getName() + CoreConstants.DOT + name + CoreConstants.LEFT_PARENTHESIS_CHAR + type.getName() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Override // x20.b
    /* JADX INFO: renamed from: c, reason: from getter */
    public String getDeclaredName() {
        return this.declaredName;
    }

    @Override // x20.b
    public ProtoAdapter<?> e() {
        return ProtoAdapter.INSTANCE.c(this.keyAdapterString);
    }

    @Override // x20.b
    /* JADX INFO: renamed from: f, reason: from getter */
    public q.a getLabel() {
        return this.label;
    }

    @Override // x20.b
    /* JADX INFO: renamed from: g, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // x20.b
    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getRedacted() {
        return this.redacted;
    }

    @Override // x20.b
    public ProtoAdapter<?> i() {
        return ProtoAdapter.INSTANCE.c(this.adapterString);
    }

    @Override // x20.b
    /* JADX INFO: renamed from: j, reason: from getter */
    public int getTag() {
        return this.tag;
    }

    @Override // x20.b
    /* JADX INFO: renamed from: k, reason: from getter */
    public String getWireFieldJsonName() {
        return this.wireFieldJsonName;
    }

    @Override // x20.b
    public boolean l() {
        return this.keyAdapterString.length() > 0;
    }

    @Override // x20.b
    public boolean m() {
        co0.d<?> type = i().getType();
        return com.squareup.wire.f.class.isAssignableFrom(type != null ? vn0.a.c(type) : null);
    }

    @Override // x20.b
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Object a(M message) {
        s.k(message, "message");
        return this.messageField.get(message);
    }

    @Override // x20.b
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Object d(B builder) {
        s.k(builder, "builder");
        return this.builderField.get(builder);
    }

    @Override // x20.b
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(B builder, Object value) throws IllegalAccessException, InvocationTargetException {
        s.k(builder, "builder");
        if (getLabel().isOneOf()) {
            this.builderMethod.invoke(builder, value);
        } else {
            this.builderField.set(builder, value);
        }
    }

    @Override // x20.b
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void o(B builder, Object value) throws IllegalAccessException, InvocationTargetException {
        s.k(builder, "builder");
        s.k(value, "value");
        if (getLabel().isRepeated()) {
            Object objD = d(builder);
            if (u0.p(objD)) {
                if (objD == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any>");
                }
                u0.c(objD).add(value);
                return;
            } else if (objD instanceof List) {
                List listP1 = v.p1((Collection) objD);
                listP1.add(value);
                n(builder, listP1);
                return;
            } else {
                throw new ClassCastException("Expected a list type, got " + (objD != null ? objD.getClass() : null) + CoreConstants.DOT);
            }
        }
        if (this.keyAdapterString.length() <= 0) {
            n(builder, value);
            return;
        }
        Object objD2 = d(builder);
        if (u0.q(objD2)) {
            ((Map) objD2).putAll((Map) value);
            return;
        }
        if (objD2 instanceof Map) {
            Map mapD = v0.D((Map) objD2);
            mapD.putAll((Map) value);
            n(builder, mapD);
        } else {
            throw new ClassCastException("Expected a map type, got " + (objD2 != null ? objD2.getClass() : null) + CoreConstants.DOT);
        }
    }
}
