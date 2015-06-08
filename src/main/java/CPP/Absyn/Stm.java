package CPP.Absyn; // Java Package generated by the BNF Converter.

public abstract class Stm implements java.io.Serializable {
    public abstract <R, A> R accept(Stm.Visitor<R, A> v, A arg);

    public interface Visitor<R, A> {
        R visit(CPP.Absyn.SExp p, A arg);

        R visit(CPP.Absyn.SDecls p, A arg);

        R visit(CPP.Absyn.SInit p, A arg);

        R visit(CPP.Absyn.SReturn p, A arg);

        R visit(CPP.Absyn.SReturnVoid p, A arg);

        R visit(CPP.Absyn.SWhile p, A arg);

        R visit(CPP.Absyn.SBlock p, A arg);

        R visit(CPP.Absyn.SIfElse p, A arg);

    }

}
