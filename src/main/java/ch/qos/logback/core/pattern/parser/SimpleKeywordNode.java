package ch.qos.logback.core.pattern.parser;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleKeywordNode extends FormattingNode {
    List<String> optionList;

    protected SimpleKeywordNode(int i11, Object obj) {
        super(i11, obj);
    }

    @Override // ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof SimpleKeywordNode)) {
            return false;
        }
        List<String> list = this.optionList;
        List<String> list2 = ((SimpleKeywordNode) obj).optionList;
        if (list != null) {
            return list.equals(list2);
        }
        return list2 == null;
    }

    public List<String> getOptions() {
        return this.optionList;
    }

    @Override // ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        return super.hashCode();
    }

    public void setOptions(List<String> list) {
        this.optionList = list;
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        if (this.optionList == null) {
            sb2 = new StringBuilder();
            sb2.append("KeyWord(");
            sb2.append(this.value);
            sb2.append(",");
            obj = this.formatInfo;
        } else {
            sb2 = new StringBuilder();
            sb2.append("KeyWord(");
            sb2.append(this.value);
            sb2.append(", ");
            sb2.append(this.formatInfo);
            sb2.append(",");
            obj = this.optionList;
        }
        sb2.append(obj);
        sb2.append(")");
        sb3.append(sb2.toString());
        sb3.append(printNext());
        return sb3.toString();
    }

    SimpleKeywordNode(Object obj) {
        super(1, obj);
    }
}
