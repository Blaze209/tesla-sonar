package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class DERExternalParser implements ASN1ExternalParser {
    private ASN1StreamParser _parser;

    public DERExternalParser(ASN1StreamParser aSN1StreamParser) {
        this._parser = aSN1StreamParser;
    }

    static DLExternal parse(ASN1StreamParser aSN1StreamParser) throws ASN1Exception {
        try {
            return new DLExternal(new DLSequence(aSN1StreamParser.readVector()));
        } catch (IllegalArgumentException e11) {
            throw new ASN1Exception(e11.getMessage(), e11);
        }
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return parse(this._parser);
    }

    @Override // org.bouncycastle.asn1.ASN1ExternalParser
    public ASN1Encodable readObject() {
        return this._parser.readObject();
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e11) {
            throw new ASN1ParsingException("unable to get DER object", e11);
        } catch (IllegalArgumentException e12) {
            throw new ASN1ParsingException("unable to get DER object", e12);
        }
    }
}
