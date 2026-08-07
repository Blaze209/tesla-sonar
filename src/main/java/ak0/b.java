package ak0;

import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.EmbeddedVCardException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Agent;
import ezvcard.property.VCardProperty;

/* JADX INFO: loaded from: classes8.dex */
public class b extends g1<Agent> {

    private static class a implements EmbeddedVCardException.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Agent f1734a;

        public a(Agent agent) {
            this.f1734a = agent;
        }

        @Override // ezvcard.io.EmbeddedVCardException.a
        public VCardProperty a() {
            return this.f1734a;
        }

        @Override // ezvcard.io.EmbeddedVCardException.a
        public void b(VCard vCard) {
            this.f1734a.setVCard(vCard);
        }
    }

    public b() {
        super(Agent.class, "AGENT");
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Agent b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        Agent agent = new Agent();
        if (vCardDataType == null) {
            throw new EmbeddedVCardException(new a(agent));
        }
        agent.setUrl(gq.e.f(str));
        return agent;
    }
}
