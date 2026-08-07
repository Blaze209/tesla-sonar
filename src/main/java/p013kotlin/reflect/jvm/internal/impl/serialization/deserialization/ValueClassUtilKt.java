package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.x;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import p013kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class ValueClassUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends SimpleTypeMarker> ValueClassRepresentation<T> loadValueClassRepresentation(ProtoBuf.Class r11, NameResolver nameResolver, TypeTable typeTable, l<? super ProtoBuf.Type, ? extends T> typeDeserializer, l<? super Name, ? extends T> typeOfPublicProperty) {
        T tInvoke;
        List<ProtoBuf.Type> multiFieldValueClassUnderlyingTypeList;
        s.k(r11, "<this>");
        s.k(nameResolver, "nameResolver");
        s.k(typeTable, "typeTable");
        s.k(typeDeserializer, "typeDeserializer");
        s.k(typeOfPublicProperty, "typeOfPublicProperty");
        if (r11.getMultiFieldValueClassUnderlyingNameCount() <= 0) {
            if (!r11.hasInlineClassUnderlyingPropertyName()) {
                return null;
            }
            Name name = NameResolverUtilKt.getName(nameResolver, r11.getInlineClassUnderlyingPropertyName());
            ProtoBuf.Type typeInlineClassUnderlyingType = ProtoTypeTableUtilKt.inlineClassUnderlyingType(r11, typeTable);
            if ((typeInlineClassUnderlyingType != null && (tInvoke = typeDeserializer.invoke(typeInlineClassUnderlyingType)) != null) || (tInvoke = typeOfPublicProperty.invoke(name)) != null) {
                return new InlineClassRepresentation(name, tInvoke);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.getName(nameResolver, r11.getFqName()) + " with property " + name).toString());
        }
        List<Integer> multiFieldValueClassUnderlyingNameList = r11.getMultiFieldValueClassUnderlyingNameList();
        s.j(multiFieldValueClassUnderlyingNameList, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list = multiFieldValueClassUnderlyingNameList;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (Integer num : list) {
            s.h(num);
            arrayList.add(NameResolverUtilKt.getName(nameResolver, num.intValue()));
        }
        Pair pairA = x.a(Integer.valueOf(r11.getMultiFieldValueClassUnderlyingTypeIdCount()), Integer.valueOf(r11.getMultiFieldValueClassUnderlyingTypeCount()));
        if (s.f(pairA, x.a(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> multiFieldValueClassUnderlyingTypeIdList = r11.getMultiFieldValueClassUnderlyingTypeIdList();
            s.j(multiFieldValueClassUnderlyingTypeIdList, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list2 = multiFieldValueClassUnderlyingTypeIdList;
            multiFieldValueClassUnderlyingTypeList = new ArrayList<>(v.y(list2, 10));
            for (Integer num2 : list2) {
                s.h(num2);
                multiFieldValueClassUnderlyingTypeList.add(typeTable.get(num2.intValue()));
            }
        } else {
            if (!s.f(pairA, x.a(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + NameResolverUtilKt.getName(nameResolver, r11.getFqName()) + " has illegal multi-field value class representation").toString());
            }
            multiFieldValueClassUnderlyingTypeList = r11.getMultiFieldValueClassUnderlyingTypeList();
        }
        s.h(multiFieldValueClassUnderlyingTypeList);
        List<ProtoBuf.Type> list3 = multiFieldValueClassUnderlyingTypeList;
        ArrayList arrayList2 = new ArrayList(v.y(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.invoke(it.next()));
        }
        return new MultiFieldValueClassRepresentation(v.v1(arrayList, arrayList2));
    }
}
