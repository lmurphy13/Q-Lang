/* 
 * node.h
 *
 * Header file for AST nodes
 * Adapted from: https://gnuu.org/2009/09/18/writing-your-own-toy-compiler/
 * Author: Liam M. Murphy
 */

#include <iostream>
#include <vector>
#include <llvm/Value.h>

class CodeGenContext;
class NStatement;
class NExpression;
class NVariableDecl;

typedef std::vector<NStatement*> StatementList;
typedef std::vector<NExpression*> ExpressionList;
typedef std::vector<NVariableDeclaration*> VariableList;

class Node {
	public:
		virtual ~Node() {}
		virtual llvm::Value* codeGen(CodeGenContext& context) { }
};

class NExpression : public Node {
};

class NStatement : public Node {
};

class NInteger : public NExpression {
	public:
		long long value;
		NInteger (long long value) : value(value) { }
		virtual llvm::Value* codeGen(CodeGenContext& context);
};

class NFloat : public NExpression {
	float value;
	NFloat(float value) : value(value) { }
	virtual llvm::Value* codeGen(CodeGenContext& context);
};

class NIdentifier : public NExpression {
	public:
		std::string name;
		NIdentifier(const std::string& name) : name(name) { }
		virtual llvm::Value* codeGen(CodeGenContext& context);
};

class NFunctionCall : public NExpression {
	public:
		const NIdentifier& id;
		ExpressionList arguments;
		NFunctionCall(const NIdentifier& id, ExpressionList& arguments) :
			id(id), arguments(arguments) { }
		NFunctionCall(const NIdentifier& id) : id(id) { }
		virtual llvm::Value* codeGen(CodeGenContext& context);
};

class NBinaryOpExpr : public NExpression {
	public:
		int op;
		NExpression& lhs;
		NExpression& rhs;
		NBinaryOpExpr(NExpression& lhs, int op, NExpression& rhs) :
			lhs(lhs), rhs(rhs), op(op) { }
		virtual llvm::Value* codeGen(CodeGenContext& context);
};

class NAssignment : public NExpression {
	public:
		NIdentifier& lhs;
		NExpression& rhs;
		NAssignment(NIdentifier& lhs, NExpression& rhs) :
			lhs(lhs), rhs(rhs) { }
		virtual llvm::Value* codeGen(CodeGenContext& context);
};

class 





