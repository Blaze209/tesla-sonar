package p013kotlin.reflect.jvm.internal.impl.descriptors;

import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes9.dex */
public interface ReceiverParameterDescriptor extends ParameterDescriptor {
    ReceiverValue getValue();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    ReceiverParameterDescriptor substitute(TypeSubstitutor typeSubstitutor);
}
