package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public interface ResolutionScope {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection getContributedDescriptors$default(ResolutionScope resolutionScope, DescriptorKindFilter descriptorKindFilter, l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i11 & 1) != 0) {
                descriptorKindFilter = DescriptorKindFilter.ALL;
            }
            if ((i11 & 2) != 0) {
                lVar = MemberScope.Companion.getALL_NAME_FILTER();
            }
            return resolutionScope.getContributedDescriptors(descriptorKindFilter, lVar);
        }

        public static void recordLookup(ResolutionScope resolutionScope, Name name, LookupLocation location) {
            s.k(name, "name");
            s.k(location, "location");
            resolutionScope.getContributedFunctions(name, location);
        }
    }

    /* JADX INFO: renamed from: getContributedClassifier */
    ClassifierDescriptor mo501getContributedClassifier(Name name, LookupLocation lookupLocation);

    Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, l<? super Name, Boolean> lVar);

    Collection<? extends FunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation);

    /* JADX INFO: renamed from: recordLookup */
    void mo504recordLookup(Name name, LookupLocation lookupLocation);
}
