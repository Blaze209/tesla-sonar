package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.PropertyContainer;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public class NodeToStringTransformer {
    final Node node;
    final PropertyContainer propertyContainer0;
    final PropertyContainer propertyContainer1;

    /* JADX INFO: renamed from: ch.qos.logback.core.subst.NodeToStringTransformer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Node$Type;

        static {
            int[] iArr = new int[Node.Type.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Node$Type = iArr;
            try {
                iArr[Node.Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Node$Type[Node.Type.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public NodeToStringTransformer(Node node, PropertyContainer propertyContainer) {
        this(node, propertyContainer, null);
    }

    private void compileNode(Node node, StringBuilder sb2, Stack<Node> stack) {
        while (node != null) {
            int i11 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Node$Type[node.type.ordinal()];
            if (i11 == 1) {
                handleLiteral(node, sb2);
            } else if (i11 == 2) {
                handleVariable(node, sb2, stack);
            }
            node = node.next;
        }
    }

    private String constructRecursionErrorMessage(Stack<Node> stack) {
        StringBuilder sb2 = new StringBuilder("Circular variable reference detected while parsing input [");
        for (Node node : stack) {
            sb2.append("${");
            sb2.append(variableNodeValue(node));
            sb2.append("}");
            if (stack.lastElement() != node) {
                sb2.append(" --> ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    private boolean equalNodes(Node node, Node node2) {
        Node.Type type = node.type;
        if (type != null && !type.equals(node2.type)) {
            return false;
        }
        Object obj = node.payload;
        if (obj != null && !obj.equals(node2.payload)) {
            return false;
        }
        Object obj2 = node.defaultPart;
        return obj2 == null || obj2.equals(node2.defaultPart);
    }

    private void handleLiteral(Node node, StringBuilder sb2) {
        sb2.append((String) node.payload);
    }

    private void handleVariable(Node node, StringBuilder sb2, Stack<Node> stack) {
        boolean zHaveVisitedNodeAlready = haveVisitedNodeAlready(node, stack);
        stack.push(node);
        if (zHaveVisitedNodeAlready) {
            throw new IllegalArgumentException(constructRecursionErrorMessage(stack));
        }
        StringBuilder sb3 = new StringBuilder();
        compileNode((Node) node.payload, sb3, stack);
        String string = sb3.toString();
        String strLookupKey = lookupKey(string);
        if (strLookupKey != null) {
            compileNode(tokenizeAndParseString(strLookupKey), sb2, stack);
            stack.pop();
            return;
        }
        Object obj = node.defaultPart;
        if (obj != null) {
            StringBuilder sb4 = new StringBuilder();
            compileNode((Node) obj, sb4, stack);
            stack.pop();
            sb2.append(sb4.toString());
            return;
        }
        sb2.append(string + CoreConstants.UNDEFINED_PROPERTY_SUFFIX);
        stack.pop();
    }

    private boolean haveVisitedNodeAlready(Node node, Stack<Node> stack) {
        Iterator<Node> it = stack.iterator();
        while (it.hasNext()) {
            if (equalNodes(node, it.next())) {
                return true;
            }
        }
        return false;
    }

    private String lookupKey(String str) {
        String property;
        String property2 = this.propertyContainer0.getProperty(str);
        if (property2 != null) {
            return property2;
        }
        PropertyContainer propertyContainer = this.propertyContainer1;
        if (propertyContainer != null && (property = propertyContainer.getProperty(str)) != null) {
            return property;
        }
        String systemProperty = OptionHelper.getSystemProperty(str, null);
        if (systemProperty != null) {
            return systemProperty;
        }
        String env = OptionHelper.getEnv(str);
        if (env != null) {
            return env;
        }
        return null;
    }

    public static String substituteVariable(String str, PropertyContainer propertyContainer, PropertyContainer propertyContainer2) {
        return new NodeToStringTransformer(tokenizeAndParseString(str), propertyContainer, propertyContainer2).transform();
    }

    private static Node tokenizeAndParseString(String str) {
        return new Parser(new Tokenizer(str).tokenize()).parse();
    }

    private String variableNodeValue(Node node) {
        return (String) ((Node) node.payload).payload;
    }

    public String transform() {
        StringBuilder sb2 = new StringBuilder();
        compileNode(this.node, sb2, new Stack<>());
        return sb2.toString();
    }

    public NodeToStringTransformer(Node node, PropertyContainer propertyContainer, PropertyContainer propertyContainer2) {
        this.node = node;
        this.propertyContainer0 = propertyContainer;
        this.propertyContainer1 = propertyContainer2;
    }
}
