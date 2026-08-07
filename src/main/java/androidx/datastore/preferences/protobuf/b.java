package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<MessageType extends p0> implements x0<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f8039a = n.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).f() : new UninitializedMessageException(messagetype);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType b(g gVar, n nVar) {
        return (MessageType) c(f(gVar, nVar));
    }

    public MessageType f(g gVar, n nVar) throws InvalidProtocolBufferException {
        h hVarM = gVar.m();
        MessageType messagetypeA = a(hVarM, nVar);
        try {
            hVarM.a(0);
            return messagetypeA;
        } catch (InvalidProtocolBufferException e11) {
            throw e11.k(messagetypeA);
        }
    }
}
