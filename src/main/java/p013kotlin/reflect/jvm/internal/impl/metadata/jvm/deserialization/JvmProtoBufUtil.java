package p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes9.dex */
public final class JvmProtoBufUtil {
    public static final JvmProtoBufUtil INSTANCE = new JvmProtoBufUtil();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExtensionRegistryLite f88162a;

    static {
        ExtensionRegistryLite extensionRegistryLiteNewInstance = ExtensionRegistryLite.newInstance();
        JvmProtoBuf.registerAllExtensions(extensionRegistryLiteNewInstance);
        s.j(extensionRegistryLiteNewInstance, "apply(...)");
        f88162a = extensionRegistryLiteNewInstance;
    }

    private JvmProtoBufUtil() {
    }

    private final String a(ProtoBuf.Type type, NameResolver nameResolver) {
        if (type.hasClassName()) {
            return ClassMapperLite.mapClass(nameResolver.getQualifiedClassName(type.getClassName()));
        }
        return null;
    }

    private final JvmNameResolver b(InputStream inputStream, String[] strArr) {
        JvmProtoBuf.StringTableTypes delimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(inputStream, f88162a);
        s.j(delimitedFrom, "parseDelimitedFrom(...)");
        return new JvmNameResolver(delimitedFrom, strArr);
    }

    public static /* synthetic */ JvmMemberSignature.Field getJvmFieldSignature$default(JvmProtoBufUtil jvmProtoBufUtil, ProtoBuf.Property property, NameResolver nameResolver, TypeTable typeTable, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        return jvmProtoBufUtil.getJvmFieldSignature(property, nameResolver, typeTable, z11);
    }

    public static final boolean isMovedFromInterfaceCompanion(ProtoBuf.Property proto) {
        s.k(proto, "proto");
        Flags.BooleanFlagField is_moved_from_interface_companion = JvmFlags.INSTANCE.getIS_MOVED_FROM_INTERFACE_COMPANION();
        Object extension = proto.getExtension(JvmProtoBuf.flags);
        s.j(extension, "getExtension(...)");
        Boolean bool = is_moved_from_interface_companion.get(((Number) extension).intValue());
        s.j(bool, "get(...)");
        return bool.booleanValue();
    }

    public static final Pair<JvmNameResolver, ProtoBuf.Class> readClassDataFrom(String[] data, String[] strings) {
        s.k(data, "data");
        s.k(strings, "strings");
        byte[] bArrDecodeBytes = BitEncoding.decodeBytes(data);
        s.j(bArrDecodeBytes, "decodeBytes(...)");
        return readClassDataFrom(bArrDecodeBytes, strings);
    }

    public static final Pair<JvmNameResolver, ProtoBuf.Function> readFunctionDataFrom(String[] data, String[] strings) {
        s.k(data, "data");
        s.k(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.decodeBytes(data));
        return new Pair<>(INSTANCE.b(byteArrayInputStream, strings), ProtoBuf.Function.parseFrom(byteArrayInputStream, f88162a));
    }

    public static final Pair<JvmNameResolver, ProtoBuf.Package> readPackageDataFrom(String[] data, String[] strings) {
        s.k(data, "data");
        s.k(strings, "strings");
        byte[] bArrDecodeBytes = BitEncoding.decodeBytes(data);
        s.j(bArrDecodeBytes, "decodeBytes(...)");
        return readPackageDataFrom(bArrDecodeBytes, strings);
    }

    public final ExtensionRegistryLite getEXTENSION_REGISTRY() {
        return f88162a;
    }

