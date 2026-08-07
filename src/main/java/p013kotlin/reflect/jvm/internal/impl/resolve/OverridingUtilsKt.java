package p013kotlin.reflect.jvm.internal.impl.resolve;

import a.a;
import java.util.Collection;
import java.util.LinkedList;
import jn0.h0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class OverridingUtilsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(SmartSet smartSet, Object obj) {
        s.h(obj);
        smartSet.add(obj);
        return h0.f84049a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(Collection<? extends H> collection, l<? super H, ? extends CallableDescriptor> descriptorByHandle) {
        s.k(collection, "<this>");
        s.k(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet smartSetCreate = SmartSet.Companion.create();
        while (!linkedList.isEmpty()) {
            Object objO0 = v.o0(linkedList);
            SmartSet smartSetCreate2 = SmartSet.Companion.create();
            Collection<a.b> collectionExtractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(objO0, linkedList, descriptorByHandle, new f(smartSetCreate2));
            s.j(collectionExtractMembersOverridableInBothWays, "extractMembersOverridableInBothWays(...)");
            if (collectionExtractMembersOverridableInBothWays.size() == 1 && smartSetCreate2.isEmpty()) {
                Object objT0 = v.T0(collectionExtractMembersOverridableInBothWays);
                s.j(objT0, "single(...)");
                smartSetCreate.add(objT0);
            } else {
                a.c cVar = (Object) OverridingUtil.selectMostSpecificMember(collectionExtractMembersOverridableInBothWays, descriptorByHandle);
                CallableDescriptor callableDescriptorInvoke = descriptorByHandle.invoke(cVar);
                for (a.b bVar : collectionExtractMembersOverridableInBothWays) {
                    s.h(bVar);
                    if (!OverridingUtil.isMoreSpecific(callableDescriptorInvoke, descriptorByHandle.invoke(bVar))) {
                        smartSetCreate2.add(bVar);
                    }
                }
                if (!smartSetCreate2.isEmpty()) {
                    smartSetCreate.addAll(smartSetCreate2);
                }
                smartSetCreate.add(cVar);
            }
        }
        return smartSetCreate;
    }
}