    public final JvmMemberSignature.Method getJvmConstructorSignature(ProtoBuf.Constructor proto, NameResolver nameResolver, TypeTable typeTable) {
        String strY0;
        s.k(proto, "proto");
        s.k(nameResolver, "nameResolver");
        s.k(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmProtoBuf.JvmMethodSignature> constructorSignature = JvmProtoBuf.constructorSignature;
        s.j(constructorSignature, "constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(proto, constructorSignature);
        String string = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? "<init>" : nameResolver.getString(jvmMethodSignature.getName());
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
            s.j(valueParameterList, "getValueParameterList(...)");
            List<ProtoBuf.ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            for (ProtoBuf.ValueParameter valueParameter : list) {
                JvmProtoBufUtil jvmProtoBufUtil = INSTANCE;
                s.h(valueParameter);
                String strA = jvmProtoBufUtil.a(ProtoTypeTableUtilKt.type(valueParameter, typeTable), nameResolver);
                if (strA == null) {
                    return null;
                }
                arrayList.add(strA);
            }
            strY0 = v.y0(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            strY0 = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new JvmMemberSignature.Method(string, strY0);
    }

    public final JvmMemberSignature.Field getJvmFieldSignature(ProtoBuf.Property proto, NameResolver nameResolver, TypeTable typeTable, boolean z11) {
        String strA;
        s.k(proto, "proto");
        s.k(nameResolver, "nameResolver");
        s.k(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.propertySignature;
        s.j(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        JvmProtoBuf.JvmFieldSignature field = jvmPropertySignature.hasField() ? jvmPropertySignature.getField() : null;
        if (field == null && z11) {
            return null;
        }
        int name = (field == null || !field.hasName()) ? proto.getName() : field.getName();
        if (field == null || !field.hasDesc()) {
            strA = a(ProtoTypeTableUtilKt.returnType(proto, typeTable), nameResolver);
            if (strA == null) {
                return null;
            }
        } else {
            strA = nameResolver.getString(field.getDesc());
        }
        return new JvmMemberSignature.Field(nameResolver.getString(name), strA);
    }

    public final JvmMemberSignature.Method getJvmMethodSignature(ProtoBuf.Function proto, NameResolver nameResolver, TypeTable typeTable) {
        String string;
        s.k(proto, "proto");
        s.k(nameResolver, "nameResolver");
        s.k(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmProtoBuf.JvmMethodSignature> methodSignature = JvmProtoBuf.methodSignature;
        s.j(methodSignature, "methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(proto, methodSignature);
        int name = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? proto.getName() : jvmMethodSignature.getName();
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List listQ = v.q(ProtoTypeTableUtilKt.receiverType(proto, typeTable));
            List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
            s.j(valueParameterList, "getValueParameterList(...)");
            List<ProtoBuf.ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            for (ProtoBuf.ValueParameter valueParameter : list) {
                s.h(valueParameter);
                arrayList.add(ProtoTypeTableUtilKt.type(valueParameter, typeTable));
            }
            List listP0 = v.P0(listQ, arrayList);
            ArrayList arrayList2 = new ArrayList(v.y(listP0, 10));
            Iterator it = listP0.iterator();
            while (it.hasNext()) {
                String strA = INSTANCE.a((ProtoBuf.Type) it.next(), nameResolver);
                if (strA == null) {
                    return null;
                }
                arrayList2.add(strA);
            }
            String strA2 = a(ProtoTypeTableUtilKt.returnType(proto, typeTable), nameResolver);
            if (strA2 == null) {
                return null;
            }
            string = v.y0(arrayList2, "", "(", ")", 0, null, null, 56, null) + strA2;
        } else {
            string = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new JvmMemberSignature.Method(nameResolver.getString(name), string);
    }

    public static final Pair<JvmNameResolver, ProtoBuf.Class> readClassDataFrom(byte[] bytes, String[] strings) {
        s.k(bytes, "bytes");
        s.k(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(INSTANCE.b(byteArrayInputStream, strings), ProtoBuf.Class.parseFrom(byteArrayInputStream, f88162a));
    }

    public static final Pair<JvmNameResolver, ProtoBuf.Package> readPackageDataFrom(byte[] bytes, String[] strings) {
        s.k(bytes, "bytes");
        s.k(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(INSTANCE.b(byteArrayInputStream, strings), ProtoBuf.Package.parseFrom(byteArrayInputStream, f88162a));
    }
}
