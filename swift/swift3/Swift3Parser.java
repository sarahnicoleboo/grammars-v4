// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Swift3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, Platform_name_platform_version=130, 
		Identifier=131, DOT=132, LCURLY=133, LPAREN=134, LBRACK=135, RCURLY=136, 
		RPAREN=137, RBRACK=138, COMMA=139, COLON=140, SEMI=141, LT=142, GT=143, 
		UNDERSCORE=144, BANG=145, QUESTION=146, AT=147, AND=148, SUB=149, EQUAL=150, 
		OR=151, DIV=152, ADD=153, MUL=154, MOD=155, CARET=156, TILDE=157, Operator_head_other=158, 
		Operator_following_character=159, Implicit_parameter_name=160, Binary_literal=161, 
		Octal_literal=162, Decimal_literal=163, Pure_decimal_digits=164, Hexadecimal_literal=165, 
		Floating_point_literal=166, Static_string_literal=167, Interpolated_string_literal=168, 
		WS=169, Block_comment=170, Line_comment=171;
	public static final int
		RULE_top_level = 0, RULE_statement = 1, RULE_statements = 2, RULE_statements_impl = 3, 
		RULE_loop_statement = 4, RULE_for_statement = 5, RULE_for_init = 6, RULE_for_in_statement = 7, 
		RULE_while_statement = 8, RULE_condition_list = 9, RULE_condition = 10, 
		RULE_case_condition = 11, RULE_optional_binding_condition = 12, RULE_repeat_while_statement = 13, 
		RULE_branch_statement = 14, RULE_if_statement = 15, RULE_else_clause = 16, 
		RULE_guard_statement = 17, RULE_switch_statement = 18, RULE_switch_cases = 19, 
		RULE_switch_case = 20, RULE_case_label = 21, RULE_case_item_list = 22, 
		RULE_default_label = 23, RULE_where_clause = 24, RULE_where_expression = 25, 
		RULE_labeled_statement = 26, RULE_statement_label = 27, RULE_label_name = 28, 
		RULE_control_transfer_statement = 29, RULE_break_statement = 30, RULE_continue_statement = 31, 
		RULE_fallthrough_statement = 32, RULE_return_statement = 33, RULE_throw_statement = 34, 
		RULE_defer_statement = 35, RULE_do_statement = 36, RULE_catch_clauses = 37, 
		RULE_catch_clause = 38, RULE_compiler_control_statement = 39, RULE_conditional_compilation_block = 40, 
		RULE_if_directive_clause = 41, RULE_elseif_directive_clauses = 42, RULE_elseif_directive_clause = 43, 
		RULE_else_directive_clause = 44, RULE_if_directive = 45, RULE_elseif_directive = 46, 
		RULE_else_directive = 47, RULE_endif_directive = 48, RULE_compilation_condition = 49, 
		RULE_platform_condition = 50, RULE_swift_version = 51, RULE_operating_system = 52, 
		RULE_architecture = 53, RULE_line_control_statement = 54, RULE_line_number = 55, 
		RULE_file_name = 56, RULE_availability_condition = 57, RULE_availability_arguments = 58, 
		RULE_availability_argument = 59, RULE_generic_parameter_clause = 60, RULE_generic_parameter_list = 61, 
		RULE_generic_parameter = 62, RULE_generic_where_clause = 63, RULE_requirement_list = 64, 
		RULE_requirement = 65, RULE_conformance_requirement = 66, RULE_same_type_requirement = 67, 
		RULE_generic_argument_clause = 68, RULE_generic_argument_list = 69, RULE_generic_argument = 70, 
		RULE_declaration = 71, RULE_declarations = 72, RULE_top_level_declaration = 73, 
		RULE_code_block = 74, RULE_import_declaration = 75, RULE_import_kind = 76, 
		RULE_import_path = 77, RULE_import_path_identifier = 78, RULE_constant_declaration = 79, 
		RULE_pattern_initializer_list = 80, RULE_pattern_initializer = 81, RULE_initializer = 82, 
		RULE_variable_declaration = 83, RULE_variable_declaration_head = 84, RULE_variable_name = 85, 
		RULE_getter_setter_block = 86, RULE_getter_clause = 87, RULE_setter_clause = 88, 
		RULE_setter_name = 89, RULE_getter_setter_keyword_block = 90, RULE_getter_keyword_clause = 91, 
		RULE_setter_keyword_clause = 92, RULE_willSet_didSet_block = 93, RULE_willSet_clause = 94, 
		RULE_didSet_clause = 95, RULE_typealias_declaration = 96, RULE_typealias_name = 97, 
		RULE_typealias_assignment = 98, RULE_function_declaration = 99, RULE_function_head = 100, 
		RULE_function_name = 101, RULE_function_signature = 102, RULE_function_result = 103, 
		RULE_function_body = 104, RULE_parameter_clause = 105, RULE_parameter_list = 106, 
		RULE_parameter = 107, RULE_external_parameter_name = 108, RULE_local_parameter_name = 109, 
		RULE_default_argument_clause = 110, RULE_enum_declaration = 111, RULE_union_style_enum = 112, 
		RULE_union_style_enum_members = 113, RULE_union_style_enum_member = 114, 
		RULE_union_style_enum_case_clause = 115, RULE_union_style_enum_case_list = 116, 
		RULE_union_style_enum_case = 117, RULE_enum_name = 118, RULE_enum_case_name = 119, 
		RULE_raw_value_style_enum = 120, RULE_raw_value_style_enum_members = 121, 
		RULE_raw_value_style_enum_member = 122, RULE_raw_value_style_enum_case_clause = 123, 
		RULE_raw_value_style_enum_case_list = 124, RULE_raw_value_style_enum_case = 125, 
		RULE_raw_value_assignment = 126, RULE_raw_value_literal = 127, RULE_struct_declaration = 128, 
		RULE_struct_name = 129, RULE_struct_body = 130, RULE_struct_member = 131, 
		RULE_class_declaration = 132, RULE_class_name = 133, RULE_class_body = 134, 
		RULE_class_member = 135, RULE_protocol_declaration = 136, RULE_protocol_name = 137, 
		RULE_protocol_body = 138, RULE_protocol_member = 139, RULE_protocol_member_declaration = 140, 
		RULE_protocol_property_declaration = 141, RULE_protocol_method_declaration = 142, 
		RULE_protocol_initializer_declaration = 143, RULE_protocol_subscript_declaration = 144, 
		RULE_protocol_associated_type_declaration = 145, RULE_initializer_declaration = 146, 
		RULE_initializer_head = 147, RULE_initializer_body = 148, RULE_deinitializer_declaration = 149, 
		RULE_extension_declaration = 150, RULE_extension_body = 151, RULE_extension_member = 152, 
		RULE_subscript_declaration = 153, RULE_subscript_head = 154, RULE_subscript_result = 155, 
		RULE_operator_declaration = 156, RULE_prefix_operator_declaration = 157, 
		RULE_postfix_operator_declaration = 158, RULE_infix_operator_declaration = 159, 
		RULE_infix_operator_group = 160, RULE_precedence_group_declaration = 161, 
		RULE_precedence_group_attribute = 162, RULE_precedence_group_relation = 163, 
		RULE_precedence_group_assignment = 164, RULE_precedence_group_associativity = 165, 
		RULE_associativity_ = 166, RULE_precedence_group_names = 167, RULE_precedence_group_name = 168, 
		RULE_declaration_modifier = 169, RULE_declaration_modifiers = 170, RULE_access_level_modifier = 171, 
		RULE_mutation_modifier = 172, RULE_pattern = 173, RULE_wildcard_pattern = 174, 
		RULE_identifier_pattern = 175, RULE_value_binding_pattern = 176, RULE_tuple_pattern = 177, 
		RULE_tuple_pattern_element_list = 178, RULE_tuple_pattern_element = 179, 
		RULE_enum_case_pattern = 180, RULE_optional_pattern = 181, RULE_expression_pattern = 182, 
		RULE_attribute = 183, RULE_attribute_name = 184, RULE_attribute_argument_clause = 185, 
		RULE_attributes = 186, RULE_balanced_tokens = 187, RULE_balanced_token = 188, 
		RULE_any_punctuation_for_balanced_token = 189, RULE_expression = 190, 
		RULE_expression_list = 191, RULE_prefix_expression = 192, RULE_in_out_expression = 193, 
		RULE_try_operator = 194, RULE_binary_expression = 195, RULE_binary_expressions = 196, 
		RULE_conditional_operator = 197, RULE_type_casting_operator = 198, RULE_primary_expression = 199, 
		RULE_literal_expression = 200, RULE_array_literal = 201, RULE_array_literal_items = 202, 
		RULE_array_literal_item = 203, RULE_dictionary_literal = 204, RULE_dictionary_literal_items = 205, 
		RULE_dictionary_literal_item = 206, RULE_playground_literal = 207, RULE_self_expression = 208, 
		RULE_superclass_expression = 209, RULE_superclass_method_expression = 210, 
		RULE_superclass_subscript_expression = 211, RULE_superclass_initializer_expression = 212, 
		RULE_closure_expression = 213, RULE_closure_signature = 214, RULE_closure_parameter_clause = 215, 
		RULE_closure_parameter_clause_identifier_list = 216, RULE_closure_parameter_list = 217, 
		RULE_closure_parameter = 218, RULE_closure_parameter_name = 219, RULE_capture_list = 220, 
		RULE_capture_list_items = 221, RULE_capture_list_item = 222, RULE_capture_specifier = 223, 
		RULE_implicit_member_expression = 224, RULE_parenthesized_expression = 225, 
		RULE_tuple_expression = 226, RULE_tuple_element = 227, RULE_wildcard_expression = 228, 
		RULE_selector_expression = 229, RULE_key_path_expression = 230, RULE_postfix_expression = 231, 
		RULE_function_call_argument_clause = 232, RULE_function_call_argument_list = 233, 
		RULE_function_call_argument = 234, RULE_trailing_closure = 235, RULE_argument_names = 236, 
		RULE_argument_name = 237, RULE_dynamic_type_expression = 238, RULE_type_ = 239, 
		RULE_type_annotation = 240, RULE_type_identifier = 241, RULE_type_name = 242, 
		RULE_tuple_type = 243, RULE_tuple_type_element_list = 244, RULE_tuple_type_element = 245, 
		RULE_element_name = 246, RULE_function_type = 247, RULE_function_type_argument_clause = 248, 
		RULE_function_type_argument_list = 249, RULE_function_type_argument = 250, 
		RULE_argument_label = 251, RULE_array_type = 252, RULE_dictionary_type = 253, 
		RULE_protocol_composition_type = 254, RULE_protocol_identifier = 255, 
		RULE_type_inheritance_clause = 256, RULE_type_inheritance_list = 257, 
		RULE_class_requirement = 258, RULE_declaration_identifier = 259, RULE_label_identifier = 260, 
		RULE_keyword_as_identifier_in_declarations = 261, RULE_keyword_as_identifier_in_labels = 262, 
		RULE_assignment_operator = 263, RULE_negate_prefix_operator = 264, RULE_compilation_condition_AND = 265, 
		RULE_compilation_condition_OR = 266, RULE_compilation_condition_GE = 267, 
		RULE_arrow_operator = 268, RULE_range_operator = 269, RULE_same_type_equals = 270, 
		RULE_binary_operator = 271, RULE_prefix_operator = 272, RULE_postfix_operator = 273, 
		RULE_operator_ = 274, RULE_operator_character = 275, RULE_operator_head = 276, 
		RULE_dot_operator_head = 277, RULE_dot_operator_character = 278, RULE_literal = 279, 
		RULE_numeric_literal = 280, RULE_boolean_literal = 281, RULE_nil_literal = 282, 
		RULE_integer_literal = 283, RULE_string_literal = 284;
	private static String[] makeRuleNames() {
		return new String[] {
			"top_level", "statement", "statements", "statements_impl", "loop_statement", 
			"for_statement", "for_init", "for_in_statement", "while_statement", "condition_list", 
			"condition", "case_condition", "optional_binding_condition", "repeat_while_statement", 
			"branch_statement", "if_statement", "else_clause", "guard_statement", 
			"switch_statement", "switch_cases", "switch_case", "case_label", "case_item_list", 
			"default_label", "where_clause", "where_expression", "labeled_statement", 
			"statement_label", "label_name", "control_transfer_statement", "break_statement", 
			"continue_statement", "fallthrough_statement", "return_statement", "throw_statement", 
			"defer_statement", "do_statement", "catch_clauses", "catch_clause", "compiler_control_statement", 
			"conditional_compilation_block", "if_directive_clause", "elseif_directive_clauses", 
			"elseif_directive_clause", "else_directive_clause", "if_directive", "elseif_directive", 
			"else_directive", "endif_directive", "compilation_condition", "platform_condition", 
			"swift_version", "operating_system", "architecture", "line_control_statement", 
			"line_number", "file_name", "availability_condition", "availability_arguments", 
			"availability_argument", "generic_parameter_clause", "generic_parameter_list", 
			"generic_parameter", "generic_where_clause", "requirement_list", "requirement", 
			"conformance_requirement", "same_type_requirement", "generic_argument_clause", 
			"generic_argument_list", "generic_argument", "declaration", "declarations", 
			"top_level_declaration", "code_block", "import_declaration", "import_kind", 
			"import_path", "import_path_identifier", "constant_declaration", "pattern_initializer_list", 
			"pattern_initializer", "initializer", "variable_declaration", "variable_declaration_head", 
			"variable_name", "getter_setter_block", "getter_clause", "setter_clause", 
			"setter_name", "getter_setter_keyword_block", "getter_keyword_clause", 
			"setter_keyword_clause", "willSet_didSet_block", "willSet_clause", "didSet_clause", 
			"typealias_declaration", "typealias_name", "typealias_assignment", "function_declaration", 
			"function_head", "function_name", "function_signature", "function_result", 
			"function_body", "parameter_clause", "parameter_list", "parameter", "external_parameter_name", 
			"local_parameter_name", "default_argument_clause", "enum_declaration", 
			"union_style_enum", "union_style_enum_members", "union_style_enum_member", 
			"union_style_enum_case_clause", "union_style_enum_case_list", "union_style_enum_case", 
			"enum_name", "enum_case_name", "raw_value_style_enum", "raw_value_style_enum_members", 
			"raw_value_style_enum_member", "raw_value_style_enum_case_clause", "raw_value_style_enum_case_list", 
			"raw_value_style_enum_case", "raw_value_assignment", "raw_value_literal", 
			"struct_declaration", "struct_name", "struct_body", "struct_member", 
			"class_declaration", "class_name", "class_body", "class_member", "protocol_declaration", 
			"protocol_name", "protocol_body", "protocol_member", "protocol_member_declaration", 
			"protocol_property_declaration", "protocol_method_declaration", "protocol_initializer_declaration", 
			"protocol_subscript_declaration", "protocol_associated_type_declaration", 
			"initializer_declaration", "initializer_head", "initializer_body", "deinitializer_declaration", 
			"extension_declaration", "extension_body", "extension_member", "subscript_declaration", 
			"subscript_head", "subscript_result", "operator_declaration", "prefix_operator_declaration", 
			"postfix_operator_declaration", "infix_operator_declaration", "infix_operator_group", 
			"precedence_group_declaration", "precedence_group_attribute", "precedence_group_relation", 
			"precedence_group_assignment", "precedence_group_associativity", "associativity_", 
			"precedence_group_names", "precedence_group_name", "declaration_modifier", 
			"declaration_modifiers", "access_level_modifier", "mutation_modifier", 
			"pattern", "wildcard_pattern", "identifier_pattern", "value_binding_pattern", 
			"tuple_pattern", "tuple_pattern_element_list", "tuple_pattern_element", 
			"enum_case_pattern", "optional_pattern", "expression_pattern", "attribute", 
			"attribute_name", "attribute_argument_clause", "attributes", "balanced_tokens", 
			"balanced_token", "any_punctuation_for_balanced_token", "expression", 
			"expression_list", "prefix_expression", "in_out_expression", "try_operator", 
			"binary_expression", "binary_expressions", "conditional_operator", "type_casting_operator", 
			"primary_expression", "literal_expression", "array_literal", "array_literal_items", 
			"array_literal_item", "dictionary_literal", "dictionary_literal_items", 
			"dictionary_literal_item", "playground_literal", "self_expression", "superclass_expression", 
			"superclass_method_expression", "superclass_subscript_expression", "superclass_initializer_expression", 
			"closure_expression", "closure_signature", "closure_parameter_clause", 
			"closure_parameter_clause_identifier_list", "closure_parameter_list", 
			"closure_parameter", "closure_parameter_name", "capture_list", "capture_list_items", 
			"capture_list_item", "capture_specifier", "implicit_member_expression", 
			"parenthesized_expression", "tuple_expression", "tuple_element", "wildcard_expression", 
			"selector_expression", "key_path_expression", "postfix_expression", "function_call_argument_clause", 
			"function_call_argument_list", "function_call_argument", "trailing_closure", 
			"argument_names", "argument_name", "dynamic_type_expression", "type_", 
			"type_annotation", "type_identifier", "type_name", "tuple_type", "tuple_type_element_list", 
			"tuple_type_element", "element_name", "function_type", "function_type_argument_clause", 
			"function_type_argument_list", "function_type_argument", "argument_label", 
			"array_type", "dictionary_type", "protocol_composition_type", "protocol_identifier", 
			"type_inheritance_clause", "type_inheritance_list", "class_requirement", 
			"declaration_identifier", "label_identifier", "keyword_as_identifier_in_declarations", 
			"keyword_as_identifier_in_labels", "assignment_operator", "negate_prefix_operator", 
			"compilation_condition_AND", "compilation_condition_OR", "compilation_condition_GE", 
			"arrow_operator", "range_operator", "same_type_equals", "binary_operator", 
			"prefix_operator", "postfix_operator", "operator_", "operator_character", 
			"operator_head", "dot_operator_head", "dot_operator_character", "literal", 
			"numeric_literal", "boolean_literal", "nil_literal", "integer_literal", 
			"string_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'case'", "'in'", "'while'", "'let'", "'var'", "'repeat'", 
			"'if'", "'else'", "'guard'", "'switch'", "'default'", "'where'", "'break'", 
			"'continue'", "'fallthrough'", "'return'", "'throw'", "'defer'", "'do'", 
			"'catch'", "'#if'", "'#elseif'", "'#else'", "'#endif'", "'os'", "'arch'", 
			"'swift'", "'#sourceLocation'", "'file'", "'line'", "'#available'", "'import'", 
			"'typealias'", "'struct'", "'class'", "'enum'", "'protocol'", "'func'", 
			"'get'", "'set'", "'willSet'", "'didSet'", "'throws'", "'rethrows'", 
			"'indirect'", "'final'", "'associatedtype'", "'init'", "'deinit'", "'extension'", 
			"'subscript'", "'prefix'", "'operator'", "'postfix'", "'infix'", "'precedencegroup'", 
			"'higherThan'", "'lowerThan'", "'assignment'", "'associativity'", "'left'", 
			"'right'", "'none'", "'convenience'", "'dynamic'", "'lazy'", "'optional'", 
			"'override'", "'required'", "'static'", "'unowned'", "'safe'", "'unsafe'", 
			"'weak'", "'private'", "'fileprivate'", "'internal'", "'public'", "'open'", 
			"'mutating'", "'nonmutating'", "'is'", "'as'", "'#'", "'`'", "'try'", 
			"'#file'", "'#line'", "'#column'", "'#function'", "'#dsohandle'", "'#colorLiteral'", 
			"'red'", "'green'", "'blue'", "'alpha'", "'#fileLiteral'", "'resourceName'", 
			"'#imageLiteral'", "'self'", "'Self'", "'super'", "'unowned(safe)'", 
			"'unowned(unsafe)'", "'#selector'", "'getter:'", "'setter:'", "'#keyPath'", 
			"'type'", "'of'", "'Type'", "'Protocol'", "'Any'", "'inout'", "'arm'", 
			"'arm64'", "'i386'", "'iOS'", "'iOSApplicationExtension'", "'macOS'", 
			"'macOSApplicationExtension'", "'precedence'", "'tvOS'", "'watchOS'", 
			"'x86_64'", "'false'", "'nil'", "'true'", null, null, "'.'", "'{'", "'('", 
			"'['", "'}'", "')'", "']'", "','", "':'", "';'", "'<'", "'>'", "'_'", 
			"'!'", "'?'", "'@'", "'&'", "'-'", "'='", "'|'", "'/'", "'+'", "'*'", 
			"'%'", "'^'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "Platform_name_platform_version", 
			"Identifier", "DOT", "LCURLY", "LPAREN", "LBRACK", "RCURLY", "RPAREN", 
			"RBRACK", "COMMA", "COLON", "SEMI", "LT", "GT", "UNDERSCORE", "BANG", 
			"QUESTION", "AT", "AND", "SUB", "EQUAL", "OR", "DIV", "ADD", "MUL", "MOD", 
			"CARET", "TILDE", "Operator_head_other", "Operator_following_character", 
			"Implicit_parameter_name", "Binary_literal", "Octal_literal", "Decimal_literal", 
			"Pure_decimal_digits", "Hexadecimal_literal", "Floating_point_literal", 
			"Static_string_literal", "Interpolated_string_literal", "WS", "Block_comment", 
			"Line_comment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Swift3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Top_levelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Swift3Parser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Top_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level; }
	}

	public final Top_levelContext top_level() throws RecognitionException {
		Top_levelContext _localctx = new Top_levelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_top_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(570);
				statements();
				}
				break;
			}
			setState(573);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Swift3Parser.SEMI, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Branch_statementContext branch_statement() {
			return getRuleContext(Branch_statementContext.class,0);
		}
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Control_transfer_statementContext control_transfer_statement() {
			return getRuleContext(Control_transfer_statementContext.class,0);
		}
		public Defer_statementContext defer_statement() {
			return getRuleContext(Defer_statementContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				expression();
				setState(577);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(576);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				declaration();
				setState(581);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(580);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				loop_statement();
				setState(585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(584);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(587);
				branch_statement();
				setState(589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(588);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(591);
				labeled_statement();
				setState(593);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(592);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(595);
				control_transfer_statement();
				setState(597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(596);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(599);
				defer_statement();
				setState(601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(600);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(603);
				do_statement();
				setState(605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(604);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(607);
				compiler_control_statement();
				setState(609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(608);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public Statements_implContext statements_impl() {
			return getRuleContext(Statements_implContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			statements_impl(-1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Statements_implContext extends ParserRuleContext {
		public int indexBefore;
		public int indexAfter = -1;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statements_implContext statements_impl() {
			return getRuleContext(Statements_implContext.class,0);
		}
		public Statements_implContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Statements_implContext(ParserRuleContext parent, int invokingState, int indexBefore) {
			super(parent, invokingState);
			this.indexBefore = indexBefore;
		}
		@Override public int getRuleIndex() { return RULE_statements_impl; }
	}

	public final Statements_implContext statements_impl(int indexBefore) throws RecognitionException {
		Statements_implContext _localctx = new Statements_implContext(_ctx, getState(), indexBefore);
		enterRule(_localctx, 6, RULE_statements_impl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			if (!(SwiftSupport.isSeparatedStatement(_input, _localctx.indexBefore))) throw new FailedPredicateException(this, "SwiftSupport.isSeparatedStatement(_input, $indexBefore)");
			setState(616);
			statement();
			((Statements_implContext)_localctx).indexAfter =  _input.index();
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(618);
				statements_impl(_localctx.indexAfter);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_statementContext extends ParserRuleContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public For_in_statementContext for_in_statement() {
			return getRuleContext(For_in_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Repeat_while_statementContext repeat_while_statement() {
			return getRuleContext(Repeat_while_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop_statement);
		try {
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				for_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				for_in_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(624);
				repeat_while_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(Swift3Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Swift3Parser.SEMI, i);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_statement);
		try {
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				match(T__0);
				setState(629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(628);
					for_init();
					}
					break;
				}
				setState(631);
				match(SEMI);
				setState(633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(632);
					expression();
					}
					break;
				}
				setState(635);
				match(SEMI);
				setState(637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(636);
					expression();
					}
					break;
				}
				setState(639);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				match(T__0);
				setState(641);
				match(LPAREN);
				setState(643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(642);
					for_init();
					}
					break;
				}
				setState(645);
				match(SEMI);
				setState(647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(646);
					expression();
					}
					break;
				}
				setState(649);
				match(SEMI);
				setState(651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(650);
					expression();
					}
					break;
				}
				setState(653);
				match(RPAREN);
				setState(654);
				code_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_initContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_init);
		try {
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				expression_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_in_statementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public For_in_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_statement; }
	}

	public final For_in_statementContext for_in_statement() throws RecognitionException {
		For_in_statementContext _localctx = new For_in_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_in_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(T__0);
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(662);
				match(T__1);
				}
				break;
			}
			setState(665);
			pattern(0);
			setState(666);
			match(T__2);
			setState(667);
			expression();
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(668);
				where_clause();
				}
			}

			setState(671);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(T__3);
			setState(674);
			condition_list();
			setState(675);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Condition_listContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Condition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_list; }
	}

	public final Condition_listContext condition_list() throws RecognitionException {
		Condition_listContext _localctx = new Condition_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			condition();
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(678);
				match(COMMA);
				setState(679);
				condition();
				}
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Availability_conditionContext availability_condition() {
			return getRuleContext(Availability_conditionContext.class,0);
		}
		public Case_conditionContext case_condition() {
			return getRuleContext(Case_conditionContext.class,0);
		}
		public Optional_binding_conditionContext optional_binding_condition() {
			return getRuleContext(Optional_binding_conditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				availability_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				case_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(688);
				optional_binding_condition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_conditionContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Case_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_condition; }
	}

	public final Case_conditionContext case_condition() throws RecognitionException {
		Case_conditionContext _localctx = new Case_conditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_case_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(T__1);
			setState(692);
			pattern(0);
			setState(693);
			initializer();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(694);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Optional_binding_conditionContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Optional_binding_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_condition; }
	}

	public final Optional_binding_conditionContext optional_binding_condition() throws RecognitionException {
		Optional_binding_conditionContext _localctx = new Optional_binding_conditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_optional_binding_condition);
		try {
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				match(T__4);
				setState(698);
				pattern(0);
				setState(699);
				initializer();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				match(T__5);
				setState(702);
				pattern(0);
				setState(703);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Repeat_while_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Repeat_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_while_statement; }
	}

	public final Repeat_while_statementContext repeat_while_statement() throws RecognitionException {
		Repeat_while_statementContext _localctx = new Repeat_while_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_repeat_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(T__6);
			setState(708);
			code_block();
			setState(709);
			match(T__3);
			setState(710);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Branch_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Guard_statementContext guard_statement() {
			return getRuleContext(Guard_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Branch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_statement; }
	}

	public final Branch_statementContext branch_statement() throws RecognitionException {
		Branch_statementContext _localctx = new Branch_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_branch_statement);
		try {
			setState(715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				if_statement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				guard_statement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(714);
				switch_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(T__7);
			setState(718);
			condition_list();
			setState(719);
			code_block();
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(720);
				else_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_else_clause);
		try {
			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				match(T__8);
				setState(724);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				match(T__8);
				setState(726);
				if_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Guard_statementContext extends ParserRuleContext {
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Guard_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_statement; }
	}

	public final Guard_statementContext guard_statement() throws RecognitionException {
		Guard_statementContext _localctx = new Guard_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_guard_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(T__9);
			setState(730);
			condition_list();
			setState(731);
			match(T__8);
			setState(732);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(T__10);
			setState(735);
			expression();
			setState(736);
			match(LCURLY);
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__11) {
				{
				setState(737);
				switch_cases();
				}
			}

			setState(740);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_casesContext extends ParserRuleContext {
		public Switch_caseContext switch_case() {
			return getRuleContext(Switch_caseContext.class,0);
		}
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_casesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_cases; }
	}

	public final Switch_casesContext switch_cases() throws RecognitionException {
		Switch_casesContext _localctx = new Switch_casesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_switch_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			switch_case();
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__11) {
				{
				setState(743);
				switch_cases();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_caseContext extends ParserRuleContext {
		public Case_labelContext case_label() {
			return getRuleContext(Case_labelContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Default_labelContext default_label() {
			return getRuleContext(Default_labelContext.class,0);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switch_case);
		try {
			setState(752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				case_label();
				setState(747);
				statements();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				default_label();
				setState(750);
				statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_labelContext extends ParserRuleContext {
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(T__1);
			setState(755);
			case_item_list();
			setState(756);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_item_listContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public Case_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_item_list; }
	}

	public final Case_item_listContext case_item_list() throws RecognitionException {
		Case_item_listContext _localctx = new Case_item_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_case_item_list);
		int _la;
		try {
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				pattern(0);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(759);
					where_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				pattern(0);
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(763);
					where_clause();
					}
				}

				setState(766);
				match(COMMA);
				setState(767);
				case_item_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Default_labelContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Default_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_label; }
	}

	public final Default_labelContext default_label() throws RecognitionException {
		Default_labelContext _localctx = new Default_labelContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_default_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(T__11);
			setState(772);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Where_clauseContext extends ParserRuleContext {
		public Where_expressionContext where_expression() {
			return getRuleContext(Where_expressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(T__12);
			setState(775);
			where_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Where_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_expression; }
	}

	public final Where_expressionContext where_expression() throws RecognitionException {
		Where_expressionContext _localctx = new Where_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_where_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Labeled_statementContext extends ParserRuleContext {
		public Statement_labelContext statement_label() {
			return getRuleContext(Statement_labelContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_labeled_statement);
		try {
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				statement_label();
				setState(780);
				loop_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				statement_label();
				setState(783);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				statement_label();
				setState(786);
				switch_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(788);
				statement_label();
				setState(789);
				do_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_labelContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Statement_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_label; }
	}

	public final Statement_labelContext statement_label() throws RecognitionException {
		Statement_labelContext _localctx = new Statement_labelContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			label_name();
			setState(794);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Label_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Label_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_name; }
	}

	public final Label_nameContext label_name() throws RecognitionException {
		Label_nameContext _localctx = new Label_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_label_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Control_transfer_statementContext extends ParserRuleContext {
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Fallthrough_statementContext fallthrough_statement() {
			return getRuleContext(Fallthrough_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Throw_statementContext throw_statement() {
			return getRuleContext(Throw_statementContext.class,0);
		}
		public Control_transfer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_transfer_statement; }
	}

	public final Control_transfer_statementContext control_transfer_statement() throws RecognitionException {
		Control_transfer_statementContext _localctx = new Control_transfer_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_control_transfer_statement);
		try {
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				break_statement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				continue_statement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(800);
				fallthrough_statement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(801);
				return_statement();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(802);
				throw_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_statementContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(T__13);
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(806);
				label_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Continue_statementContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(T__14);
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(810);
				label_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fallthrough_statementContext extends ParserRuleContext {
		public Fallthrough_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthrough_statement; }
	}

	public final Fallthrough_statementContext fallthrough_statement() throws RecognitionException {
		Fallthrough_statementContext _localctx = new Fallthrough_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fallthrough_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(T__16);
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(816);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Throw_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Throw_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_statement; }
	}

	public final Throw_statementContext throw_statement() throws RecognitionException {
		Throw_statementContext _localctx = new Throw_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_throw_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(T__17);
			setState(820);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Defer_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Defer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defer_statement; }
	}

	public final Defer_statementContext defer_statement() throws RecognitionException {
		Defer_statementContext _localctx = new Defer_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_defer_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(T__18);
			setState(823);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(T__19);
			setState(826);
			code_block();
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(827);
				catch_clauses();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Catch_clausesContext extends ParserRuleContext {
		public Catch_clauseContext catch_clause() {
			return getRuleContext(Catch_clauseContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Catch_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clauses; }
	}

	public final Catch_clausesContext catch_clauses() throws RecognitionException {
		Catch_clausesContext _localctx = new Catch_clausesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_catch_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			catch_clause();
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(831);
				catch_clauses();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Catch_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clause; }
	}

	public final Catch_clauseContext catch_clause() throws RecognitionException {
		Catch_clauseContext _localctx = new Catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(T__20);
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(835);
				pattern(0);
				}
				break;
			}
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(838);
				where_clause();
				}
			}

			setState(841);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compiler_control_statementContext extends ParserRuleContext {
		public Conditional_compilation_blockContext conditional_compilation_block() {
			return getRuleContext(Conditional_compilation_blockContext.class,0);
		}
		public Line_control_statementContext line_control_statement() {
			return getRuleContext(Line_control_statementContext.class,0);
		}
		public Compiler_control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compiler_control_statement; }
	}

	public final Compiler_control_statementContext compiler_control_statement() throws RecognitionException {
		Compiler_control_statementContext _localctx = new Compiler_control_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_compiler_control_statement);
		try {
			setState(845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
				conditional_compilation_block();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				line_control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_compilation_blockContext extends ParserRuleContext {
		public If_directive_clauseContext if_directive_clause() {
			return getRuleContext(If_directive_clauseContext.class,0);
		}
		public Endif_directiveContext endif_directive() {
			return getRuleContext(Endif_directiveContext.class,0);
		}
		public Elseif_directive_clausesContext elseif_directive_clauses() {
			return getRuleContext(Elseif_directive_clausesContext.class,0);
		}
		public Else_directive_clauseContext else_directive_clause() {
			return getRuleContext(Else_directive_clauseContext.class,0);
		}
		public Conditional_compilation_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_compilation_block; }
	}

	public final Conditional_compilation_blockContext conditional_compilation_block() throws RecognitionException {
		Conditional_compilation_blockContext _localctx = new Conditional_compilation_blockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditional_compilation_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			if_directive_clause();
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(848);
				elseif_directive_clauses();
				}
			}

			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(851);
				else_directive_clause();
				}
			}

			setState(854);
			endif_directive();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_directive_clauseContext extends ParserRuleContext {
		public If_directiveContext if_directive() {
			return getRuleContext(If_directiveContext.class,0);
		}
		public Compilation_conditionContext compilation_condition() {
			return getRuleContext(Compilation_conditionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_directive_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_directive_clause; }
	}

	public final If_directive_clauseContext if_directive_clause() throws RecognitionException {
		If_directive_clauseContext _localctx = new If_directive_clauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_if_directive_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			if_directive();
			setState(857);
			compilation_condition(0);
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(858);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elseif_directive_clausesContext extends ParserRuleContext {
		public List<Elseif_directive_clauseContext> elseif_directive_clause() {
			return getRuleContexts(Elseif_directive_clauseContext.class);
		}
		public Elseif_directive_clauseContext elseif_directive_clause(int i) {
			return getRuleContext(Elseif_directive_clauseContext.class,i);
		}
		public Elseif_directive_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_directive_clauses; }
	}

	public final Elseif_directive_clausesContext elseif_directive_clauses() throws RecognitionException {
		Elseif_directive_clausesContext _localctx = new Elseif_directive_clausesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_elseif_directive_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(861);
				elseif_directive_clause();
				}
				}
				setState(864); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elseif_directive_clauseContext extends ParserRuleContext {
		public Elseif_directiveContext elseif_directive() {
			return getRuleContext(Elseif_directiveContext.class,0);
		}
		public Compilation_conditionContext compilation_condition() {
			return getRuleContext(Compilation_conditionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Elseif_directive_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_directive_clause; }
	}

	public final Elseif_directive_clauseContext elseif_directive_clause() throws RecognitionException {
		Elseif_directive_clauseContext _localctx = new Elseif_directive_clauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_elseif_directive_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			elseif_directive();
			setState(867);
			compilation_condition(0);
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(868);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_directive_clauseContext extends ParserRuleContext {
		public Else_directiveContext else_directive() {
			return getRuleContext(Else_directiveContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_directive_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_directive_clause; }
	}

	public final Else_directive_clauseContext else_directive_clause() throws RecognitionException {
		Else_directive_clauseContext _localctx = new Else_directive_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_else_directive_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			else_directive();
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(872);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_directiveContext extends ParserRuleContext {
		public If_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_directive; }
	}

	public final If_directiveContext if_directive() throws RecognitionException {
		If_directiveContext _localctx = new If_directiveContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_if_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elseif_directiveContext extends ParserRuleContext {
		public Elseif_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_directive; }
	}

	public final Elseif_directiveContext elseif_directive() throws RecognitionException {
		Elseif_directiveContext _localctx = new Elseif_directiveContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_elseif_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_directiveContext extends ParserRuleContext {
		public Else_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_directive; }
	}

	public final Else_directiveContext else_directive() throws RecognitionException {
		Else_directiveContext _localctx = new Else_directiveContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_else_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Endif_directiveContext extends ParserRuleContext {
		public Endif_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif_directive; }
	}

	public final Endif_directiveContext endif_directive() throws RecognitionException {
		Endif_directiveContext _localctx = new Endif_directiveContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_endif_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compilation_conditionContext extends ParserRuleContext {
		public Platform_conditionContext platform_condition() {
			return getRuleContext(Platform_conditionContext.class,0);
		}
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public List<Compilation_conditionContext> compilation_condition() {
			return getRuleContexts(Compilation_conditionContext.class);
		}
		public Compilation_conditionContext compilation_condition(int i) {
			return getRuleContext(Compilation_conditionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public TerminalNode BANG() { return getToken(Swift3Parser.BANG, 0); }
		public Compilation_condition_ANDContext compilation_condition_AND() {
			return getRuleContext(Compilation_condition_ANDContext.class,0);
		}
		public Compilation_condition_ORContext compilation_condition_OR() {
			return getRuleContext(Compilation_condition_ORContext.class,0);
		}
		public Compilation_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition; }
	}

	public final Compilation_conditionContext compilation_condition() throws RecognitionException {
		return compilation_condition(0);
	}

	private Compilation_conditionContext compilation_condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Compilation_conditionContext _localctx = new Compilation_conditionContext(_ctx, _parentState);
		Compilation_conditionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_compilation_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(884);
				platform_condition();
				}
				break;
			case 2:
				{
				setState(885);
				label_identifier();
				}
				break;
			case 3:
				{
				setState(886);
				boolean_literal();
				}
				break;
			case 4:
				{
				setState(887);
				match(LPAREN);
				setState(888);
				compilation_condition(0);
				setState(889);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(891);
				match(BANG);
				setState(892);
				compilation_condition(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(905);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(903);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new Compilation_conditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compilation_condition);
						setState(895);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(896);
						compilation_condition_AND();
						setState(897);
						compilation_condition(3);
						}
						break;
					case 2:
						{
						_localctx = new Compilation_conditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compilation_condition);
						setState(899);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(900);
						compilation_condition_OR();
						setState(901);
						compilation_condition(2);
						}
						break;
					}
					} 
				}
				setState(907);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Platform_conditionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Operating_systemContext operating_system() {
			return getRuleContext(Operating_systemContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public ArchitectureContext architecture() {
			return getRuleContext(ArchitectureContext.class,0);
		}
		public Compilation_condition_GEContext compilation_condition_GE() {
			return getRuleContext(Compilation_condition_GEContext.class,0);
		}
		public Swift_versionContext swift_version() {
			return getRuleContext(Swift_versionContext.class,0);
		}
		public Platform_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platform_condition; }
	}

	public final Platform_conditionContext platform_condition() throws RecognitionException {
		Platform_conditionContext _localctx = new Platform_conditionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_platform_condition);
		try {
			setState(924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				match(T__25);
				setState(909);
				match(LPAREN);
				setState(910);
				operating_system();
				setState(911);
				match(RPAREN);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(913);
				match(T__26);
				setState(914);
				match(LPAREN);
				setState(915);
				architecture();
				setState(916);
				match(RPAREN);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(918);
				match(T__27);
				setState(919);
				match(LPAREN);
				setState(920);
				compilation_condition_GE();
				setState(921);
				swift_version();
				setState(922);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Swift_versionContext extends ParserRuleContext {
		public List<TerminalNode> Pure_decimal_digits() { return getTokens(Swift3Parser.Pure_decimal_digits); }
		public TerminalNode Pure_decimal_digits(int i) {
			return getToken(Swift3Parser.Pure_decimal_digits, i);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Swift_versionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swift_version; }
	}

	public final Swift_versionContext swift_version() throws RecognitionException {
		Swift_versionContext _localctx = new Swift_versionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_swift_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(Pure_decimal_digits);
			setState(927);
			match(DOT);
			setState(928);
			match(Pure_decimal_digits);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operating_systemContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Operating_systemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operating_system; }
	}

	public final Operating_systemContext operating_system() throws RecognitionException {
		Operating_systemContext _localctx = new Operating_systemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_operating_system);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArchitectureContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public ArchitectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture; }
	}

	public final ArchitectureContext architecture() throws RecognitionException {
		ArchitectureContext _localctx = new ArchitectureContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_architecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Line_control_statementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(Swift3Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Swift3Parser.COLON, i);
		}
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Line_numberContext line_number() {
			return getRuleContext(Line_numberContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Line_control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_control_statement; }
	}

	public final Line_control_statementContext line_control_statement() throws RecognitionException {
		Line_control_statementContext _localctx = new Line_control_statementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_line_control_statement);
		try {
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				match(T__28);
				setState(935);
				match(LPAREN);
				setState(936);
				match(T__29);
				setState(937);
				match(COLON);
				setState(938);
				file_name();
				setState(939);
				match(COMMA);
				setState(940);
				match(T__30);
				setState(941);
				match(COLON);
				setState(942);
				line_number();
				setState(943);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				match(T__28);
				setState(946);
				match(LPAREN);
				setState(947);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Line_numberContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Line_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_number; }
	}

	public final Line_numberContext line_number() throws RecognitionException {
		Line_numberContext _localctx = new Line_numberContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_line_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			integer_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode Static_string_literal() { return getToken(Swift3Parser.Static_string_literal, 0); }
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(Static_string_literal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Availability_conditionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Availability_argumentsContext availability_arguments() {
			return getRuleContext(Availability_argumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Availability_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_condition; }
	}

	public final Availability_conditionContext availability_condition() throws RecognitionException {
		Availability_conditionContext _localctx = new Availability_conditionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_availability_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(T__31);
			setState(955);
			match(LPAREN);
			setState(956);
			availability_arguments();
			setState(957);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Availability_argumentsContext extends ParserRuleContext {
		public List<Availability_argumentContext> availability_argument() {
			return getRuleContexts(Availability_argumentContext.class);
		}
		public Availability_argumentContext availability_argument(int i) {
			return getRuleContext(Availability_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Availability_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_arguments; }
	}

	public final Availability_argumentsContext availability_arguments() throws RecognitionException {
		Availability_argumentsContext _localctx = new Availability_argumentsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_availability_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			availability_argument();
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(960);
				match(COMMA);
				setState(961);
				availability_argument();
				}
				}
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Availability_argumentContext extends ParserRuleContext {
		public TerminalNode Platform_name_platform_version() { return getToken(Swift3Parser.Platform_name_platform_version, 0); }
		public TerminalNode MUL() { return getToken(Swift3Parser.MUL, 0); }
		public Availability_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_argument; }
	}

	public final Availability_argumentContext availability_argument() throws RecognitionException {
		Availability_argumentContext _localctx = new Availability_argumentContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_availability_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			_la = _input.LA(1);
			if ( !(_la==Platform_name_platform_version || _la==MUL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_parameter_clauseContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Swift3Parser.LT, 0); }
		public Generic_parameter_listContext generic_parameter_list() {
			return getRuleContext(Generic_parameter_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(Swift3Parser.GT, 0); }
		public Generic_parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_clause; }
	}

	public final Generic_parameter_clauseContext generic_parameter_clause() throws RecognitionException {
		Generic_parameter_clauseContext _localctx = new Generic_parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_generic_parameter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(LT);
			setState(970);
			generic_parameter_list();
			setState(971);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_parameter_listContext extends ParserRuleContext {
		public List<Generic_parameterContext> generic_parameter() {
			return getRuleContexts(Generic_parameterContext.class);
		}
		public Generic_parameterContext generic_parameter(int i) {
			return getRuleContext(Generic_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Generic_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_list; }
	}

	public final Generic_parameter_listContext generic_parameter_list() throws RecognitionException {
		Generic_parameter_listContext _localctx = new Generic_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_generic_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			generic_parameter();
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(974);
				match(COMMA);
				setState(975);
				generic_parameter();
				}
				}
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_parameterContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Generic_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter; }
	}

	public final Generic_parameterContext generic_parameter() throws RecognitionException {
		Generic_parameterContext _localctx = new Generic_parameterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_generic_parameter);
		try {
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
				type_name();
				setState(983);
				match(COLON);
				setState(984);
				type_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(986);
				type_name();
				setState(987);
				match(COLON);
				setState(988);
				protocol_composition_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_where_clauseContext extends ParserRuleContext {
		public Requirement_listContext requirement_list() {
			return getRuleContext(Requirement_listContext.class,0);
		}
		public Generic_where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_where_clause; }
	}

	public final Generic_where_clauseContext generic_where_clause() throws RecognitionException {
		Generic_where_clauseContext _localctx = new Generic_where_clauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_generic_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			match(T__12);
			setState(993);
			requirement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Requirement_listContext extends ParserRuleContext {
		public List<RequirementContext> requirement() {
			return getRuleContexts(RequirementContext.class);
		}
		public RequirementContext requirement(int i) {
			return getRuleContext(RequirementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Requirement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_list; }
	}

	public final Requirement_listContext requirement_list() throws RecognitionException {
		Requirement_listContext _localctx = new Requirement_listContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_requirement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			requirement();
			setState(1000);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(996);
					match(COMMA);
					setState(997);
					requirement();
					}
					} 
				}
				setState(1002);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequirementContext extends ParserRuleContext {
		public Conformance_requirementContext conformance_requirement() {
			return getRuleContext(Conformance_requirementContext.class,0);
		}
		public Same_type_requirementContext same_type_requirement() {
			return getRuleContext(Same_type_requirementContext.class,0);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_requirement);
		try {
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003);
				conformance_requirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				same_type_requirement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conformance_requirementContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Conformance_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conformance_requirement; }
	}

	public final Conformance_requirementContext conformance_requirement() throws RecognitionException {
		Conformance_requirementContext _localctx = new Conformance_requirementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_conformance_requirement);
		try {
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
				type_identifier();
				setState(1008);
				match(COLON);
				setState(1009);
				type_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				type_identifier();
				setState(1012);
				match(COLON);
				setState(1013);
				protocol_composition_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Same_type_requirementContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Same_type_equalsContext same_type_equals() {
			return getRuleContext(Same_type_equalsContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Same_type_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_requirement; }
	}

	public final Same_type_requirementContext same_type_requirement() throws RecognitionException {
		Same_type_requirementContext _localctx = new Same_type_requirementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_same_type_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			type_identifier();
			setState(1018);
			same_type_equals();
			setState(1019);
			type_(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_argument_clauseContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Swift3Parser.LT, 0); }
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(Swift3Parser.GT, 0); }
		public Generic_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_clause; }
	}

	public final Generic_argument_clauseContext generic_argument_clause() throws RecognitionException {
		Generic_argument_clauseContext _localctx = new Generic_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_generic_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			match(LT);
			setState(1022);
			generic_argument_list();
			setState(1023);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_argument_listContext extends ParserRuleContext {
		public List<Generic_argumentContext> generic_argument() {
			return getRuleContexts(Generic_argumentContext.class);
		}
		public Generic_argumentContext generic_argument(int i) {
			return getRuleContext(Generic_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Generic_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_list; }
	}

	public final Generic_argument_listContext generic_argument_list() throws RecognitionException {
		Generic_argument_listContext _localctx = new Generic_argument_listContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_generic_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			generic_argument();
			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1026);
				match(COMMA);
				setState(1027);
				generic_argument();
				}
				}
				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_argumentContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Generic_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument; }
	}

	public final Generic_argumentContext generic_argument() throws RecognitionException {
		Generic_argumentContext _localctx = new Generic_argumentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_generic_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			type_(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Import_declarationContext import_declaration() {
			return getRuleContext(Import_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Typealias_declarationContext typealias_declaration() {
			return getRuleContext(Typealias_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Protocol_declarationContext protocol_declaration() {
			return getRuleContext(Protocol_declarationContext.class,0);
		}
		public Initializer_declarationContext initializer_declaration() {
			return getRuleContext(Initializer_declarationContext.class,0);
		}
		public Deinitializer_declarationContext deinitializer_declaration() {
			return getRuleContext(Deinitializer_declarationContext.class,0);
		}
		public Extension_declarationContext extension_declaration() {
			return getRuleContext(Extension_declarationContext.class,0);
		}
		public Subscript_declarationContext subscript_declaration() {
			return getRuleContext(Subscript_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public Precedence_group_declarationContext precedence_group_declaration() {
			return getRuleContext(Precedence_group_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_declaration);
		try {
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1035);
				import_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				constant_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1037);
				variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1038);
				typealias_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1039);
				function_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1040);
				enum_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1041);
				struct_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1042);
				class_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1043);
				protocol_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1044);
				initializer_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1045);
				deinitializer_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1046);
				extension_declaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1047);
				subscript_declaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1048);
				operator_declaration();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1049);
				operator_declaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1050);
				precedence_group_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1053);
				declaration();
				}
				}
				setState(1056); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 269865224843034720L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 261375L) != 0 || _la==AT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Top_level_declarationContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Top_level_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level_declaration; }
	}

	public final Top_level_declarationContext top_level_declaration() throws RecognitionException {
		Top_level_declarationContext _localctx = new Top_level_declarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_top_level_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(1058);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			match(LCURLY);
			setState(1063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(1062);
				statements();
				}
				break;
			}
			setState(1065);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_declarationContext extends ParserRuleContext {
		public Import_pathContext import_path() {
			return getRuleContext(Import_pathContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Import_kindContext import_kind() {
			return getRuleContext(Import_kindContext.class,0);
		}
		public Import_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_declaration; }
	}

	public final Import_declarationContext import_declaration() throws RecognitionException {
		Import_declarationContext _localctx = new Import_declarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_import_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1067);
				attributes();
				}
			}

			setState(1070);
			match(T__32);
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1082331758656L) != 0) {
				{
				setState(1071);
				import_kind();
				}
			}

			setState(1074);
			import_path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_kindContext extends ParserRuleContext {
		public Import_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_kind; }
	}

	public final Import_kindContext import_kind() throws RecognitionException {
		Import_kindContext _localctx = new Import_kindContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_import_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1082331758656L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_pathContext extends ParserRuleContext {
		public List<Import_path_identifierContext> import_path_identifier() {
			return getRuleContexts(Import_path_identifierContext.class);
		}
		public Import_path_identifierContext import_path_identifier(int i) {
			return getRuleContext(Import_path_identifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Swift3Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Swift3Parser.DOT, i);
		}
		public Import_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path; }
	}

	public final Import_pathContext import_path() throws RecognitionException {
		Import_pathContext _localctx = new Import_pathContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_import_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			import_path_identifier();
			setState(1083);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1079);
					match(DOT);
					setState(1080);
					import_path_identifier();
					}
					} 
				}
				setState(1085);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_path_identifierContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Operator_Context operator_() {
			return getRuleContext(Operator_Context.class,0);
		}
		public Import_path_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path_identifier; }
	}

	public final Import_path_identifierContext import_path_identifier() throws RecognitionException {
		Import_path_identifierContext _localctx = new Import_path_identifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_import_path_identifier);
		try {
			setState(1088);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__45:
			case T__46:
			case T__52:
			case T__54:
			case T__55:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__79:
			case T__80:
			case T__81:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__98:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1086);
				declaration_identifier();
				}
				break;
			case DOT:
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(1087);
				operator_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_declarationContext extends ParserRuleContext {
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1090);
				attributes();
				}
			}

			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 140324636329985L) != 0) {
				{
				setState(1093);
				declaration_modifiers();
				}
			}

			setState(1096);
			match(T__4);
			setState(1097);
			pattern_initializer_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pattern_initializer_listContext extends ParserRuleContext {
		public List<Pattern_initializerContext> pattern_initializer() {
			return getRuleContexts(Pattern_initializerContext.class);
		}
		public Pattern_initializerContext pattern_initializer(int i) {
			return getRuleContext(Pattern_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Pattern_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer_list; }
	}

	public final Pattern_initializer_listContext pattern_initializer_list() throws RecognitionException {
		Pattern_initializer_listContext _localctx = new Pattern_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_pattern_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			pattern_initializer();
			setState(1104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1100);
					match(COMMA);
					setState(1101);
					pattern_initializer();
					}
					} 
				}
				setState(1106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pattern_initializerContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Pattern_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer; }
	}

	public final Pattern_initializerContext pattern_initializer() throws RecognitionException {
		Pattern_initializerContext _localctx = new Pattern_initializerContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_pattern_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			pattern(0);
			setState(1109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(1108);
				initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			assignment_operator();
			setState(1112);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public List<Type_annotationContext> type_annotation() {
			return getRuleContexts(Type_annotationContext.class);
		}
		public Type_annotationContext type_annotation(int i) {
			return getRuleContext(Type_annotationContext.class,i);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public WillSet_didSet_blockContext willSet_didSet_block() {
			return getRuleContext(WillSet_didSet_blockContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_variable_declaration);
		try {
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1114);
				variable_declaration_head();
				setState(1115);
				variable_name();
				setState(1116);
				type_annotation();
				setState(1117);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1119);
				variable_declaration_head();
				setState(1120);
				variable_name();
				setState(1121);
				type_annotation();
				setState(1122);
				getter_setter_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1124);
				variable_declaration_head();
				setState(1125);
				variable_name();
				setState(1126);
				type_annotation();
				setState(1127);
				getter_setter_keyword_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1129);
				variable_declaration_head();
				setState(1130);
				variable_name();
				setState(1131);
				type_annotation();
				setState(1133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(1132);
					initializer();
					}
					break;
				}
				setState(1135);
				willSet_didSet_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1137);
				variable_declaration_head();
				setState(1138);
				variable_name();
				setState(1139);
				type_annotation();
				setState(1140);
				type_annotation();
				setState(1142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(1141);
					initializer();
					}
					break;
				}
				setState(1144);
				willSet_didSet_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1146);
				variable_declaration_head();
				setState(1147);
				pattern_initializer_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declaration_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Variable_declaration_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_head; }
	}

	public final Variable_declaration_headContext variable_declaration_head() throws RecognitionException {
		Variable_declaration_headContext _localctx = new Variable_declaration_headContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_variable_declaration_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1151);
				attributes();
				}
			}

			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 140324636329985L) != 0) {
				{
				setState(1154);
				declaration_modifiers();
				}
			}

			setState(1157);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Getter_setter_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public Getter_clauseContext getter_clause() {
			return getRuleContext(Getter_clauseContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public Setter_clauseContext setter_clause() {
			return getRuleContext(Setter_clauseContext.class,0);
		}
		public Getter_setter_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_block; }
	}

	public final Getter_setter_blockContext getter_setter_block() throws RecognitionException {
		Getter_setter_blockContext _localctx = new Getter_setter_blockContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_getter_setter_block);
		int _la;
		try {
			setState(1173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				match(LCURLY);
				setState(1162);
				getter_clause();
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 3298534883329L) != 0 || _la==AT) {
					{
					setState(1163);
					setter_clause();
					}
				}

				setState(1166);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1168);
				match(LCURLY);
				setState(1169);
				setter_clause();
				setState(1170);
				getter_clause();
				setState(1171);
				match(RCURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Getter_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Getter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_clause; }
	}

	public final Getter_clauseContext getter_clause() throws RecognitionException {
		Getter_clauseContext _localctx = new Getter_clauseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_getter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1175);
				attributes();
				}
			}

			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__80 || _la==T__81) {
				{
				setState(1178);
				mutation_modifier();
				}
			}

			setState(1181);
			match(T__39);
			setState(1182);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Setter_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public Setter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_clause; }
	}

	public final Setter_clauseContext setter_clause() throws RecognitionException {
		Setter_clauseContext _localctx = new Setter_clauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_setter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1184);
				attributes();
				}
			}

			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__80 || _la==T__81) {
				{
				setState(1187);
				mutation_modifier();
				}
			}

			setState(1190);
			match(T__40);
			setState(1192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1191);
				setter_name();
				}
			}

			setState(1194);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Setter_nameContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Setter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_name; }
	}

	public final Setter_nameContext setter_name() throws RecognitionException {
		Setter_nameContext _localctx = new Setter_nameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_setter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			match(LPAREN);
			setState(1197);
			declaration_identifier();
			setState(1198);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Getter_setter_keyword_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public Getter_keyword_clauseContext getter_keyword_clause() {
			return getRuleContext(Getter_keyword_clauseContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public Setter_keyword_clauseContext setter_keyword_clause() {
			return getRuleContext(Setter_keyword_clauseContext.class,0);
		}
		public Getter_setter_keyword_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_keyword_block; }
	}

	public final Getter_setter_keyword_blockContext getter_setter_keyword_block() throws RecognitionException {
		Getter_setter_keyword_blockContext _localctx = new Getter_setter_keyword_blockContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_getter_setter_keyword_block);
		int _la;
		try {
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1200);
				match(LCURLY);
				setState(1201);
				getter_keyword_clause();
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 3298534883329L) != 0 || _la==AT) {
					{
					setState(1202);
					setter_keyword_clause();
					}
				}

				setState(1205);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				match(LCURLY);
				setState(1208);
				setter_keyword_clause();
				setState(1209);
				getter_keyword_clause();
				setState(1210);
				match(RCURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Getter_keyword_clauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Getter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_keyword_clause; }
	}

	public final Getter_keyword_clauseContext getter_keyword_clause() throws RecognitionException {
		Getter_keyword_clauseContext _localctx = new Getter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_getter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1214);
				attributes();
				}
			}

			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__80 || _la==T__81) {
				{
				setState(1217);
				mutation_modifier();
				}
			}

			setState(1220);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Setter_keyword_clauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Setter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_keyword_clause; }
	}

	public final Setter_keyword_clauseContext setter_keyword_clause() throws RecognitionException {
		Setter_keyword_clauseContext _localctx = new Setter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_setter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1222);
				attributes();
				}
			}

			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__80 || _la==T__81) {
				{
				setState(1225);
				mutation_modifier();
				}
			}

			setState(1228);
			match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WillSet_didSet_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public WillSet_clauseContext willSet_clause() {
			return getRuleContext(WillSet_clauseContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public DidSet_clauseContext didSet_clause() {
			return getRuleContext(DidSet_clauseContext.class,0);
		}
		public WillSet_didSet_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_didSet_block; }
	}

	public final WillSet_didSet_blockContext willSet_didSet_block() throws RecognitionException {
		WillSet_didSet_blockContext _localctx = new WillSet_didSet_blockContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_willSet_didSet_block);
		int _la;
		try {
			setState(1242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1230);
				match(LCURLY);
				setState(1231);
				willSet_clause();
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__42 || _la==AT) {
					{
					setState(1232);
					didSet_clause();
					}
				}

				setState(1235);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1237);
				match(LCURLY);
				setState(1238);
				didSet_clause();
				setState(1239);
				willSet_clause();
				setState(1240);
				match(RCURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WillSet_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public WillSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_clause; }
	}

	public final WillSet_clauseContext willSet_clause() throws RecognitionException {
		WillSet_clauseContext _localctx = new WillSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_willSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1244);
				attributes();
				}
			}

			setState(1247);
			match(T__41);
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1248);
				setter_name();
				}
			}

			setState(1251);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DidSet_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public DidSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_didSet_clause; }
	}

	public final DidSet_clauseContext didSet_clause() throws RecognitionException {
		DidSet_clauseContext _localctx = new DidSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_didSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1253);
				attributes();
				}
			}

			setState(1256);
			match(T__42);
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1257);
				setter_name();
				}
			}

			setState(1260);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Typealias_declarationContext extends ParserRuleContext {
		public Typealias_nameContext typealias_name() {
			return getRuleContext(Typealias_nameContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Typealias_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_declaration; }
	}

	public final Typealias_declarationContext typealias_declaration() throws RecognitionException {
		Typealias_declarationContext _localctx = new Typealias_declarationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_typealias_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1262);
				attributes();
				}
			}

			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0) {
				{
				setState(1265);
				access_level_modifier();
				}
			}

			setState(1268);
			match(T__33);
			setState(1269);
			typealias_name();
			setState(1271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1270);
				generic_parameter_clause();
				}
				break;
			}
			setState(1273);
			typealias_assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Typealias_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Typealias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_name; }
	}

	public final Typealias_nameContext typealias_name() throws RecognitionException {
		Typealias_nameContext _localctx = new Typealias_nameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_typealias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Typealias_assignmentContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Typealias_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_assignment; }
	}

	public final Typealias_assignmentContext typealias_assignment() throws RecognitionException {
		Typealias_assignmentContext _localctx = new Typealias_assignmentContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_typealias_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			assignment_operator();
			setState(1278);
			type_(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			function_head();
			setState(1281);
			function_name();
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1282);
				generic_parameter_clause();
				}
			}

			setState(1285);
			function_signature();
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1286);
				generic_where_clause();
				}
				break;
			}
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1289);
				function_body();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Function_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_head; }
	}

	public final Function_headContext function_head() throws RecognitionException {
		Function_headContext _localctx = new Function_headContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1292);
				attributes();
				}
			}

			setState(1296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 140324636329985L) != 0) {
				{
				setState(1295);
				declaration_modifiers();
				}
			}

			setState(1298);
			match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Operator_Context operator_() {
			return getRuleContext(Operator_Context.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_function_name);
		try {
			setState(1302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__45:
			case T__46:
			case T__52:
			case T__54:
			case T__55:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__79:
			case T__80:
			case T__81:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__98:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1300);
				declaration_identifier();
				}
				break;
			case DOT:
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(1301);
				operator_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_signatureContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_signature; }
	}

	public final Function_signatureContext function_signature() throws RecognitionException {
		Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_function_signature);
		try {
			setState(1316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				parameter_clause();
				setState(1306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1305);
					match(T__43);
					}
					break;
				}
				setState(1309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1308);
					function_result();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				parameter_clause();
				setState(1312);
				match(T__44);
				setState(1314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1313);
					function_result();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_resultContext extends ParserRuleContext {
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_result; }
	}

	public final Function_resultContext function_result() throws RecognitionException {
		Function_resultContext _localctx = new Function_resultContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_function_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			arrow_operator();
			setState(1320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1319);
				attributes();
				}
				break;
			}
			setState(1322);
			type_(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_clause; }
	}

	public final Parameter_clauseContext parameter_clause() throws RecognitionException {
		Parameter_clauseContext _localctx = new Parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_parameter_clause);
		try {
			setState(1332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1326);
				match(LPAREN);
				setState(1327);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				match(LPAREN);
				setState(1329);
				parameter_list();
				setState(1330);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			parameter();
			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1335);
				match(COMMA);
				setState(1336);
				parameter();
				}
				}
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public Local_parameter_nameContext local_parameter_name() {
			return getRuleContext(Local_parameter_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public External_parameter_nameContext external_parameter_name() {
			return getRuleContext(External_parameter_nameContext.class,0);
		}
		public Default_argument_clauseContext default_argument_clause() {
			return getRuleContext(Default_argument_clauseContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_parameter);
		try {
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1342);
					external_parameter_name();
					}
					break;
				}
				setState(1345);
				local_parameter_name();
				setState(1346);
				type_annotation();
				setState(1348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1347);
					default_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1350);
					external_parameter_name();
					}
					break;
				}
				setState(1353);
				local_parameter_name();
				setState(1354);
				type_annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1356);
					external_parameter_name();
					}
					break;
				}
				setState(1359);
				local_parameter_name();
				setState(1360);
				type_annotation();
				setState(1361);
				range_operator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class External_parameter_nameContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public External_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_parameter_name; }
	}

	public final External_parameter_nameContext external_parameter_name() throws RecognitionException {
		External_parameter_nameContext _localctx = new External_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_external_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			label_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Local_parameter_nameContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Local_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_parameter_name; }
	}

	public final Local_parameter_nameContext local_parameter_name() throws RecognitionException {
		Local_parameter_nameContext _localctx = new Local_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_local_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			label_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Default_argument_clauseContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_argument_clause; }
	}

	public final Default_argument_clauseContext default_argument_clause() throws RecognitionException {
		Default_argument_clauseContext _localctx = new Default_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_default_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			assignment_operator();
			setState(1370);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enum_declarationContext extends ParserRuleContext {
		public Union_style_enumContext union_style_enum() {
			return getRuleContext(Union_style_enumContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Raw_value_style_enumContext raw_value_style_enum() {
			return getRuleContext(Raw_value_style_enumContext.class,0);
		}
		public Enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_declaration; }
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_enum_declaration);
		int _la;
		try {
			setState(1386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1372);
					attributes();
					}
				}

				setState(1376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0) {
					{
					setState(1375);
					access_level_modifier();
					}
				}

				setState(1378);
				union_style_enum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1379);
					attributes();
					}
				}

				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0) {
					{
					setState(1382);
					access_level_modifier();
					}
				}

				setState(1385);
				raw_value_style_enum();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Union_style_enumContext extends ParserRuleContext {
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Union_style_enum_membersContext union_style_enum_members() {
			return getRuleContext(Union_style_enum_membersContext.class,0);
		}
		public Union_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum; }
	}

	public final Union_style_enumContext union_style_enum() throws RecognitionException {
		Union_style_enumContext _localctx = new Union_style_enumContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_union_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(1388);
				match(T__45);
				}
			}

			setState(1391);
			match(T__36);
			setState(1392);
			enum_name();
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1393);
				generic_parameter_clause();
				}
			}

			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1396);
				type_inheritance_clause();
				}
			}

			setState(1400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1399);
				generic_where_clause();
				}
			}

			setState(1402);
			match(LCURLY);
			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 269865225384099940L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 261375L) != 0 || _la==AT) {
				{
				setState(1403);
				union_style_enum_members();
				}
			}

			setState(1406);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Union_style_enum_membersContext extends ParserRuleContext {
		public Union_style_enum_memberContext union_style_enum_member() {
			return getRuleContext(Union_style_enum_memberContext.class,0);
		}
		public Union_style_enum_membersContext union_style_enum_members() {
			return getRuleContext(Union_style_enum_membersContext.class,0);
		}
		public Union_style_enum_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_members; }
	}

	public final Union_style_enum_membersContext union_style_enum_members() throws RecognitionException {
		Union_style_enum_membersContext _localctx = new Union_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_union_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			union_style_enum_member();
			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 269865225384099940L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 261375L) != 0 || _la==AT) {
				{
				setState(1409);
				union_style_enum_members();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Union_style_enum_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Union_style_enum_case_clauseContext union_style_enum_case_clause() {
			return getRuleContext(Union_style_enum_case_clauseContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Union_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_member; }
	}

	public final Union_style_enum_memberContext union_style_enum_member() throws RecognitionException {
		Union_style_enum_memberContext _localctx = new Union_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_union_style_enum_member);
		try {
			setState(1415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1412);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1413);
				union_style_enum_case_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1414);
				compiler_control_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Union_style_enum_case_clauseContext extends ParserRuleContext {
		public Union_style_enum_case_listContext union_style_enum_case_list() {
			return getRuleContext(Union_style_enum_case_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Union_style_enum_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_clause; }
	}

	public final Union_style_enum_case_clauseContext union_style_enum_case_clause() throws RecognitionException {
		Union_style_enum_case_clauseContext _localctx = new Union_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_union_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1417);
				attributes();
				}
			}

			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(1420);
				match(T__45);
				}
			}

			setState(1423);
			match(T__1);
			setState(1424);
			union_style_enum_case_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Union_style_enum_case_listContext extends ParserRuleContext {
		public Union_style_enum_caseContext union_style_enum_case() {
			return getRuleContext(Union_style_enum_caseContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Union_style_enum_case_listContext union_style_enum_case_list() {
			return getRuleContext(Union_style_enum_case_listContext.class,0);
		}
		public Union_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_list; }
	}

	public final Union_style_enum_case_listContext union_style_enum_case_list() throws RecognitionException {
		Union_style_enum_case_listContext _localctx = new Union_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_union_style_enum_case_list);
		try {
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				union_style_enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1427);
				union_style_enum_case();
				setState(1428);
				match(COMMA);
				setState(1429);
				union_style_enum_case_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Union_style_enum_caseContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Union_style_enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case; }
	}

	public final Union_style_enum_caseContext union_style_enum_case() throws RecognitionException {
		Union_style_enum_caseContext _localctx = new Union_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_union_style_enum_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			enum_case_name();
			setState(1435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1434);
				tuple_type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enum_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Enum_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_name; }
	}

	public final Enum_nameContext enum_name() throws RecognitionException {
		Enum_nameContext _localctx = new Enum_nameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_enum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enum_case_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Enum_case_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_name; }
	}

	public final Enum_case_nameContext enum_case_name() throws RecognitionException {
		Enum_case_nameContext _localctx = new Enum_case_nameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_enum_case_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raw_value_style_enumContext extends ParserRuleContext {
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public Raw_value_style_enum_membersContext raw_value_style_enum_members() {
			return getRuleContext(Raw_value_style_enum_membersContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Raw_value_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum; }
	}

	public final Raw_value_style_enumContext raw_value_style_enum() throws RecognitionException {
		Raw_value_style_enumContext _localctx = new Raw_value_style_enumContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_raw_value_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(T__36);
			setState(1442);
			enum_name();
			setState(1444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1443);
				generic_parameter_clause();
				}
			}

			setState(1446);
			type_inheritance_clause();
			setState(1448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1447);
				generic_where_clause();
				}
			}

			setState(1450);
			match(LCURLY);
			setState(1451);
			raw_value_style_enum_members();
			setState(1452);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raw_value_style_enum_membersContext extends ParserRuleContext {
		public Raw_value_style_enum_memberContext raw_value_style_enum_member() {
			return getRuleContext(Raw_value_style_enum_memberContext.class,0);
		}
		public Raw_value_style_enum_membersContext raw_value_style_enum_members() {
			return getRuleContext(Raw_value_style_enum_membersContext.class,0);
		}
		public Raw_value_style_enum_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_members; }
	}

	public final Raw_value_style_enum_membersContext raw_value_style_enum_members() throws RecognitionException {
		Raw_value_style_enum_membersContext _localctx = new Raw_value_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_raw_value_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			raw_value_style_enum_member();
			setState(1456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 269865225384099940L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 261375L) != 0 || _la==AT) {
				{
				setState(1455);
				raw_value_style_enum_members();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raw_value_style_enum_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() {
			return getRuleContext(Raw_value_style_enum_case_clauseContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Raw_value_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_member; }
	}

	public final Raw_value_style_enum_memberContext raw_value_style_enum_member() throws RecognitionException {
		Raw_value_style_enum_memberContext _localctx = new Raw_value_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_raw_value_style_enum_member);
		try {
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1458);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1459);
				raw_value_style_enum_case_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1460);
				compiler_control_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raw_value_style_enum_case_clauseContext extends ParserRuleContext {
		public Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() {
			return getRuleContext(Raw_value_style_enum_case_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Raw_value_style_enum_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_clause; }
	}

	public final Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() throws RecognitionException {
		Raw_value_style_enum_case_clauseContext _localctx = new Raw_value_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_raw_value_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1463);
				attributes();
				}
			}

			setState(1466);
			match(T__1);
			setState(1467);
			raw_value_style_enum_case_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raw_value_style_enum_case_listContext extends ParserRuleContext {
		public Raw_value_style_enum_caseContext raw_value_style_enum_case() {
			return getRuleContext(Raw_value_style_enum_caseContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() {
			return getRuleContext(Raw_value_style_enum_case_listContext.class,0);
		}
		public Raw_value_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_list; }
	}

	public final Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() throws RecognitionException {
		Raw_value_style_enum_case_listContext _localctx = new Raw_value_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_raw_value_style_enum_case_list);
		try {
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1469);
				raw_value_style_enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1470);
				raw_value_style_enum_case();
				setState(1471);
				match(COMMA);
				setState(1472);
				raw_value_style_enum_case_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raw_value_style_enum_caseContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Raw_value_assignmentContext raw_value_assignment() {
			return getRuleContext(Raw_value_assignmentContext.class,0);
		}
		public Raw_value_style_enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case; }
	}

	public final Raw_value_style_enum_caseContext raw_value_style_enum_case() throws RecognitionException {
		Raw_value_style_enum_caseContext _localctx = new Raw_value_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_raw_value_style_enum_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			enum_case_name();
			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1477);
				raw_value_assignment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raw_value_assignmentContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Raw_value_literalContext raw_value_literal() {
			return getRuleContext(Raw_value_literalContext.class,0);
		}
		public Raw_value_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_assignment; }
	}

	public final Raw_value_assignmentContext raw_value_assignment() throws RecognitionException {
		Raw_value_assignmentContext _localctx = new Raw_value_assignmentContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_raw_value_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			assignment_operator();
			setState(1481);
			raw_value_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raw_value_literalContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public TerminalNode Static_string_literal() { return getToken(Swift3Parser.Static_string_literal, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Raw_value_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_literal; }
	}

	public final Raw_value_literalContext raw_value_literal() throws RecognitionException {
		Raw_value_literalContext _localctx = new Raw_value_literalContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_raw_value_literal);
		try {
			setState(1486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1483);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1484);
				match(Static_string_literal);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1485);
				boolean_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_declarationContext extends ParserRuleContext {
		public Struct_nameContext struct_name() {
			return getRuleContext(Struct_nameContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1488);
				attributes();
				}
			}

			setState(1492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0) {
				{
				setState(1491);
				access_level_modifier();
				}
			}

			setState(1494);
			match(T__34);
			setState(1495);
			struct_name();
			setState(1497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1496);
				generic_parameter_clause();
				}
			}

			setState(1500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1499);
				type_inheritance_clause();
				}
			}

			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1502);
				generic_where_clause();
				}
			}

			setState(1505);
			struct_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Struct_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_name; }
	}

	public final Struct_nameContext struct_name() throws RecognitionException {
		Struct_nameContext _localctx = new Struct_nameContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_bodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public List<Struct_memberContext> struct_member() {
			return getRuleContexts(Struct_memberContext.class);
		}
		public Struct_memberContext struct_member(int i) {
			return getRuleContext(Struct_memberContext.class,i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			match(LCURLY);
			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 269865225384099936L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 261375L) != 0 || _la==AT) {
				{
				{
				setState(1510);
				struct_member();
				}
				}
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1516);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Struct_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_member; }
	}

	public final Struct_memberContext struct_member() throws RecognitionException {
		Struct_memberContext _localctx = new Struct_memberContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_struct_member);
		try {
			setState(1520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__45:
			case T__46:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1518);
				declaration();
				}
				break;
			case T__21:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(1519);
				compiler_control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_declarationContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public List<Access_level_modifierContext> access_level_modifier() {
			return getRuleContexts(Access_level_modifierContext.class);
		}
		public Access_level_modifierContext access_level_modifier(int i) {
			return getRuleContext(Access_level_modifierContext.class,i);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_class_declaration);
		int _la;
		try {
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1522);
					attributes();
					}
				}

				setState(1526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0) {
					{
					setState(1525);
					access_level_modifier();
					}
				}

				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__46) {
					{
					setState(1528);
					match(T__46);
					}
				}

				setState(1531);
				match(T__35);
				setState(1532);
				class_name();
				setState(1534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1533);
					generic_parameter_clause();
					}
				}

				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1536);
					type_inheritance_clause();
					}
				}

				setState(1540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1539);
					generic_where_clause();
					}
				}

				setState(1542);
				class_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1544);
					attributes();
					}
				}

				setState(1548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0) {
					{
					setState(1547);
					access_level_modifier();
					}
				}

				setState(1550);
				match(T__46);
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0) {
					{
					setState(1551);
					access_level_modifier();
					}
				}

				setState(1554);
				match(T__35);
				setState(1555);
				class_name();
				setState(1557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1556);
					generic_parameter_clause();
					}
				}

				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1559);
					type_inheritance_clause();
					}
				}

				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1562);
					generic_where_clause();
					}
				}

				setState(1565);
				class_body();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public List<Class_memberContext> class_member() {
			return getRuleContexts(Class_memberContext.class);
		}
		public Class_memberContext class_member(int i) {
			return getRuleContext(Class_memberContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			match(LCURLY);
			setState(1575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 269865225384099936L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 261375L) != 0 || _la==AT) {
				{
				{
				setState(1572);
				class_member();
				}
				}
				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1578);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Class_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member; }
	}

	public final Class_memberContext class_member() throws RecognitionException {
		Class_memberContext _localctx = new Class_memberContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_class_member);
		try {
			setState(1582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__45:
			case T__46:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1580);
				declaration();
				}
				break;
			case T__21:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(1581);
				compiler_control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Protocol_declarationContext extends ParserRuleContext {
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public Protocol_bodyContext protocol_body() {
			return getRuleContext(Protocol_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Protocol_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration; }
	}

	public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
		Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1584);
				attributes();
				}
			}

			setState(1588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0) {
				{
				setState(1587);
				access_level_modifier();
				}
			}

			setState(1590);
			match(T__37);
			setState(1591);
			protocol_name();
			setState(1593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1592);
				type_inheritance_clause();
				}
			}

			setState(1595);
			protocol_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Protocol_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Protocol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_name; }
	}

	public final Protocol_nameContext protocol_name() throws RecognitionException {
		Protocol_nameContext _localctx = new Protocol_nameContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Protocol_bodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public List<Protocol_memberContext> protocol_member() {
			return getRuleContexts(Protocol_memberContext.class);
		}
		public Protocol_memberContext protocol_member(int i) {
			return getRuleContext(Protocol_memberContext.class,i);
		}
		public Protocol_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_body; }
	}

	public final Protocol_bodyContext protocol_body() throws RecognitionException {
		Protocol_bodyContext _localctx = new Protocol_bodyContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_protocol_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			match(LCURLY);
			setState(1603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 122582988553715776L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 261375L) != 0 || _la==AT) {
				{
				{
				setState(1600);
				protocol_member();
				}
				}
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1606);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Protocol_memberContext extends ParserRuleContext {
		public Protocol_member_declarationContext protocol_member_declaration() {
			return getRuleContext(Protocol_member_declarationContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Protocol_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member; }
	}

	public final Protocol_memberContext protocol_member() throws RecognitionException {
		Protocol_memberContext _localctx = new Protocol_memberContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_protocol_member);
		try {
			setState(1610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__33:
			case T__35:
			case T__38:
			case T__46:
			case T__47:
			case T__48:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1608);
				protocol_member_declaration();
				}
				break;
			case T__21:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(1609);
				compiler_control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Protocol_member_declarationContext extends ParserRuleContext {
		public Protocol_property_declarationContext protocol_property_declaration() {
			return getRuleContext(Protocol_property_declarationContext.class,0);
		}
		public Protocol_method_declarationContext protocol_method_declaration() {
			return getRuleContext(Protocol_method_declarationContext.class,0);
		}
		public Protocol_initializer_declarationContext protocol_initializer_declaration() {
			return getRuleContext(Protocol_initializer_declarationContext.class,0);
		}
		public Protocol_subscript_declarationContext protocol_subscript_declaration() {
			return getRuleContext(Protocol_subscript_declarationContext.class,0);
		}
		public Protocol_associated_type_declarationContext protocol_associated_type_declaration() {
			return getRuleContext(Protocol_associated_type_declarationContext.class,0);
		}
		public Typealias_declarationContext typealias_declaration() {
			return getRuleContext(Typealias_declarationContext.class,0);
		}
		public Protocol_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member_declaration; }
	}

	public final Protocol_member_declarationContext protocol_member_declaration() throws RecognitionException {
		Protocol_member_declarationContext _localctx = new Protocol_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_protocol_member_declaration);
		try {
			setState(1618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1612);
				protocol_property_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1613);
				protocol_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1614);
				protocol_initializer_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1615);
				protocol_subscript_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1616);
				protocol_associated_type_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1617);
				typealias_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Protocol_property_declarationContext extends ParserRuleContext {
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Protocol_property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_property_declaration; }
	}

	public final Protocol_property_declarationContext protocol_property_declaration() throws RecognitionException {
		Protocol_property_declarationContext _localctx = new Protocol_property_declarationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_protocol_property_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			variable_declaration_head();
			setState(1621);
			variable_name();
			setState(1622);
			type_annotation();
			setState(1623);
			getter_setter_keyword_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Protocol_method_declarationContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Protocol_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_method_declaration; }
	}

	public final Protocol_method_declarationContext protocol_method_declaration() throws RecognitionException {
		Protocol_method_declarationContext _localctx = new Protocol_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_protocol_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			function_head();
			setState(1626);
			function_name();
			setState(1628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1627);
				generic_parameter_clause();
				}
			}

			setState(1630);
			function_signature();
			setState(1632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1631);
				generic_where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Protocol_initializer_declarationContext extends ParserRuleContext {
		public Initializer_headContext initializer_head() {
			return getRuleContext(Initializer_headContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Protocol_initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_initializer_declaration; }
	}

	public final Protocol_initializer_declarationContext protocol_initializer_declaration() throws RecognitionException {
		Protocol_initializer_declarationContext _localctx = new Protocol_initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_protocol_initializer_declaration);
		int _la;
		try {
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				initializer_head();
				setState(1636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1635);
					generic_parameter_clause();
					}
				}

				setState(1638);
				parameter_clause();
				setState(1640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__43) {
					{
					setState(1639);
					match(T__43);
					}
				}

				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1642);
					generic_where_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1645);
				initializer_head();
				setState(1647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1646);
					generic_parameter_clause();
					}
				}

				setState(1649);
				parameter_clause();
				setState(1650);
				match(T__44);
				setState(1652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1651);
					generic_where_clause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Protocol_subscript_declarationContext extends ParserRuleContext {
		public Subscript_headContext subscript_head() {
			return getRuleContext(Subscript_headContext.class,0);
		}
		public Subscript_resultContext subscript_result() {
			return getRuleContext(Subscript_resultContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Protocol_subscript_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_subscript_declaration; }
	}

	public final Protocol_subscript_declarationContext protocol_subscript_declaration() throws RecognitionException {
		Protocol_subscript_declarationContext _localctx = new Protocol_subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_protocol_subscript_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			subscript_head();
			setState(1657);
			subscript_result();
			setState(1658);
			getter_setter_keyword_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Protocol_associated_type_declarationContext extends ParserRuleContext {
		public Typealias_nameContext typealias_name() {
			return getRuleContext(Typealias_nameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
		}
		public Protocol_associated_type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_associated_type_declaration; }
	}

	public final Protocol_associated_type_declarationContext protocol_associated_type_declaration() throws RecognitionException {
		Protocol_associated_type_declarationContext _localctx = new Protocol_associated_type_declarationContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_protocol_associated_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1660);
				attributes();
				}
			}

			setState(1664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0) {
				{
				setState(1663);
				access_level_modifier();
				}
			}

			setState(1666);
			match(T__47);
			setState(1667);
			typealias_name();
			setState(1669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1668);
				type_inheritance_clause();
				}
				break;
			}
			setState(1672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1671);
				typealias_assignment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Initializer_declarationContext extends ParserRuleContext {
		public Initializer_headContext initializer_head() {
			return getRuleContext(Initializer_headContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Initializer_bodyContext initializer_body() {
			return getRuleContext(Initializer_bodyContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_declaration; }
	}

	public final Initializer_declarationContext initializer_declaration() throws RecognitionException {
		Initializer_declarationContext _localctx = new Initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_initializer_declaration);
		int _la;
		try {
			setState(1698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1674);
				initializer_head();
				setState(1676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1675);
					generic_parameter_clause();
					}
				}

				setState(1678);
				parameter_clause();
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__43) {
					{
					setState(1679);
					match(T__43);
					}
				}

				setState(1683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1682);
					generic_where_clause();
					}
				}

				setState(1685);
				initializer_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1687);
				initializer_head();
				setState(1689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1688);
					generic_parameter_clause();
					}
				}

				setState(1691);
				parameter_clause();
				setState(1692);
				match(T__44);
				setState(1694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1693);
					generic_where_clause();
					}
				}

				setState(1696);
				initializer_body();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Initializer_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift3Parser.BANG, 0); }
		public Initializer_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_head; }
	}

	public final Initializer_headContext initializer_head() throws RecognitionException {
		Initializer_headContext _localctx = new Initializer_headContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_initializer_head);
		int _la;
		try {
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1700);
					attributes();
					}
				}

				setState(1704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 140324636329985L) != 0) {
					{
					setState(1703);
					declaration_modifiers();
					}
				}

				setState(1706);
				match(T__48);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1707);
					attributes();
					}
				}

				setState(1711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 140324636329985L) != 0) {
					{
					setState(1710);
					declaration_modifiers();
					}
				}

				setState(1713);
				match(T__48);
				setState(1714);
				match(QUESTION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1715);
					attributes();
					}
				}

				setState(1719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 140324636329985L) != 0) {
					{
					setState(1718);
					declaration_modifiers();
					}
				}

				setState(1721);
				match(T__48);
				setState(1722);
				match(BANG);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Initializer_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Initializer_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_body; }
	}

	public final Initializer_bodyContext initializer_body() throws RecognitionException {
		Initializer_bodyContext _localctx = new Initializer_bodyContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_initializer_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Deinitializer_declarationContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Deinitializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializer_declaration; }
	}

	public final Deinitializer_declarationContext deinitializer_declaration() throws RecognitionException {
		Deinitializer_declarationContext _localctx = new Deinitializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_deinitializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1727);
				attributes();
				}
			}

			setState(1730);
			match(T__49);
			setState(1731);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Extension_declarationContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Extension_bodyContext extension_body() {
			return getRuleContext(Extension_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Extension_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_declaration; }
	}

	public final Extension_declarationContext extension_declaration() throws RecognitionException {
		Extension_declarationContext _localctx = new Extension_declarationContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_extension_declaration);
		int _la;
		try {
			setState(1757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1733);
					attributes();
					}
				}

				setState(1737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0) {
					{
					setState(1736);
					access_level_modifier();
					}
				}

				setState(1739);
				match(T__50);
				setState(1740);
				type_identifier();
				setState(1742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1741);
					type_inheritance_clause();
					}
				}

				setState(1744);
				extension_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1746);
					attributes();
					}
				}

				setState(1750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0) {
					{
					setState(1749);
					access_level_modifier();
					}
				}

				setState(1752);
				match(T__50);
				setState(1753);
				type_identifier();
				setState(1754);
				generic_where_clause();
				setState(1755);
				extension_body();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Extension_bodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public List<Extension_memberContext> extension_member() {
			return getRuleContexts(Extension_memberContext.class);
		}
		public Extension_memberContext extension_member(int i) {
			return getRuleContext(Extension_memberContext.class,i);
		}
		public Extension_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_body; }
	}

	public final Extension_bodyContext extension_body() throws RecognitionException {
		Extension_bodyContext _localctx = new Extension_bodyContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_extension_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			match(LCURLY);
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 269865225384099936L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 261375L) != 0 || _la==AT) {
				{
				{
				setState(1760);
				extension_member();
				}
				}
				setState(1765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1766);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Extension_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Extension_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_member; }
	}

	public final Extension_memberContext extension_member() throws RecognitionException {
		Extension_memberContext _localctx = new Extension_memberContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_extension_member);
		try {
			setState(1770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__45:
			case T__46:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1768);
				declaration();
				}
				break;
			case T__21:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(1769);
				compiler_control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subscript_declarationContext extends ParserRuleContext {
		public Subscript_headContext subscript_head() {
			return getRuleContext(Subscript_headContext.class,0);
		}
		public Subscript_resultContext subscript_result() {
			return getRuleContext(Subscript_resultContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Subscript_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_declaration; }
	}

	public final Subscript_declarationContext subscript_declaration() throws RecognitionException {
		Subscript_declarationContext _localctx = new Subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_subscript_declaration);
		try {
			setState(1784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1772);
				subscript_head();
				setState(1773);
				subscript_result();
				setState(1774);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1776);
				subscript_head();
				setState(1777);
				subscript_result();
				setState(1778);
				getter_setter_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1780);
				subscript_head();
				setState(1781);
				subscript_result();
				setState(1782);
				getter_setter_keyword_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subscript_headContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Subscript_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_head; }
	}

	public final Subscript_headContext subscript_head() throws RecognitionException {
		Subscript_headContext _localctx = new Subscript_headContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_subscript_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1786);
				attributes();
				}
			}

			setState(1790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 140324636329985L) != 0) {
				{
				setState(1789);
				declaration_modifiers();
				}
			}

			setState(1792);
			match(T__51);
			setState(1793);
			parameter_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subscript_resultContext extends ParserRuleContext {
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Subscript_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_result; }
	}

	public final Subscript_resultContext subscript_result() throws RecognitionException {
		Subscript_resultContext _localctx = new Subscript_resultContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_subscript_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			arrow_operator();
			setState(1797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1796);
				attributes();
				}
				break;
			}
			setState(1799);
			type_(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operator_declarationContext extends ParserRuleContext {
		public Prefix_operator_declarationContext prefix_operator_declaration() {
			return getRuleContext(Prefix_operator_declarationContext.class,0);
		}
		public Postfix_operator_declarationContext postfix_operator_declaration() {
			return getRuleContext(Postfix_operator_declarationContext.class,0);
		}
		public Infix_operator_declarationContext infix_operator_declaration() {
			return getRuleContext(Infix_operator_declarationContext.class,0);
		}
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_operator_declaration);
		try {
			setState(1804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(1801);
				prefix_operator_declaration();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(1802);
				postfix_operator_declaration();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 3);
				{
				setState(1803);
				infix_operator_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Prefix_operator_declarationContext extends ParserRuleContext {
		public Operator_Context operator_() {
			return getRuleContext(Operator_Context.class,0);
		}
		public Prefix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator_declaration; }
	}

	public final Prefix_operator_declarationContext prefix_operator_declaration() throws RecognitionException {
		Prefix_operator_declarationContext _localctx = new Prefix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_prefix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			match(T__52);
			setState(1807);
			match(T__53);
			setState(1808);
			operator_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Postfix_operator_declarationContext extends ParserRuleContext {
		public Operator_Context operator_() {
			return getRuleContext(Operator_Context.class,0);
		}
		public Postfix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator_declaration; }
	}

	public final Postfix_operator_declarationContext postfix_operator_declaration() throws RecognitionException {
		Postfix_operator_declarationContext _localctx = new Postfix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_postfix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			match(T__54);
			setState(1811);
			match(T__53);
			setState(1812);
			operator_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Infix_operator_declarationContext extends ParserRuleContext {
		public Operator_Context operator_() {
			return getRuleContext(Operator_Context.class,0);
		}
		public Infix_operator_groupContext infix_operator_group() {
			return getRuleContext(Infix_operator_groupContext.class,0);
		}
		public Infix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_declaration; }
	}

	public final Infix_operator_declarationContext infix_operator_declaration() throws RecognitionException {
		Infix_operator_declarationContext _localctx = new Infix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_infix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			match(T__55);
			setState(1815);
			match(T__53);
			setState(1816);
			operator_();
			setState(1818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1817);
				infix_operator_group();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Infix_operator_groupContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Precedence_group_nameContext precedence_group_name() {
			return getRuleContext(Precedence_group_nameContext.class,0);
		}
		public Infix_operator_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_group; }
	}

	public final Infix_operator_groupContext infix_operator_group() throws RecognitionException {
		Infix_operator_groupContext _localctx = new Infix_operator_groupContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_infix_operator_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(COLON);
			setState(1821);
			precedence_group_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Precedence_group_declarationContext extends ParserRuleContext {
		public Precedence_group_nameContext precedence_group_name() {
			return getRuleContext(Precedence_group_nameContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public List<Precedence_group_attributeContext> precedence_group_attribute() {
			return getRuleContexts(Precedence_group_attributeContext.class);
		}
		public Precedence_group_attributeContext precedence_group_attribute(int i) {
			return getRuleContext(Precedence_group_attributeContext.class,i);
		}
		public Precedence_group_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_declaration; }
	}

	public final Precedence_group_declarationContext precedence_group_declaration() throws RecognitionException {
		Precedence_group_declarationContext _localctx = new Precedence_group_declarationContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_precedence_group_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			match(T__56);
			setState(1824);
			precedence_group_name();
			setState(1825);
			match(LCURLY);
			setState(1829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4323455642275676160L) != 0) {
				{
				{
				setState(1826);
				precedence_group_attribute();
				}
				}
				setState(1831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1832);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Precedence_group_attributeContext extends ParserRuleContext {
		public Precedence_group_relationContext precedence_group_relation() {
			return getRuleContext(Precedence_group_relationContext.class,0);
		}
		public Precedence_group_assignmentContext precedence_group_assignment() {
			return getRuleContext(Precedence_group_assignmentContext.class,0);
		}
		public Precedence_group_associativityContext precedence_group_associativity() {
			return getRuleContext(Precedence_group_associativityContext.class,0);
		}
		public Precedence_group_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_attribute; }
	}

	public final Precedence_group_attributeContext precedence_group_attribute() throws RecognitionException {
		Precedence_group_attributeContext _localctx = new Precedence_group_attributeContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_precedence_group_attribute);
		try {
			setState(1837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
			case T__58:
				enterOuterAlt(_localctx, 1);
				{
				setState(1834);
				precedence_group_relation();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(1835);
				precedence_group_assignment();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 3);
				{
				setState(1836);
				precedence_group_associativity();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Precedence_group_relationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Precedence_group_namesContext precedence_group_names() {
			return getRuleContext(Precedence_group_namesContext.class,0);
		}
		public Precedence_group_relationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_relation; }
	}

	public final Precedence_group_relationContext precedence_group_relation() throws RecognitionException {
		Precedence_group_relationContext _localctx = new Precedence_group_relationContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_precedence_group_relation);
		try {
			setState(1845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(1839);
				match(T__57);
				setState(1840);
				match(COLON);
				setState(1841);
				precedence_group_names();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(1842);
				match(T__58);
				setState(1843);
				match(COLON);
				setState(1844);
				precedence_group_names();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Precedence_group_assignmentContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Precedence_group_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_assignment; }
	}

	public final Precedence_group_assignmentContext precedence_group_assignment() throws RecognitionException {
		Precedence_group_assignmentContext _localctx = new Precedence_group_assignmentContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_precedence_group_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			match(T__59);
			setState(1848);
			match(COLON);
			setState(1849);
			boolean_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Precedence_group_associativityContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Associativity_Context associativity_() {
			return getRuleContext(Associativity_Context.class,0);
		}
		public Precedence_group_associativityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_associativity; }
	}

	public final Precedence_group_associativityContext precedence_group_associativity() throws RecognitionException {
		Precedence_group_associativityContext _localctx = new Precedence_group_associativityContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_precedence_group_associativity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			match(T__60);
			setState(1852);
			match(COLON);
			setState(1853);
			associativity_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Associativity_Context extends ParserRuleContext {
		public Associativity_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity_; }
	}

	public final Associativity_Context associativity_() throws RecognitionException {
		Associativity_Context _localctx = new Associativity_Context(_ctx, getState());
		enterRule(_localctx, 332, RULE_associativity_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1855);
			_la = _input.LA(1);
			if ( !((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 7L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Precedence_group_namesContext extends ParserRuleContext {
		public List<Precedence_group_nameContext> precedence_group_name() {
			return getRuleContexts(Precedence_group_nameContext.class);
		}
		public Precedence_group_nameContext precedence_group_name(int i) {
			return getRuleContext(Precedence_group_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Precedence_group_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_names; }
	}

	public final Precedence_group_namesContext precedence_group_names() throws RecognitionException {
		Precedence_group_namesContext _localctx = new Precedence_group_namesContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_precedence_group_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			precedence_group_name();
			setState(1862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1858);
				match(COMMA);
				setState(1859);
				precedence_group_name();
				}
				}
				setState(1864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Precedence_group_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Precedence_group_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_name; }
	}

	public final Precedence_group_nameContext precedence_group_name() throws RecognitionException {
		Precedence_group_nameContext _localctx = new Precedence_group_nameContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_precedence_group_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaration_modifierContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Declaration_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifier; }
	}

	public final Declaration_modifierContext declaration_modifier() throws RecognitionException {
		Declaration_modifierContext _localctx = new Declaration_modifierContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_declaration_modifier);
		try {
			setState(1891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1867);
				match(T__35);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1868);
				match(T__64);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1869);
				match(T__65);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1870);
				match(T__46);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1871);
				match(T__55);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1872);
				match(T__66);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1873);
				match(T__67);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1874);
				match(T__68);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1875);
				match(T__54);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1876);
				match(T__52);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1877);
				match(T__69);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1878);
				match(T__70);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1879);
				match(T__71);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1880);
				match(T__71);
				setState(1881);
				match(LPAREN);
				setState(1882);
				match(T__72);
				setState(1883);
				match(RPAREN);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1884);
				match(T__71);
				setState(1885);
				match(LPAREN);
				setState(1886);
				match(T__73);
				setState(1887);
				match(RPAREN);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1888);
				match(T__74);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1889);
				access_level_modifier();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1890);
				mutation_modifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaration_modifiersContext extends ParserRuleContext {
		public List<Declaration_modifierContext> declaration_modifier() {
			return getRuleContexts(Declaration_modifierContext.class);
		}
		public Declaration_modifierContext declaration_modifier(int i) {
			return getRuleContext(Declaration_modifierContext.class,i);
		}
		public Declaration_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifiers; }
	}

	public final Declaration_modifiersContext declaration_modifiers() throws RecognitionException {
		Declaration_modifiersContext _localctx = new Declaration_modifiersContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_declaration_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1893);
				declaration_modifier();
				}
				}
				setState(1896); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 140324636329985L) != 0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Access_level_modifierContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Access_level_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_level_modifier; }
	}

	public final Access_level_modifierContext access_level_modifier() throws RecognitionException {
		Access_level_modifierContext _localctx = new Access_level_modifierContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_access_level_modifier);
		try {
			setState(1923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1898);
				match(T__75);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1899);
				match(T__75);
				setState(1900);
				match(LPAREN);
				setState(1901);
				match(T__40);
				setState(1902);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1903);
				match(T__76);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1904);
				match(T__76);
				setState(1905);
				match(LPAREN);
				setState(1906);
				match(T__40);
				setState(1907);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1908);
				match(T__77);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1909);
				match(T__77);
				setState(1910);
				match(LPAREN);
				setState(1911);
				match(T__40);
				setState(1912);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1913);
				match(T__78);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1914);
				match(T__78);
				setState(1915);
				match(LPAREN);
				setState(1916);
				match(T__40);
				setState(1917);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1918);
				match(T__79);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1919);
				match(T__79);
				setState(1920);
				match(LPAREN);
				setState(1921);
				match(T__40);
				setState(1922);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mutation_modifierContext extends ParserRuleContext {
		public Mutation_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutation_modifier; }
	}

	public final Mutation_modifierContext mutation_modifier() throws RecognitionException {
		Mutation_modifierContext _localctx = new Mutation_modifierContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_mutation_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			_la = _input.LA(1);
			if ( !(_la==T__80 || _la==T__81) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public Value_binding_patternContext value_binding_pattern() {
			return getRuleContext(Value_binding_patternContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Enum_case_patternContext enum_case_pattern() {
			return getRuleContext(Enum_case_patternContext.class,0);
		}
		public Optional_patternContext optional_pattern() {
			return getRuleContext(Optional_patternContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Expression_patternContext expression_pattern() {
			return getRuleContext(Expression_patternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 346;
		enterRecursionRule(_localctx, 346, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1928);
				wildcard_pattern();
				setState(1930);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1929);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1932);
				identifier_pattern();
				setState(1934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1933);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1936);
				value_binding_pattern();
				}
				break;
			case 4:
				{
				setState(1937);
				tuple_pattern();
				setState(1939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1938);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1941);
				enum_case_pattern();
				}
				break;
			case 6:
				{
				setState(1942);
				optional_pattern();
				}
				break;
			case 7:
				{
				setState(1943);
				match(T__82);
				setState(1944);
				type_(0);
				}
				break;
			case 8:
				{
				setState(1945);
				expression_pattern();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1953);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(1948);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1949);
					match(T__83);
					setState(1950);
					type_(0);
					}
					} 
				}
				setState(1955);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Wildcard_patternContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(Swift3Parser.UNDERSCORE, 0); }
		public Wildcard_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_pattern; }
	}

	public final Wildcard_patternContext wildcard_pattern() throws RecognitionException {
		Wildcard_patternContext _localctx = new Wildcard_patternContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956);
			match(UNDERSCORE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Identifier_patternContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Identifier_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_pattern; }
	}

	public final Identifier_patternContext identifier_pattern() throws RecognitionException {
		Identifier_patternContext _localctx = new Identifier_patternContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_identifier_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Value_binding_patternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Value_binding_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_binding_pattern; }
	}

	public final Value_binding_patternContext value_binding_pattern() throws RecognitionException {
		Value_binding_patternContext _localctx = new Value_binding_patternContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_value_binding_pattern);
		try {
			setState(1964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(1960);
				match(T__5);
				setState(1961);
				pattern(0);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(1962);
				match(T__4);
				setState(1963);
				pattern(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_patternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Tuple_pattern_element_listContext tuple_pattern_element_list() {
			return getRuleContext(Tuple_pattern_element_listContext.class,0);
		}
		public Tuple_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern; }
	}

	public final Tuple_patternContext tuple_pattern() throws RecognitionException {
		Tuple_patternContext _localctx = new Tuple_patternContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_tuple_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			match(LPAREN);
			setState(1968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1967);
				tuple_pattern_element_list();
				}
				break;
			}
			setState(1970);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_pattern_element_listContext extends ParserRuleContext {
		public List<Tuple_pattern_elementContext> tuple_pattern_element() {
			return getRuleContexts(Tuple_pattern_elementContext.class);
		}
		public Tuple_pattern_elementContext tuple_pattern_element(int i) {
			return getRuleContext(Tuple_pattern_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Tuple_pattern_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element_list; }
	}

	public final Tuple_pattern_element_listContext tuple_pattern_element_list() throws RecognitionException {
		Tuple_pattern_element_listContext _localctx = new Tuple_pattern_element_listContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_tuple_pattern_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			tuple_pattern_element();
			setState(1977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1973);
				match(COMMA);
				setState(1974);
				tuple_pattern_element();
				}
				}
				setState(1979);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_pattern_elementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Tuple_pattern_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element; }
	}

	public final Tuple_pattern_elementContext tuple_pattern_element() throws RecognitionException {
		Tuple_pattern_elementContext _localctx = new Tuple_pattern_elementContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_tuple_pattern_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			pattern(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enum_case_patternContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Enum_case_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_pattern; }
	}

	public final Enum_case_patternContext enum_case_pattern() throws RecognitionException {
		Enum_case_patternContext _localctx = new Enum_case_patternContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_enum_case_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 127191502554382391L) != 0 || (((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 146025676847L) != 0) {
				{
				setState(1982);
				type_identifier();
				}
			}

			setState(1985);
			match(DOT);
			setState(1986);
			enum_case_name();
			setState(1988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1987);
				tuple_pattern();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Optional_patternContext extends ParserRuleContext {
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public Optional_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_pattern; }
	}

	public final Optional_patternContext optional_pattern() throws RecognitionException {
		Optional_patternContext _localctx = new Optional_patternContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_optional_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			identifier_pattern();
			setState(1991);
			match(QUESTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_patternContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_pattern; }
	}

	public final Expression_patternContext expression_pattern() throws RecognitionException {
		Expression_patternContext _localctx = new Expression_patternContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_expression_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Swift3Parser.AT, 0); }
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public Attribute_argument_clauseContext attribute_argument_clause() {
			return getRuleContext(Attribute_argument_clauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			match(AT);
			setState(1996);
			attribute_name();
			setState(1998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1997);
				attribute_argument_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_argument_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Attribute_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument_clause; }
	}

	public final Attribute_argument_clauseContext attribute_argument_clause() throws RecognitionException {
		Attribute_argument_clauseContext _localctx = new Attribute_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_attribute_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			match(LPAREN);
			setState(2003);
			balanced_tokens();
			setState(2004);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2007); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2006);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2009); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Balanced_tokensContext extends ParserRuleContext {
		public List<Balanced_tokenContext> balanced_token() {
			return getRuleContexts(Balanced_tokenContext.class);
		}
		public Balanced_tokenContext balanced_token(int i) {
			return getRuleContext(Balanced_tokenContext.class,i);
		}
		public Balanced_tokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_tokens; }
	}

	public final Balanced_tokensContext balanced_tokens() throws RecognitionException {
		Balanced_tokensContext _localctx = new Balanced_tokensContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_balanced_tokens);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2011);
					balanced_token();
					}
					} 
				}
				setState(2016);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Balanced_tokenContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Operator_Context operator_() {
			return getRuleContext(Operator_Context.class,0);
		}
		public TerminalNode Platform_name_platform_version() { return getToken(Swift3Parser.Platform_name_platform_version, 0); }
		public Any_punctuation_for_balanced_tokenContext any_punctuation_for_balanced_token() {
			return getRuleContext(Any_punctuation_for_balanced_tokenContext.class,0);
		}
		public Balanced_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_token; }
	}

	public final Balanced_tokenContext balanced_token() throws RecognitionException {
		Balanced_tokenContext _localctx = new Balanced_tokenContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_balanced_token);
		try {
			setState(2034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2017);
				match(LPAREN);
				setState(2018);
				balanced_tokens();
				setState(2019);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2021);
				match(LBRACK);
				setState(2022);
				balanced_tokens();
				setState(2023);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2025);
				match(LCURLY);
				setState(2026);
				balanced_tokens();
				setState(2027);
				match(RCURLY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2029);
				label_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2030);
				literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2031);
				operator_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2032);
				match(Platform_name_platform_version);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2033);
				any_punctuation_for_balanced_token();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Any_punctuation_for_balanced_tokenContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(Swift3Parser.SEMI, 0); }
		public TerminalNode EQUAL() { return getToken(Swift3Parser.EQUAL, 0); }
		public TerminalNode AT() { return getToken(Swift3Parser.AT, 0); }
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TerminalNode AND() { return getToken(Swift3Parser.AND, 0); }
		public TerminalNode BANG() { return getToken(Swift3Parser.BANG, 0); }
		public Any_punctuation_for_balanced_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_punctuation_for_balanced_token; }
	}

	public final Any_punctuation_for_balanced_tokenContext any_punctuation_for_balanced_token() throws RecognitionException {
		Any_punctuation_for_balanced_tokenContext _localctx = new Any_punctuation_for_balanced_tokenContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_any_punctuation_for_balanced_token);
		int _la;
		try {
			setState(2042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2036);
				_la = _input.LA(1);
				if ( !((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 7043770554695811075L) != 0 || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2037);
				arrow_operator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2038);
				if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
				setState(2039);
				match(AND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2040);
				if (!(SwiftSupport.isPostfixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPostfixOp(_input)");
				setState(2041);
				match(BANG);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Binary_expressionsContext binary_expressions() {
			return getRuleContext(Binary_expressionsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(2044);
				try_operator();
				}
				break;
			}
			setState(2047);
			prefix_expression();
			setState(2049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(2048);
				binary_expressions();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2051);
			expression();
			setState(2056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2052);
				match(COMMA);
				setState(2053);
				expression();
				}
				}
				setState(2058);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Prefix_expressionContext extends ParserRuleContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public In_out_expressionContext in_out_expression() {
			return getRuleContext(In_out_expressionContext.class,0);
		}
		public Prefix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expression; }
	}

	public final Prefix_expressionContext prefix_expression() throws RecognitionException {
		Prefix_expressionContext _localctx = new Prefix_expressionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_prefix_expression);
		try {
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2059);
				prefix_operator();
				setState(2060);
				postfix_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2062);
				postfix_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2063);
				in_out_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class In_out_expressionContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Swift3Parser.AND, 0); }
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public In_out_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_out_expression; }
	}

	public final In_out_expressionContext in_out_expression() throws RecognitionException {
		In_out_expressionContext _localctx = new In_out_expressionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_in_out_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			match(AND);
			setState(2067);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Try_operatorContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift3Parser.BANG, 0); }
		public Try_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_operator; }
	}

	public final Try_operatorContext try_operator() throws RecognitionException {
		Try_operatorContext _localctx = new Try_operatorContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_try_operator);
		try {
			setState(2074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2069);
				match(T__86);
				setState(2070);
				match(QUESTION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2071);
				match(T__86);
				setState(2072);
				match(BANG);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2073);
				match(T__86);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Binary_expressionContext extends ParserRuleContext {
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
		}
		public Type_casting_operatorContext type_casting_operator() {
			return getRuleContext(Type_casting_operatorContext.class,0);
		}
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_binary_expression);
		try {
			setState(2092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2076);
				binary_operator();
				setState(2077);
				prefix_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2079);
				assignment_operator();
				setState(2081);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2080);
					try_operator();
					}
					break;
				}
				setState(2083);
				prefix_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2085);
				conditional_operator();
				setState(2087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(2086);
					try_operator();
					}
					break;
				}
				setState(2089);
				prefix_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2091);
				type_casting_operator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Binary_expressionsContext extends ParserRuleContext {
		public List<Binary_expressionContext> binary_expression() {
			return getRuleContexts(Binary_expressionContext.class);
		}
		public Binary_expressionContext binary_expression(int i) {
			return getRuleContext(Binary_expressionContext.class,i);
		}
		public Binary_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expressions; }
	}

	public final Binary_expressionsContext binary_expressions() throws RecognitionException {
		Binary_expressionsContext _localctx = new Binary_expressionsContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_binary_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2095); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2094);
					binary_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2097); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_operatorContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_operator; }
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_conditional_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2099);
			match(QUESTION);
			setState(2101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(2100);
				try_operator();
				}
				break;
			}
			setState(2103);
			expression();
			setState(2104);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_casting_operatorContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift3Parser.BANG, 0); }
		public Type_casting_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_casting_operator; }
	}

	public final Type_casting_operatorContext type_casting_operator() throws RecognitionException {
		Type_casting_operatorContext _localctx = new Type_casting_operatorContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_type_casting_operator);
		try {
			setState(2116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2106);
				match(T__82);
				setState(2107);
				type_(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2108);
				match(T__83);
				setState(2109);
				type_(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2110);
				match(T__83);
				setState(2111);
				match(QUESTION);
				setState(2112);
				type_(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2113);
				match(T__83);
				setState(2114);
				match(BANG);
				setState(2115);
				type_(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primary_expressionContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Self_expressionContext self_expression() {
			return getRuleContext(Self_expressionContext.class,0);
		}
		public Superclass_expressionContext superclass_expression() {
			return getRuleContext(Superclass_expressionContext.class,0);
		}
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Tuple_expressionContext tuple_expression() {
			return getRuleContext(Tuple_expressionContext.class,0);
		}
		public Implicit_member_expressionContext implicit_member_expression() {
			return getRuleContext(Implicit_member_expressionContext.class,0);
		}
		public Wildcard_expressionContext wildcard_expression() {
			return getRuleContext(Wildcard_expressionContext.class,0);
		}
		public Selector_expressionContext selector_expression() {
			return getRuleContext(Selector_expressionContext.class,0);
		}
		public Key_path_expressionContext key_path_expression() {
			return getRuleContext(Key_path_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_primary_expression);
		try {
			setState(2132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2118);
				declaration_identifier();
				setState(2120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(2119);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2122);
				literal_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2123);
				self_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2124);
				superclass_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2125);
				closure_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2126);
				parenthesized_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2127);
				tuple_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2128);
				implicit_member_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2129);
				wildcard_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2130);
				selector_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2131);
				key_path_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Literal_expressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public Dictionary_literalContext dictionary_literal() {
			return getRuleContext(Dictionary_literalContext.class,0);
		}
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_literal_expression);
		try {
			setState(2142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2134);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2135);
				array_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2136);
				dictionary_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2137);
				match(T__87);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2138);
				match(T__88);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2139);
				match(T__89);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2140);
				match(T__90);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2141);
				match(T__91);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_literalContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public Array_literal_itemsContext array_literal_items() {
			return getRuleContext(Array_literal_itemsContext.class,0);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_array_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			match(LBRACK);
			setState(2146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(2145);
				array_literal_items();
				}
				break;
			}
			setState(2148);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_literal_itemsContext extends ParserRuleContext {
		public Array_literal_itemContext array_literal_item() {
			return getRuleContext(Array_literal_itemContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Array_literal_itemsContext array_literal_items() {
			return getRuleContext(Array_literal_itemsContext.class,0);
		}
		public Array_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_items; }
	}

	public final Array_literal_itemsContext array_literal_items() throws RecognitionException {
		Array_literal_itemsContext _localctx = new Array_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_array_literal_items);
		int _la;
		try {
			setState(2158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2150);
				array_literal_item();
				setState(2152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2151);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2154);
				array_literal_item();
				setState(2155);
				match(COMMA);
				setState(2156);
				array_literal_items();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_literal_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_item; }
	}

	public final Array_literal_itemContext array_literal_item() throws RecognitionException {
		Array_literal_itemContext _localctx = new Array_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_array_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2160);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dictionary_literalContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public Dictionary_literal_itemsContext dictionary_literal_items() {
			return getRuleContext(Dictionary_literal_itemsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Dictionary_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal; }
	}

	public final Dictionary_literalContext dictionary_literal() throws RecognitionException {
		Dictionary_literalContext _localctx = new Dictionary_literalContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_dictionary_literal);
		try {
			setState(2169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2162);
				match(LBRACK);
				setState(2163);
				dictionary_literal_items();
				setState(2164);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2166);
				match(LBRACK);
				setState(2167);
				match(COLON);
				setState(2168);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dictionary_literal_itemsContext extends ParserRuleContext {
		public Dictionary_literal_itemContext dictionary_literal_item() {
			return getRuleContext(Dictionary_literal_itemContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Dictionary_literal_itemsContext dictionary_literal_items() {
			return getRuleContext(Dictionary_literal_itemsContext.class,0);
		}
		public Dictionary_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_items; }
	}

	public final Dictionary_literal_itemsContext dictionary_literal_items() throws RecognitionException {
		Dictionary_literal_itemsContext _localctx = new Dictionary_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dictionary_literal_items);
		int _la;
		try {
			setState(2179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2171);
				dictionary_literal_item();
				setState(2173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2172);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2175);
				dictionary_literal_item();
				setState(2176);
				match(COMMA);
				setState(2177);
				dictionary_literal_items();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dictionary_literal_itemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Dictionary_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_item; }
	}

	public final Dictionary_literal_itemContext dictionary_literal_item() throws RecognitionException {
		Dictionary_literal_itemContext _localctx = new Dictionary_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_dictionary_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2181);
			expression();
			setState(2182);
			match(COLON);
			setState(2183);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Playground_literalContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(Swift3Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Swift3Parser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Playground_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playground_literal; }
	}

	public final Playground_literalContext playground_literal() throws RecognitionException {
		Playground_literalContext _localctx = new Playground_literalContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_playground_literal);
		try {
			setState(2218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__92:
				enterOuterAlt(_localctx, 1);
				{
				setState(2185);
				match(T__92);
				setState(2186);
				match(LPAREN);
				setState(2187);
				match(T__93);
				setState(2188);
				match(COLON);
				setState(2189);
				expression();
				setState(2190);
				match(COMMA);
				setState(2191);
				match(T__94);
				setState(2192);
				match(COLON);
				setState(2193);
				expression();
				setState(2194);
				match(COMMA);
				setState(2195);
				match(T__95);
				setState(2196);
				match(COLON);
				setState(2197);
				expression();
				setState(2198);
				match(COMMA);
				setState(2199);
				match(T__96);
				setState(2200);
				match(COLON);
				setState(2201);
				expression();
				setState(2202);
				match(RPAREN);
				}
				break;
			case T__97:
				enterOuterAlt(_localctx, 2);
				{
				setState(2204);
				match(T__97);
				setState(2205);
				match(LPAREN);
				setState(2206);
				match(T__98);
				setState(2207);
				match(COLON);
				setState(2208);
				expression();
				setState(2209);
				match(RPAREN);
				}
				break;
			case T__99:
				enterOuterAlt(_localctx, 3);
				{
				setState(2211);
				match(T__99);
				setState(2212);
				match(LPAREN);
				setState(2213);
				match(T__98);
				setState(2214);
				match(COLON);
				setState(2215);
				expression();
				setState(2216);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Self_expressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public Self_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_expression; }
	}

	public final Self_expressionContext self_expression() throws RecognitionException {
		Self_expressionContext _localctx = new Self_expressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_self_expression);
		try {
			setState(2239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2220);
				match(T__100);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2221);
				match(T__100);
				setState(2222);
				match(DOT);
				setState(2223);
				declaration_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2224);
				match(T__100);
				setState(2225);
				match(LBRACK);
				setState(2226);
				expression_list();
				setState(2227);
				match(RBRACK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2229);
				match(T__100);
				setState(2230);
				match(DOT);
				setState(2231);
				match(T__48);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2232);
				match(T__101);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2233);
				match(T__101);
				setState(2234);
				match(DOT);
				setState(2235);
				declaration_identifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2236);
				match(T__101);
				setState(2237);
				match(DOT);
				setState(2238);
				match(T__48);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Superclass_expressionContext extends ParserRuleContext {
		public Superclass_method_expressionContext superclass_method_expression() {
			return getRuleContext(Superclass_method_expressionContext.class,0);
		}
		public Superclass_subscript_expressionContext superclass_subscript_expression() {
			return getRuleContext(Superclass_subscript_expressionContext.class,0);
		}
		public Superclass_initializer_expressionContext superclass_initializer_expression() {
			return getRuleContext(Superclass_initializer_expressionContext.class,0);
		}
		public Superclass_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_expression; }
	}

	public final Superclass_expressionContext superclass_expression() throws RecognitionException {
		Superclass_expressionContext _localctx = new Superclass_expressionContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_superclass_expression);
		try {
			setState(2244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2241);
				superclass_method_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2242);
				superclass_subscript_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2243);
				superclass_initializer_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Superclass_method_expressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Superclass_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_method_expression; }
	}

	public final Superclass_method_expressionContext superclass_method_expression() throws RecognitionException {
		Superclass_method_expressionContext _localctx = new Superclass_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_superclass_method_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2246);
			match(T__102);
			setState(2247);
			match(DOT);
			setState(2248);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Superclass_subscript_expressionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public Superclass_subscript_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_subscript_expression; }
	}

	public final Superclass_subscript_expressionContext superclass_subscript_expression() throws RecognitionException {
		Superclass_subscript_expressionContext _localctx = new Superclass_subscript_expressionContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_superclass_subscript_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
			match(T__102);
			setState(2251);
			match(LBRACK);
			setState(2252);
			expression();
			setState(2253);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Superclass_initializer_expressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Superclass_initializer_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_initializer_expression; }
	}

	public final Superclass_initializer_expressionContext superclass_initializer_expression() throws RecognitionException {
		Superclass_initializer_expressionContext _localctx = new Superclass_initializer_expressionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_superclass_initializer_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2255);
			match(T__102);
			setState(2256);
			match(DOT);
			setState(2257);
			match(T__48);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Closure_expressionContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift3Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift3Parser.RCURLY, 0); }
		public Closure_signatureContext closure_signature() {
			return getRuleContext(Closure_signatureContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Closure_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_expression; }
	}

	public final Closure_expressionContext closure_expression() throws RecognitionException {
		Closure_expressionContext _localctx = new Closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2259);
			match(LCURLY);
			setState(2261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(2260);
				closure_signature();
				}
				break;
			}
			setState(2264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(2263);
				statements();
				}
				break;
			}
			setState(2266);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Closure_signatureContext extends ParserRuleContext {
		public Closure_parameter_clauseContext closure_parameter_clause() {
			return getRuleContext(Closure_parameter_clauseContext.class,0);
		}
		public Capture_listContext capture_list() {
			return getRuleContext(Capture_listContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Closure_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_signature; }
	}

	public final Closure_signatureContext closure_signature() throws RecognitionException {
		Closure_signatureContext _localctx = new Closure_signatureContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_closure_signature);
		int _la;
		try {
			setState(2283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(2268);
					capture_list();
					}
				}

				setState(2271);
				closure_parameter_clause();
				setState(2273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(2272);
					match(T__43);
					}
					break;
				}
				setState(2276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2275);
					function_result();
					}
					break;
				}
				setState(2278);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2280);
				capture_list();
				setState(2281);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Closure_parameter_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Closure_parameter_listContext closure_parameter_list() {
			return getRuleContext(Closure_parameter_listContext.class,0);
		}
		public Closure_parameter_clause_identifier_listContext closure_parameter_clause_identifier_list() {
			return getRuleContext(Closure_parameter_clause_identifier_listContext.class,0);
		}
		public Closure_parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_parameter_clause; }
	}

	public final Closure_parameter_clauseContext closure_parameter_clause() throws RecognitionException {
		Closure_parameter_clauseContext _localctx = new Closure_parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_closure_parameter_clause);
		try {
			setState(2292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2285);
				match(LPAREN);
				setState(2286);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2287);
				match(LPAREN);
				setState(2288);
				closure_parameter_list();
				setState(2289);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2291);
				closure_parameter_clause_identifier_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Closure_parameter_clause_identifier_listContext extends ParserRuleContext {
		public List<Declaration_identifierContext> declaration_identifier() {
			return getRuleContexts(Declaration_identifierContext.class);
		}
		public Declaration_identifierContext declaration_identifier(int i) {
			return getRuleContext(Declaration_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Closure_parameter_clause_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_parameter_clause_identifier_list; }
	}

	public final Closure_parameter_clause_identifier_listContext closure_parameter_clause_identifier_list() throws RecognitionException {
		Closure_parameter_clause_identifier_listContext _localctx = new Closure_parameter_clause_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_closure_parameter_clause_identifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2294);
			declaration_identifier();
			setState(2299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2295);
					match(COMMA);
					setState(2296);
					declaration_identifier();
					}
					} 
				}
				setState(2301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Closure_parameter_listContext extends ParserRuleContext {
		public List<Closure_parameterContext> closure_parameter() {
			return getRuleContexts(Closure_parameterContext.class);
		}
		public Closure_parameterContext closure_parameter(int i) {
			return getRuleContext(Closure_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Closure_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_parameter_list; }
	}

	public final Closure_parameter_listContext closure_parameter_list() throws RecognitionException {
		Closure_parameter_listContext _localctx = new Closure_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_closure_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2302);
			closure_parameter();
			setState(2307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2303);
				match(COMMA);
				setState(2304);
				closure_parameter();
				}
				}
				setState(2309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Closure_parameterContext extends ParserRuleContext {
		public Closure_parameter_nameContext closure_parameter_name() {
			return getRuleContext(Closure_parameter_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public Closure_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_parameter; }
	}

	public final Closure_parameterContext closure_parameter() throws RecognitionException {
		Closure_parameterContext _localctx = new Closure_parameterContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_closure_parameter);
		int _la;
		try {
			setState(2318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2310);
				closure_parameter_name();
				setState(2312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(2311);
					type_annotation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2314);
				closure_parameter_name();
				setState(2315);
				type_annotation();
				setState(2316);
				range_operator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Closure_parameter_nameContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Closure_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_parameter_name; }
	}

	public final Closure_parameter_nameContext closure_parameter_name() throws RecognitionException {
		Closure_parameter_nameContext _localctx = new Closure_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_closure_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2320);
			label_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Capture_listContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public Capture_list_itemsContext capture_list_items() {
			return getRuleContext(Capture_list_itemsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public Capture_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list; }
	}

	public final Capture_listContext capture_list() throws RecognitionException {
		Capture_listContext _localctx = new Capture_listContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_capture_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2322);
			match(LBRACK);
			setState(2323);
			capture_list_items();
			setState(2324);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Capture_list_itemsContext extends ParserRuleContext {
		public List<Capture_list_itemContext> capture_list_item() {
			return getRuleContexts(Capture_list_itemContext.class);
		}
		public Capture_list_itemContext capture_list_item(int i) {
			return getRuleContext(Capture_list_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Capture_list_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list_items; }
	}

	public final Capture_list_itemsContext capture_list_items() throws RecognitionException {
		Capture_list_itemsContext _localctx = new Capture_list_itemsContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_capture_list_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2326);
			capture_list_item();
			setState(2331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2327);
				match(COMMA);
				setState(2328);
				capture_list_item();
				}
				}
				setState(2333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Capture_list_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Capture_specifierContext capture_specifier() {
			return getRuleContext(Capture_specifierContext.class,0);
		}
		public Capture_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list_item; }
	}

	public final Capture_list_itemContext capture_list_item() throws RecognitionException {
		Capture_list_itemContext _localctx = new Capture_list_itemContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_capture_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(2334);
				capture_specifier();
				}
				break;
			}
			setState(2337);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Capture_specifierContext extends ParserRuleContext {
		public Capture_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_specifier; }
	}

	public final Capture_specifierContext capture_specifier() throws RecognitionException {
		Capture_specifierContext _localctx = new Capture_specifierContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_capture_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2339);
			_la = _input.LA(1);
			if ( !((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 12884901897L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Implicit_member_expressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Implicit_member_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_member_expression; }
	}

	public final Implicit_member_expressionContext implicit_member_expression() throws RecognitionException {
		Implicit_member_expressionContext _localctx = new Implicit_member_expressionContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_implicit_member_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2341);
			match(DOT);
			setState(2342);
			label_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parenthesized_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Parenthesized_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_expression; }
	}

	public final Parenthesized_expressionContext parenthesized_expression() throws RecognitionException {
		Parenthesized_expressionContext _localctx = new Parenthesized_expressionContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2344);
			match(LPAREN);
			setState(2345);
			expression();
			setState(2346);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public List<Tuple_elementContext> tuple_element() {
			return getRuleContexts(Tuple_elementContext.class);
		}
		public Tuple_elementContext tuple_element(int i) {
			return getRuleContext(Tuple_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Tuple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_expression; }
	}

	public final Tuple_expressionContext tuple_expression() throws RecognitionException {
		Tuple_expressionContext _localctx = new Tuple_expressionContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_tuple_expression);
		int _la;
		try {
			setState(2360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2348);
				match(LPAREN);
				setState(2349);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2350);
				match(LPAREN);
				setState(2351);
				tuple_element();
				setState(2354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2352);
					match(COMMA);
					setState(2353);
					tuple_element();
					}
					}
					setState(2356); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(2358);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Tuple_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_element; }
	}

	public final Tuple_elementContext tuple_element() throws RecognitionException {
		Tuple_elementContext _localctx = new Tuple_elementContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_tuple_element);
		try {
			setState(2367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2362);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2363);
				label_identifier();
				setState(2364);
				match(COLON);
				setState(2365);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Wildcard_expressionContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(Swift3Parser.UNDERSCORE, 0); }
		public Wildcard_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_expression; }
	}

	public final Wildcard_expressionContext wildcard_expression() throws RecognitionException {
		Wildcard_expressionContext _localctx = new Wildcard_expressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_wildcard_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2369);
			match(UNDERSCORE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Selector_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_expression; }
	}

	public final Selector_expressionContext selector_expression() throws RecognitionException {
		Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_selector_expression);
		try {
			setState(2388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2371);
				match(T__105);
				setState(2372);
				match(LPAREN);
				setState(2373);
				expression();
				setState(2374);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2376);
				match(T__105);
				setState(2377);
				match(LPAREN);
				setState(2378);
				match(T__106);
				setState(2379);
				expression();
				setState(2380);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2382);
				match(T__105);
				setState(2383);
				match(LPAREN);
				setState(2384);
				match(T__107);
				setState(2385);
				expression();
				setState(2386);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Key_path_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Key_path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_path_expression; }
	}

	public final Key_path_expressionContext key_path_expression() throws RecognitionException {
		Key_path_expressionContext _localctx = new Key_path_expressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_key_path_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2390);
			match(T__108);
			setState(2391);
			match(LPAREN);
			setState(2392);
			expression();
			setState(2393);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Postfix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	 
		public Postfix_expressionContext() { }
		public void copyFrom(Postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_expression_with_closureContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Trailing_closureContext trailing_closure() {
			return getRuleContext(Trailing_closureContext.class,0);
		}
		public Function_call_argument_clauseContext function_call_argument_clause() {
			return getRuleContext(Function_call_argument_clauseContext.class,0);
		}
		public Function_call_expression_with_closureContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Function_call_argument_clauseContext function_call_argument_clause() {
			return getRuleContext(Function_call_argument_clauseContext.class,0);
		}
		public Function_call_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_member_expression1Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public TerminalNode Pure_decimal_digits() { return getToken(Swift3Parser.Pure_decimal_digits, 0); }
		public Explicit_member_expression1Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Initializer_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Initializer_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Postfix_self_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Postfix_self_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Initializer_expression_with_argsContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Initializer_expression_with_argsContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Dynamic_typeContext extends Postfix_expressionContext {
		public Dynamic_type_expressionContext dynamic_type_expression() {
			return getRuleContext(Dynamic_type_expressionContext.class,0);
		}
		public Dynamic_typeContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Subscript_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public Subscript_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_member_expression2Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Explicit_member_expression2Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_member_expression3Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Explicit_member_expression3Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Explicit_member_expression4Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Explicit_member_expression4Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Postfix_operationContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Postfix_operatorContext postfix_operator() {
			return getRuleContext(Postfix_operatorContext.class,0);
		}
		public Postfix_operationContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends Postfix_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 462;
		enterRecursionRule(_localctx, 462, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2396);
				primary_expression();
				}
				break;
			case 2:
				{
				_localctx = new Dynamic_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2397);
				dynamic_type_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2448);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_operationContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2400);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2401);
						postfix_operator();
						}
						break;
					case 2:
						{
						_localctx = new Function_call_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2402);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2403);
						function_call_argument_clause();
						}
						break;
					case 3:
						{
						_localctx = new Function_call_expression_with_closureContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2404);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2406);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(2405);
							function_call_argument_clause();
							}
						}

						setState(2408);
						trailing_closure();
						}
						break;
					case 4:
						{
						_localctx = new Initializer_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2409);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2410);
						match(DOT);
						setState(2411);
						match(T__48);
						}
						break;
					case 5:
						{
						_localctx = new Initializer_expression_with_argsContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2412);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2413);
						match(DOT);
						setState(2414);
						match(T__48);
						setState(2415);
						match(LPAREN);
						setState(2416);
						argument_names();
						setState(2417);
						match(RPAREN);
						}
						break;
					case 6:
						{
						_localctx = new Explicit_member_expression1Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2419);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2420);
						match(DOT);
						setState(2421);
						match(Pure_decimal_digits);
						}
						break;
					case 7:
						{
						_localctx = new Explicit_member_expression2Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2422);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2423);
						match(DOT);
						setState(2424);
						declaration_identifier();
						setState(2426);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
						case 1:
							{
							setState(2425);
							generic_argument_clause();
							}
							break;
						}
						}
						break;
					case 8:
						{
						_localctx = new Explicit_member_expression3Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2428);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2429);
						match(DOT);
						setState(2430);
						declaration_identifier();
						setState(2431);
						match(LPAREN);
						setState(2432);
						argument_names();
						setState(2433);
						match(RPAREN);
						}
						break;
					case 9:
						{
						_localctx = new Explicit_member_expression4Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2435);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2436);
						match(LPAREN);
						setState(2437);
						argument_names();
						setState(2438);
						match(RPAREN);
						}
						break;
					case 10:
						{
						_localctx = new Postfix_self_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2440);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2441);
						match(DOT);
						setState(2442);
						match(T__100);
						}
						break;
					case 11:
						{
						_localctx = new Subscript_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2443);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2444);
						match(LBRACK);
						setState(2445);
						expression_list();
						setState(2446);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(2452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_argument_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Function_call_argument_listContext function_call_argument_list() {
			return getRuleContext(Function_call_argument_listContext.class,0);
		}
		public Function_call_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument_clause; }
	}

	public final Function_call_argument_clauseContext function_call_argument_clause() throws RecognitionException {
		Function_call_argument_clauseContext _localctx = new Function_call_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_function_call_argument_clause);
		try {
			setState(2459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2453);
				match(LPAREN);
				setState(2454);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2455);
				match(LPAREN);
				setState(2456);
				function_call_argument_list();
				setState(2457);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_argument_listContext extends ParserRuleContext {
		public List<Function_call_argumentContext> function_call_argument() {
			return getRuleContexts(Function_call_argumentContext.class);
		}
		public Function_call_argumentContext function_call_argument(int i) {
			return getRuleContext(Function_call_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift3Parser.COMMA, i);
		}
		public Function_call_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument_list; }
	}

	public final Function_call_argument_listContext function_call_argument_list() throws RecognitionException {
		Function_call_argument_listContext _localctx = new Function_call_argument_listContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_function_call_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2461);
			function_call_argument();
			setState(2466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2462);
				match(COMMA);
				setState(2463);
				function_call_argument();
				}
				}
				setState(2468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Operator_Context operator_() {
			return getRuleContext(Operator_Context.class,0);
		}
		public Function_call_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument; }
	}

	public final Function_call_argumentContext function_call_argument() throws RecognitionException {
		Function_call_argumentContext _localctx = new Function_call_argumentContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_function_call_argument);
		try {
			setState(2479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2469);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2470);
				label_identifier();
				setState(2471);
				match(COLON);
				setState(2472);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2474);
				operator_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2475);
				label_identifier();
				setState(2476);
				match(COLON);
				setState(2477);
				operator_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Trailing_closureContext extends ParserRuleContext {
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Trailing_closureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailing_closure; }
	}

	public final Trailing_closureContext trailing_closure() throws RecognitionException {
		Trailing_closureContext _localctx = new Trailing_closureContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_trailing_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2481);
			closure_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_namesContext extends ParserRuleContext {
		public List<Argument_nameContext> argument_name() {
			return getRuleContexts(Argument_nameContext.class);
		}
		public Argument_nameContext argument_name(int i) {
			return getRuleContext(Argument_nameContext.class,i);
		}
		public Argument_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_names; }
	}

	public final Argument_namesContext argument_names() throws RecognitionException {
		Argument_namesContext _localctx = new Argument_namesContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_argument_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			argument_name();
			setState(2487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -4894752866L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -2321156008837121L) != 0 || (((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 11L) != 0) {
				{
				{
				setState(2484);
				argument_name();
				}
				}
				setState(2489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_nameContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_name; }
	}

	public final Argument_nameContext argument_name() throws RecognitionException {
		Argument_nameContext _localctx = new Argument_nameContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2490);
			label_identifier();
			setState(2491);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dynamic_type_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Dynamic_type_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_type_expression; }
	}

	public final Dynamic_type_expressionContext dynamic_type_expression() throws RecognitionException {
		Dynamic_type_expressionContext _localctx = new Dynamic_type_expressionContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_dynamic_type_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2493);
			match(T__109);
			setState(2494);
			match(LPAREN);
			setState(2495);
			match(T__110);
			setState(2496);
			match(COLON);
			setState(2497);
			expression();
			setState(2498);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_Context extends ParserRuleContext {
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	 
		public Type_Context() { }
		public void copyFrom(Type_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class The_metatype_protocol_typeContext extends Type_Context {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public The_metatype_protocol_typeContext(Type_Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class The_function_typeContext extends Type_Context {
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public The_function_typeContext(Type_Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class The_implicitly_unwrapped_optional_typeContext extends Type_Context {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode BANG() { return getToken(Swift3Parser.BANG, 0); }
		public The_implicitly_unwrapped_optional_typeContext(Type_Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class The_dictionary_typeContext extends Type_Context {
		public Dictionary_typeContext dictionary_type() {
			return getRuleContext(Dictionary_typeContext.class,0);
		}
		public The_dictionary_typeContext(Type_Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class The_optional_typeContext extends Type_Context {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public The_optional_typeContext(Type_Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class The_tuple_typeContext extends Type_Context {
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public The_tuple_typeContext(Type_Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class The_self_typeContext extends Type_Context {
		public The_self_typeContext(Type_Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class The_array_typeContext extends Type_Context {
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public The_array_typeContext(Type_Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class The_metatype_type_typeContext extends Type_Context {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public The_metatype_type_typeContext(Type_Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class The_protocol_composition_typeContext extends Type_Context {
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public The_protocol_composition_typeContext(Type_Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class The_any_typeContext extends Type_Context {
		public The_any_typeContext(Type_Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class The_type_identifierContext extends Type_Context {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public The_type_identifierContext(Type_Context ctx) { copyFrom(ctx); }
	}

	public final Type_Context type_() throws RecognitionException {
		return type_(0);
	}

	private Type_Context type_(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_Context _localctx = new Type_Context(_ctx, _parentState);
		Type_Context _prevctx = _localctx;
		int _startState = 478;
		enterRecursionRule(_localctx, 478, RULE_type_, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				_localctx = new The_array_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2501);
				array_type();
				}
				break;
			case 2:
				{
				_localctx = new The_dictionary_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2502);
				dictionary_type();
				}
				break;
			case 3:
				{
				_localctx = new The_function_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2503);
				function_type();
				}
				break;
			case 4:
				{
				_localctx = new The_type_identifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2504);
				type_identifier();
				}
				break;
			case 5:
				{
				_localctx = new The_tuple_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2505);
				tuple_type();
				}
				break;
			case 6:
				{
				_localctx = new The_protocol_composition_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2506);
				protocol_composition_type();
				}
				break;
			case 7:
				{
				_localctx = new The_any_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2507);
				match(T__113);
				}
				break;
			case 8:
				{
				_localctx = new The_self_typeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2508);
				match(T__101);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2521);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
					case 1:
						{
						_localctx = new The_optional_typeContext(new Type_Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_);
						setState(2511);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2512);
						match(QUESTION);
						}
						break;
					case 2:
						{
						_localctx = new The_implicitly_unwrapped_optional_typeContext(new Type_Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_);
						setState(2513);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2514);
						match(BANG);
						}
						break;
					case 3:
						{
						_localctx = new The_metatype_type_typeContext(new Type_Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_);
						setState(2515);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2516);
						match(DOT);
						setState(2517);
						match(T__111);
						}
						break;
					case 4:
						{
						_localctx = new The_metatype_protocol_typeContext(new Type_Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_);
						setState(2518);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2519);
						match(DOT);
						setState(2520);
						match(T__112);
						}
						break;
					}
					} 
				}
				setState(2525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_annotationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_annotation; }
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2526);
			match(COLON);
			setState(2528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2527);
				attributes();
				}
				break;
			}
			setState(2531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__114) {
				{
				setState(2530);
				match(T__114);
				}
			}

			setState(2533);
			type_(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_identifierContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2535);
			type_name();
			setState(2537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(2536);
				generic_argument_clause();
				}
				break;
			}
			setState(2541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2539);
				match(DOT);
				setState(2540);
				type_identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_nameContext extends ParserRuleContext {
		public Declaration_identifierContext declaration_identifier() {
			return getRuleContext(Declaration_identifierContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2543);
			declaration_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_typeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2545);
			match(LPAREN);
			setState(2547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4894752866L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -2321156008837121L) != 0 || (((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 524491L) != 0) {
				{
				setState(2546);
				tuple_type_element_list();
				}
			}

			setState(2549);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_type_element_listContext extends ParserRuleContext {
		public Tuple_type_elementContext tuple_type_element() {
			return getRuleContext(Tuple_type_elementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Tuple_type_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element_list; }
	}

	public final Tuple_type_element_listContext tuple_type_element_list() throws RecognitionException {
		Tuple_type_element_listContext _localctx = new Tuple_type_element_listContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_tuple_type_element_list);
		try {
			setState(2556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2551);
				tuple_type_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2552);
				tuple_type_element();
				setState(2553);
				match(COMMA);
				setState(2554);
				tuple_type_element_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_type_elementContext extends ParserRuleContext {
		public Element_nameContext element_name() {
			return getRuleContext(Element_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Tuple_type_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element; }
	}

	public final Tuple_type_elementContext tuple_type_element() throws RecognitionException {
		Tuple_type_elementContext _localctx = new Tuple_type_elementContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_tuple_type_element);
		try {
			setState(2562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2558);
				element_name();
				setState(2559);
				type_annotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2561);
				type_(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Element_nameContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Element_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_name; }
	}

	public final Element_nameContext element_name() throws RecognitionException {
		Element_nameContext _localctx = new Element_nameContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_element_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2564);
			label_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_typeContext extends ParserRuleContext {
		public Function_type_argument_clauseContext function_type_argument_clause() {
			return getRuleContext(Function_type_argument_clauseContext.class,0);
		}
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_function_type);
		int _la;
		try {
			setState(2584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(2566);
					attributes();
					}
				}

				setState(2569);
				function_type_argument_clause();
				setState(2571);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2570);
					match(T__43);
					}
					break;
				}
				setState(2573);
				arrow_operator();
				setState(2574);
				type_(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(2576);
					attributes();
					}
				}

				setState(2579);
				function_type_argument_clause();
				setState(2580);
				match(T__44);
				setState(2581);
				arrow_operator();
				setState(2582);
				type_(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_type_argument_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift3Parser.RPAREN, 0); }
		public Function_type_argument_listContext function_type_argument_list() {
			return getRuleContext(Function_type_argument_listContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public Function_type_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type_argument_clause; }
	}

	public final Function_type_argument_clauseContext function_type_argument_clause() throws RecognitionException {
		Function_type_argument_clauseContext _localctx = new Function_type_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_function_type_argument_clause);
		try {
			setState(2595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2586);
				match(LPAREN);
				setState(2587);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2588);
				match(LPAREN);
				setState(2589);
				function_type_argument_list();
				setState(2591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2590);
					range_operator();
					}
					break;
				}
				setState(2593);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_type_argument_listContext extends ParserRuleContext {
		public Function_type_argumentContext function_type_argument() {
			return getRuleContext(Function_type_argumentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Function_type_argument_listContext function_type_argument_list() {
			return getRuleContext(Function_type_argument_listContext.class,0);
		}
		public Function_type_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type_argument_list; }
	}

	public final Function_type_argument_listContext function_type_argument_list() throws RecognitionException {
		Function_type_argument_listContext _localctx = new Function_type_argument_listContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_function_type_argument_list);
		try {
			setState(2602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2597);
				function_type_argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2598);
				function_type_argument();
				setState(2599);
				match(COMMA);
				setState(2600);
				function_type_argument_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_type_argumentContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Argument_labelContext argument_label() {
			return getRuleContext(Argument_labelContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Function_type_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type_argument; }
	}

	public final Function_type_argumentContext function_type_argument() throws RecognitionException {
		Function_type_argumentContext _localctx = new Function_type_argumentContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_function_type_argument);
		int _la;
		try {
			setState(2614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2604);
					attributes();
					}
					break;
				}
				setState(2608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__114) {
					{
					setState(2607);
					match(T__114);
					}
				}

				setState(2610);
				type_(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2611);
				argument_label();
				setState(2612);
				type_annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_labelContext extends ParserRuleContext {
		public Label_identifierContext label_identifier() {
			return getRuleContext(Label_identifierContext.class,0);
		}
		public Argument_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_label; }
	}

	public final Argument_labelContext argument_label() throws RecognitionException {
		Argument_labelContext _localctx = new Argument_labelContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_argument_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2616);
			label_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2618);
			match(LBRACK);
			setState(2619);
			type_(0);
			setState(2620);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dictionary_typeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift3Parser.LBRACK, 0); }
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public TerminalNode RBRACK() { return getToken(Swift3Parser.RBRACK, 0); }
		public Dictionary_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_type; }
	}

	public final Dictionary_typeContext dictionary_type() throws RecognitionException {
		Dictionary_typeContext _localctx = new Dictionary_typeContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_dictionary_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2622);
			match(LBRACK);
			setState(2623);
			type_(0);
			setState(2624);
			match(COLON);
			setState(2625);
			type_(0);
			setState(2626);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Protocol_composition_typeContext extends ParserRuleContext {
		public List<Protocol_identifierContext> protocol_identifier() {
			return getRuleContexts(Protocol_identifierContext.class);
		}
		public Protocol_identifierContext protocol_identifier(int i) {
			return getRuleContext(Protocol_identifierContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(Swift3Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Swift3Parser.AND, i);
		}
		public Protocol_composition_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_composition_type; }
	}

	public final Protocol_composition_typeContext protocol_composition_type() throws RecognitionException {
		Protocol_composition_typeContext _localctx = new Protocol_composition_typeContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_protocol_composition_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2628);
			protocol_identifier();
			setState(2631); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2629);
					match(AND);
					setState(2630);
					protocol_identifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2633); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Protocol_identifierContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Protocol_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_identifier; }
	}

	public final Protocol_identifierContext protocol_identifier() throws RecognitionException {
		Protocol_identifierContext _localctx = new Protocol_identifierContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_protocol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2635);
			type_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_inheritance_clauseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift3Parser.COLON, 0); }
		public Class_requirementContext class_requirement() {
			return getRuleContext(Class_requirementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Type_inheritance_listContext type_inheritance_list() {
			return getRuleContext(Type_inheritance_listContext.class,0);
		}
		public Type_inheritance_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_clause; }
	}

	public final Type_inheritance_clauseContext type_inheritance_clause() throws RecognitionException {
		Type_inheritance_clauseContext _localctx = new Type_inheritance_clauseContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_type_inheritance_clause);
		try {
			setState(2646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2637);
				match(COLON);
				setState(2638);
				class_requirement();
				setState(2639);
				match(COMMA);
				setState(2640);
				type_inheritance_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2642);
				match(COLON);
				setState(2643);
				class_requirement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2644);
				match(COLON);
				setState(2645);
				type_inheritance_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_inheritance_listContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift3Parser.COMMA, 0); }
		public Type_inheritance_listContext type_inheritance_list() {
			return getRuleContext(Type_inheritance_listContext.class,0);
		}
		public Type_inheritance_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_list; }
	}

	public final Type_inheritance_listContext type_inheritance_list() throws RecognitionException {
		Type_inheritance_listContext _localctx = new Type_inheritance_listContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_type_inheritance_list);
		try {
			setState(2653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2648);
				type_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2649);
				type_identifier();
				setState(2650);
				match(COMMA);
				setState(2651);
				type_inheritance_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_requirementContext extends ParserRuleContext {
		public Class_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_requirement; }
	}

	public final Class_requirementContext class_requirement() throws RecognitionException {
		Class_requirementContext _localctx = new Class_requirementContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_class_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2655);
			match(T__35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaration_identifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Swift3Parser.Identifier, 0); }
		public Keyword_as_identifier_in_declarationsContext keyword_as_identifier_in_declarations() {
			return getRuleContext(Keyword_as_identifier_in_declarationsContext.class,0);
		}
		public Declaration_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_identifier; }
	}

	public final Declaration_identifierContext declaration_identifier() throws RecognitionException {
		Declaration_identifierContext _localctx = new Declaration_identifierContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_declaration_identifier);
		try {
			setState(2659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2657);
				match(Identifier);
				}
				break;
			case T__25:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__45:
			case T__46:
			case T__52:
			case T__54:
			case T__55:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__79:
			case T__80:
			case T__81:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__98:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
				enterOuterAlt(_localctx, 2);
				{
				setState(2658);
				keyword_as_identifier_in_declarations();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Label_identifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Swift3Parser.Identifier, 0); }
		public Keyword_as_identifier_in_labelsContext keyword_as_identifier_in_labels() {
			return getRuleContext(Keyword_as_identifier_in_labelsContext.class,0);
		}
		public Label_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_identifier; }
	}

	public final Label_identifierContext label_identifier() throws RecognitionException {
		Label_identifierContext _localctx = new Label_identifierContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_label_identifier);
		try {
			setState(2663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2661);
				match(Identifier);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__25:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__86:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__98:
			case T__100:
			case T__101:
			case T__102:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__113:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
				enterOuterAlt(_localctx, 2);
				{
				setState(2662);
				keyword_as_identifier_in_labels();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Keyword_as_identifier_in_declarationsContext extends ParserRuleContext {
		public Keyword_as_identifier_in_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_as_identifier_in_declarations; }
	}

	public final Keyword_as_identifier_in_declarationsContext keyword_as_identifier_in_declarations() throws RecognitionException {
		Keyword_as_identifier_in_declarationsContext _localctx = new Keyword_as_identifier_in_declarationsContext(_ctx, getState());
		enterRule(_localctx, 522, RULE_keyword_as_identifier_in_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2665);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & -170909183242141696L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9219924018856398719L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Keyword_as_identifier_in_labelsContext extends ParserRuleContext {
		public Keyword_as_identifier_in_labelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_as_identifier_in_labels; }
	}

	public final Keyword_as_identifier_in_labelsContext keyword_as_identifier_in_labels() throws RecognitionException {
		Keyword_as_identifier_in_labelsContext _localctx = new Keyword_as_identifier_in_labelsContext(_ctx, getState());
		enterRule(_localctx, 524, RULE_keyword_as_identifier_in_labels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2667);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & -4894752866L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -2321156008837121L) != 0 || _la==T__127 || _la==T__128) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Swift3Parser.EQUAL, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 526, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2669);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(2670);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Negate_prefix_operatorContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(Swift3Parser.SUB, 0); }
		public Negate_prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate_prefix_operator; }
	}

	public final Negate_prefix_operatorContext negate_prefix_operator() throws RecognitionException {
		Negate_prefix_operatorContext _localctx = new Negate_prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 528, RULE_negate_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2672);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(2673);
			match(SUB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compilation_condition_ANDContext extends ParserRuleContext {
		public List<TerminalNode> AND() { return getTokens(Swift3Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Swift3Parser.AND, i);
		}
		public Compilation_condition_ANDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition_AND; }
	}

	public final Compilation_condition_ANDContext compilation_condition_AND() throws RecognitionException {
		Compilation_condition_ANDContext _localctx = new Compilation_condition_ANDContext(_ctx, getState());
		enterRule(_localctx, 530, RULE_compilation_condition_AND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2675);
			if (!(SwiftSupport.isOperator(_input,"&&"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"&&\")");
			setState(2676);
			match(AND);
			setState(2677);
			match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compilation_condition_ORContext extends ParserRuleContext {
		public List<TerminalNode> OR() { return getTokens(Swift3Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(Swift3Parser.OR, i);
		}
		public Compilation_condition_ORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition_OR; }
	}

	public final Compilation_condition_ORContext compilation_condition_OR() throws RecognitionException {
		Compilation_condition_ORContext _localctx = new Compilation_condition_ORContext(_ctx, getState());
		enterRule(_localctx, 532, RULE_compilation_condition_OR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2679);
			if (!(SwiftSupport.isOperator(_input,"||"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"||\")");
			setState(2680);
			match(OR);
			setState(2681);
			match(OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compilation_condition_GEContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(Swift3Parser.GT, 0); }
		public TerminalNode EQUAL() { return getToken(Swift3Parser.EQUAL, 0); }
		public Compilation_condition_GEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition_GE; }
	}

	public final Compilation_condition_GEContext compilation_condition_GE() throws RecognitionException {
		Compilation_condition_GEContext _localctx = new Compilation_condition_GEContext(_ctx, getState());
		enterRule(_localctx, 534, RULE_compilation_condition_GE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2683);
			if (!(SwiftSupport.isOperator(_input,">="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\">=\")");
			setState(2684);
			match(GT);
			setState(2685);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arrow_operatorContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(Swift3Parser.SUB, 0); }
		public TerminalNode GT() { return getToken(Swift3Parser.GT, 0); }
		public Arrow_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_operator; }
	}

	public final Arrow_operatorContext arrow_operator() throws RecognitionException {
		Arrow_operatorContext _localctx = new Arrow_operatorContext(_ctx, getState());
		enterRule(_localctx, 536, RULE_arrow_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2687);
			if (!(SwiftSupport.isOperator(_input,"->"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"->\")");
			setState(2688);
			match(SUB);
			setState(2689);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Range_operatorContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(Swift3Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Swift3Parser.DOT, i);
		}
		public Range_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_operator; }
	}

	public final Range_operatorContext range_operator() throws RecognitionException {
		Range_operatorContext _localctx = new Range_operatorContext(_ctx, getState());
		enterRule(_localctx, 538, RULE_range_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2691);
			if (!(SwiftSupport.isOperator(_input,"..."))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"...\")");
			setState(2692);
			match(DOT);
			setState(2693);
			match(DOT);
			setState(2694);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Same_type_equalsContext extends ParserRuleContext {
		public List<TerminalNode> EQUAL() { return getTokens(Swift3Parser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(Swift3Parser.EQUAL, i);
		}
		public Same_type_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_equals; }
	}

	public final Same_type_equalsContext same_type_equals() throws RecognitionException {
		Same_type_equalsContext _localctx = new Same_type_equalsContext(_ctx, getState());
		enterRule(_localctx, 540, RULE_same_type_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2696);
			if (!(SwiftSupport.isOperator(_input,"=="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"==\")");
			setState(2697);
			match(EQUAL);
			setState(2698);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Binary_operatorContext extends ParserRuleContext {
		public Operator_Context operator_() {
			return getRuleContext(Operator_Context.class,0);
		}
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 542, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2700);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(2701);
			operator_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Prefix_operatorContext extends ParserRuleContext {
		public Operator_Context operator_() {
			return getRuleContext(Operator_Context.class,0);
		}
		public Prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator; }
	}

	public final Prefix_operatorContext prefix_operator() throws RecognitionException {
		Prefix_operatorContext _localctx = new Prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 544, RULE_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2703);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(2704);
			operator_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Postfix_operatorContext extends ParserRuleContext {
		public Operator_Context operator_() {
			return getRuleContext(Operator_Context.class,0);
		}
		public Postfix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator; }
	}

	public final Postfix_operatorContext postfix_operator() throws RecognitionException {
		Postfix_operatorContext _localctx = new Postfix_operatorContext(_ctx, getState());
		enterRule(_localctx, 546, RULE_postfix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2706);
			if (!(SwiftSupport.isPostfixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPostfixOp(_input)");
			setState(2707);
			operator_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operator_Context extends ParserRuleContext {
		public Operator_headContext operator_head() {
			return getRuleContext(Operator_headContext.class,0);
		}
		public List<Operator_characterContext> operator_character() {
			return getRuleContexts(Operator_characterContext.class);
		}
		public Operator_characterContext operator_character(int i) {
			return getRuleContext(Operator_characterContext.class,i);
		}
		public Dot_operator_headContext dot_operator_head() {
			return getRuleContext(Dot_operator_headContext.class,0);
		}
		public List<Dot_operator_characterContext> dot_operator_character() {
			return getRuleContexts(Dot_operator_characterContext.class);
		}
		public Dot_operator_characterContext dot_operator_character(int i) {
			return getRuleContext(Dot_operator_characterContext.class,i);
		}
		public Operator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_; }
	}

	public final Operator_Context operator_() throws RecognitionException {
		Operator_Context _localctx = new Operator_Context(_ctx, getState());
		enterRule(_localctx, 548, RULE_operator_);
		try {
			int _alt;
			setState(2725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 1);
				{
				setState(2709);
				operator_head();
				setState(2714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2710);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(2711);
						operator_character();
						}
						} 
					}
					setState(2716);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2717);
				dot_operator_head();
				setState(2722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2718);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(2719);
						dot_operator_character();
						}
						} 
					}
					setState(2724);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operator_characterContext extends ParserRuleContext {
		public Operator_headContext operator_head() {
			return getRuleContext(Operator_headContext.class,0);
		}
		public TerminalNode Operator_following_character() { return getToken(Swift3Parser.Operator_following_character, 0); }
		public Operator_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_character; }
	}

	public final Operator_characterContext operator_character() throws RecognitionException {
		Operator_characterContext _localctx = new Operator_characterContext(_ctx, getState());
		enterRule(_localctx, 550, RULE_operator_character);
		try {
			setState(2729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 1);
				{
				setState(2727);
				operator_head();
				}
				break;
			case Operator_following_character:
				enterOuterAlt(_localctx, 2);
				{
				setState(2728);
				match(Operator_following_character);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operator_headContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(Swift3Parser.DIV, 0); }
		public TerminalNode EQUAL() { return getToken(Swift3Parser.EQUAL, 0); }
		public TerminalNode SUB() { return getToken(Swift3Parser.SUB, 0); }
		public TerminalNode ADD() { return getToken(Swift3Parser.ADD, 0); }
		public TerminalNode BANG() { return getToken(Swift3Parser.BANG, 0); }
		public TerminalNode MUL() { return getToken(Swift3Parser.MUL, 0); }
		public TerminalNode MOD() { return getToken(Swift3Parser.MOD, 0); }
		public TerminalNode AND() { return getToken(Swift3Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Swift3Parser.OR, 0); }
		public TerminalNode LT() { return getToken(Swift3Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Swift3Parser.GT, 0); }
		public TerminalNode CARET() { return getToken(Swift3Parser.CARET, 0); }
		public TerminalNode TILDE() { return getToken(Swift3Parser.TILDE, 0); }
		public TerminalNode QUESTION() { return getToken(Swift3Parser.QUESTION, 0); }
		public TerminalNode Operator_head_other() { return getToken(Swift3Parser.Operator_head_other, 0); }
		public Operator_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_head; }
	}

	public final Operator_headContext operator_head() throws RecognitionException {
		Operator_headContext _localctx = new Operator_headContext(_ctx, getState());
		enterRule(_localctx, 552, RULE_operator_head);
		int _la;
		try {
			setState(2733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2731);
				_la = _input.LA(1);
				if ( !((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 65499L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(2732);
				match(Operator_head_other);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dot_operator_headContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Dot_operator_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_head; }
	}

	public final Dot_operator_headContext dot_operator_head() throws RecognitionException {
		Dot_operator_headContext _localctx = new Dot_operator_headContext(_ctx, getState());
		enterRule(_localctx, 554, RULE_dot_operator_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2735);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dot_operator_characterContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift3Parser.DOT, 0); }
		public Operator_characterContext operator_character() {
			return getRuleContext(Operator_characterContext.class,0);
		}
		public Dot_operator_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_character; }
	}

	public final Dot_operator_characterContext dot_operator_character() throws RecognitionException {
		Dot_operator_characterContext _localctx = new Dot_operator_characterContext(_ctx, getState());
		enterRule(_localctx, 556, RULE_dot_operator_character);
		try {
			setState(2739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2737);
				match(DOT);
				}
				break;
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
			case Operator_following_character:
				enterOuterAlt(_localctx, 2);
				{
				setState(2738);
				operator_character();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Nil_literalContext nil_literal() {
			return getRuleContext(Nil_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 558, RULE_literal);
		try {
			setState(2745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2741);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2742);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2743);
				boolean_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2744);
				nil_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_literalContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Negate_prefix_operatorContext negate_prefix_operator() {
			return getRuleContext(Negate_prefix_operatorContext.class,0);
		}
		public TerminalNode Floating_point_literal() { return getToken(Swift3Parser.Floating_point_literal, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 560, RULE_numeric_literal);
		try {
			setState(2755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
				case 1:
					{
					setState(2747);
					negate_prefix_operator();
					}
					break;
				}
				setState(2750);
				integer_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2752);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2751);
					negate_prefix_operator();
					}
					break;
				}
				setState(2754);
				match(Floating_point_literal);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_literalContext extends ParserRuleContext {
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 562, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2757);
			_la = _input.LA(1);
			if ( !(_la==T__126 || _la==T__128) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nil_literalContext extends ParserRuleContext {
		public Nil_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_literal; }
	}

	public final Nil_literalContext nil_literal() throws RecognitionException {
		Nil_literalContext _localctx = new Nil_literalContext(_ctx, getState());
		enterRule(_localctx, 564, RULE_nil_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2759);
			match(T__127);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode Binary_literal() { return getToken(Swift3Parser.Binary_literal, 0); }
		public TerminalNode Octal_literal() { return getToken(Swift3Parser.Octal_literal, 0); }
		public TerminalNode Decimal_literal() { return getToken(Swift3Parser.Decimal_literal, 0); }
		public TerminalNode Pure_decimal_digits() { return getToken(Swift3Parser.Pure_decimal_digits, 0); }
		public TerminalNode Hexadecimal_literal() { return getToken(Swift3Parser.Hexadecimal_literal, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 566, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2761);
			_la = _input.LA(1);
			if ( !((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & 31L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode Static_string_literal() { return getToken(Swift3Parser.Static_string_literal, 0); }
		public TerminalNode Interpolated_string_literal() { return getToken(Swift3Parser.Interpolated_string_literal, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 568, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2763);
			_la = _input.LA(1);
			if ( !(_la==Static_string_literal || _la==Interpolated_string_literal) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return statements_impl_sempred((Statements_implContext)_localctx, predIndex);
		case 49:
			return compilation_condition_sempred((Compilation_conditionContext)_localctx, predIndex);
		case 173:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 189:
			return any_punctuation_for_balanced_token_sempred((Any_punctuation_for_balanced_tokenContext)_localctx, predIndex);
		case 231:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		case 239:
			return type__sempred((Type_Context)_localctx, predIndex);
		case 263:
			return assignment_operator_sempred((Assignment_operatorContext)_localctx, predIndex);
		case 264:
			return negate_prefix_operator_sempred((Negate_prefix_operatorContext)_localctx, predIndex);
		case 265:
			return compilation_condition_AND_sempred((Compilation_condition_ANDContext)_localctx, predIndex);
		case 266:
			return compilation_condition_OR_sempred((Compilation_condition_ORContext)_localctx, predIndex);
		case 267:
			return compilation_condition_GE_sempred((Compilation_condition_GEContext)_localctx, predIndex);
		case 268:
			return arrow_operator_sempred((Arrow_operatorContext)_localctx, predIndex);
		case 269:
			return range_operator_sempred((Range_operatorContext)_localctx, predIndex);
		case 270:
			return same_type_equals_sempred((Same_type_equalsContext)_localctx, predIndex);
		case 271:
			return binary_operator_sempred((Binary_operatorContext)_localctx, predIndex);
		case 272:
			return prefix_operator_sempred((Prefix_operatorContext)_localctx, predIndex);
		case 273:
			return postfix_operator_sempred((Postfix_operatorContext)_localctx, predIndex);
		case 274:
			return operator__sempred((Operator_Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean statements_impl_sempred(Statements_implContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return SwiftSupport.isSeparatedStatement(_input, _localctx.indexBefore);
		}
		return true;
	}
	private boolean compilation_condition_sempred(Compilation_conditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean any_punctuation_for_balanced_token_sempred(Any_punctuation_for_balanced_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return SwiftSupport.isPrefixOp(_input);
		case 5:
			return SwiftSupport.isPostfixOp(_input);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type__sempred(Type_Context _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 7);
		case 18:
			return precpred(_ctx, 6);
		case 19:
			return precpred(_ctx, 4);
		case 20:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean assignment_operator_sempred(Assignment_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean negate_prefix_operator_sempred(Negate_prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean compilation_condition_AND_sempred(Compilation_condition_ANDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return SwiftSupport.isOperator(_input,"&&");
		}
		return true;
	}
	private boolean compilation_condition_OR_sempred(Compilation_condition_ORContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return SwiftSupport.isOperator(_input,"||");
		}
		return true;
	}
	private boolean compilation_condition_GE_sempred(Compilation_condition_GEContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return SwiftSupport.isOperator(_input,">=");
		}
		return true;
	}
	private boolean arrow_operator_sempred(Arrow_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return SwiftSupport.isOperator(_input,"->");
		}
		return true;
	}
	private boolean range_operator_sempred(Range_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return SwiftSupport.isOperator(_input,"...");
		}
		return true;
	}
	private boolean same_type_equals_sempred(Same_type_equalsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return SwiftSupport.isOperator(_input,"==");
		}
		return true;
	}
	private boolean binary_operator_sempred(Binary_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean prefix_operator_sempred(Prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean postfix_operator_sempred(Postfix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return SwiftSupport.isPostfixOp(_input);
		}
		return true;
	}
	private boolean operator__sempred(Operator_Context _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return _input.get(_input.index()-1).getType()!=WS;
		case 33:
			return _input.get(_input.index()-1).getType()!=WS;
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u00ab\u0ace\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
		"\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
		"\u00b6\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007"+
		"\u00b9\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007"+
		"\u00bc\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007"+
		"\u00bf\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007"+
		"\u00c2\u0002\u00c3\u0007\u00c3\u0002\u00c4\u0007\u00c4\u0002\u00c5\u0007"+
		"\u00c5\u0002\u00c6\u0007\u00c6\u0002\u00c7\u0007\u00c7\u0002\u00c8\u0007"+
		"\u00c8\u0002\u00c9\u0007\u00c9\u0002\u00ca\u0007\u00ca\u0002\u00cb\u0007"+
		"\u00cb\u0002\u00cc\u0007\u00cc\u0002\u00cd\u0007\u00cd\u0002\u00ce\u0007"+
		"\u00ce\u0002\u00cf\u0007\u00cf\u0002\u00d0\u0007\u00d0\u0002\u00d1\u0007"+
		"\u00d1\u0002\u00d2\u0007\u00d2\u0002\u00d3\u0007\u00d3\u0002\u00d4\u0007"+
		"\u00d4\u0002\u00d5\u0007\u00d5\u0002\u00d6\u0007\u00d6\u0002\u00d7\u0007"+
		"\u00d7\u0002\u00d8\u0007\u00d8\u0002\u00d9\u0007\u00d9\u0002\u00da\u0007"+
		"\u00da\u0002\u00db\u0007\u00db\u0002\u00dc\u0007\u00dc\u0002\u00dd\u0007"+
		"\u00dd\u0002\u00de\u0007\u00de\u0002\u00df\u0007\u00df\u0002\u00e0\u0007"+
		"\u00e0\u0002\u00e1\u0007\u00e1\u0002\u00e2\u0007\u00e2\u0002\u00e3\u0007"+
		"\u00e3\u0002\u00e4\u0007\u00e4\u0002\u00e5\u0007\u00e5\u0002\u00e6\u0007"+
		"\u00e6\u0002\u00e7\u0007\u00e7\u0002\u00e8\u0007\u00e8\u0002\u00e9\u0007"+
		"\u00e9\u0002\u00ea\u0007\u00ea\u0002\u00eb\u0007\u00eb\u0002\u00ec\u0007"+
		"\u00ec\u0002\u00ed\u0007\u00ed\u0002\u00ee\u0007\u00ee\u0002\u00ef\u0007"+
		"\u00ef\u0002\u00f0\u0007\u00f0\u0002\u00f1\u0007\u00f1\u0002\u00f2\u0007"+
		"\u00f2\u0002\u00f3\u0007\u00f3\u0002\u00f4\u0007\u00f4\u0002\u00f5\u0007"+
		"\u00f5\u0002\u00f6\u0007\u00f6\u0002\u00f7\u0007\u00f7\u0002\u00f8\u0007"+
		"\u00f8\u0002\u00f9\u0007\u00f9\u0002\u00fa\u0007\u00fa\u0002\u00fb\u0007"+
		"\u00fb\u0002\u00fc\u0007\u00fc\u0002\u00fd\u0007\u00fd\u0002\u00fe\u0007"+
		"\u00fe\u0002\u00ff\u0007\u00ff\u0002\u0100\u0007\u0100\u0002\u0101\u0007"+
		"\u0101\u0002\u0102\u0007\u0102\u0002\u0103\u0007\u0103\u0002\u0104\u0007"+
		"\u0104\u0002\u0105\u0007\u0105\u0002\u0106\u0007\u0106\u0002\u0107\u0007"+
		"\u0107\u0002\u0108\u0007\u0108\u0002\u0109\u0007\u0109\u0002\u010a\u0007"+
		"\u010a\u0002\u010b\u0007\u010b\u0002\u010c\u0007\u010c\u0002\u010d\u0007"+
		"\u010d\u0002\u010e\u0007\u010e\u0002\u010f\u0007\u010f\u0002\u0110\u0007"+
		"\u0110\u0002\u0111\u0007\u0111\u0002\u0112\u0007\u0112\u0002\u0113\u0007"+
		"\u0113\u0002\u0114\u0007\u0114\u0002\u0115\u0007\u0115\u0002\u0116\u0007"+
		"\u0116\u0002\u0117\u0007\u0117\u0002\u0118\u0007\u0118\u0002\u0119\u0007"+
		"\u0119\u0002\u011a\u0007\u011a\u0002\u011b\u0007\u011b\u0002\u011c\u0007"+
		"\u011c\u0001\u0000\u0003\u0000\u023c\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0242\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0246\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u024a\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u024e\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0252\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0256\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u025a\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u025e\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0262"+
		"\b\u0001\u0003\u0001\u0264\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u026c\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0272\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0276\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u027a\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u027e\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0284\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0288\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u028c\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0290\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0294\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0298\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u029e\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u02a9\b\t\n\t\f\t\u02ac\t\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u02b2\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u02b8\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u02c2\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u02cc\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u02d2\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u02d8\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u02e3\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u02e9\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u02f1\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u02f9\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u02fd\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0302\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0318\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0324\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0328\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u032c\b\u001f\u0001 \u0001 \u0001!\u0001!\u0003!\u0332\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0003$\u033d\b$\u0001"+
		"%\u0001%\u0003%\u0341\b%\u0001&\u0001&\u0003&\u0345\b&\u0001&\u0003&\u0348"+
		"\b&\u0001&\u0001&\u0001\'\u0001\'\u0003\'\u034e\b\'\u0001(\u0001(\u0003"+
		"(\u0352\b(\u0001(\u0003(\u0355\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0003"+
		")\u035c\b)\u0001*\u0004*\u035f\b*\u000b*\f*\u0360\u0001+\u0001+\u0001"+
		"+\u0003+\u0366\b+\u0001,\u0001,\u0003,\u036a\b,\u0001-\u0001-\u0001.\u0001"+
		".\u0001/\u0001/\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00031\u037e\b1\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00051\u0388\b1\n1\f1\u038b\t1\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00032\u039d\b2\u00013\u00013\u00013\u0001"+
		"3\u00014\u00014\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u03b5"+
		"\b6\u00017\u00017\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u0001"+
		":\u0001:\u0001:\u0005:\u03c3\b:\n:\f:\u03c6\t:\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0001<\u0001=\u0001=\u0001=\u0005=\u03d1\b=\n=\f=\u03d4\t=\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u03df"+
		"\b>\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0005@\u03e7\b@\n@\f@\u03ea"+
		"\t@\u0001A\u0001A\u0003A\u03ee\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0003B\u03f8\bB\u0001C\u0001C\u0001C\u0001C\u0001D\u0001"+
		"D\u0001D\u0001D\u0001E\u0001E\u0001E\u0005E\u0405\bE\nE\fE\u0408\tE\u0001"+
		"F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u041c\bG\u0001"+
		"H\u0004H\u041f\bH\u000bH\fH\u0420\u0001I\u0003I\u0424\bI\u0001J\u0001"+
		"J\u0003J\u0428\bJ\u0001J\u0001J\u0001K\u0003K\u042d\bK\u0001K\u0001K\u0003"+
		"K\u0431\bK\u0001K\u0001K\u0001L\u0001L\u0001M\u0001M\u0001M\u0005M\u043a"+
		"\bM\nM\fM\u043d\tM\u0001N\u0001N\u0003N\u0441\bN\u0001O\u0003O\u0444\b"+
		"O\u0001O\u0003O\u0447\bO\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0005"+
		"P\u044f\bP\nP\fP\u0452\tP\u0001Q\u0001Q\u0003Q\u0456\bQ\u0001R\u0001R"+
		"\u0001R\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0003S\u046e\bS\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003"+
		"S\u0477\bS\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u047e\bS\u0001T\u0003"+
		"T\u0481\bT\u0001T\u0003T\u0484\bT\u0001T\u0001T\u0001U\u0001U\u0001V\u0001"+
		"V\u0001V\u0003V\u048d\bV\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0003V\u0496\bV\u0001W\u0003W\u0499\bW\u0001W\u0003W\u049c\bW\u0001"+
		"W\u0001W\u0001W\u0001X\u0003X\u04a2\bX\u0001X\u0003X\u04a5\bX\u0001X\u0001"+
		"X\u0003X\u04a9\bX\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0001Z\u0001"+
		"Z\u0001Z\u0003Z\u04b4\bZ\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0003Z\u04bd\bZ\u0001[\u0003[\u04c0\b[\u0001[\u0003[\u04c3\b[\u0001"+
		"[\u0001[\u0001\\\u0003\\\u04c8\b\\\u0001\\\u0003\\\u04cb\b\\\u0001\\\u0001"+
		"\\\u0001]\u0001]\u0001]\u0003]\u04d2\b]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0003]\u04db\b]\u0001^\u0003^\u04de\b^\u0001^\u0001^\u0003"+
		"^\u04e2\b^\u0001^\u0001^\u0001_\u0003_\u04e7\b_\u0001_\u0001_\u0003_\u04eb"+
		"\b_\u0001_\u0001_\u0001`\u0003`\u04f0\b`\u0001`\u0003`\u04f3\b`\u0001"+
		"`\u0001`\u0001`\u0003`\u04f8\b`\u0001`\u0001`\u0001a\u0001a\u0001b\u0001"+
		"b\u0001b\u0001c\u0001c\u0001c\u0003c\u0504\bc\u0001c\u0001c\u0003c\u0508"+
		"\bc\u0001c\u0003c\u050b\bc\u0001d\u0003d\u050e\bd\u0001d\u0003d\u0511"+
		"\bd\u0001d\u0001d\u0001e\u0001e\u0003e\u0517\be\u0001f\u0001f\u0003f\u051b"+
		"\bf\u0001f\u0003f\u051e\bf\u0001f\u0001f\u0001f\u0003f\u0523\bf\u0003"+
		"f\u0525\bf\u0001g\u0001g\u0003g\u0529\bg\u0001g\u0001g\u0001h\u0001h\u0001"+
		"i\u0001i\u0001i\u0001i\u0001i\u0001i\u0003i\u0535\bi\u0001j\u0001j\u0001"+
		"j\u0005j\u053a\bj\nj\fj\u053d\tj\u0001k\u0003k\u0540\bk\u0001k\u0001k"+
		"\u0001k\u0003k\u0545\bk\u0001k\u0003k\u0548\bk\u0001k\u0001k\u0001k\u0001"+
		"k\u0003k\u054e\bk\u0001k\u0001k\u0001k\u0001k\u0003k\u0554\bk\u0001l\u0001"+
		"l\u0001m\u0001m\u0001n\u0001n\u0001n\u0001o\u0003o\u055e\bo\u0001o\u0003"+
		"o\u0561\bo\u0001o\u0001o\u0003o\u0565\bo\u0001o\u0003o\u0568\bo\u0001"+
		"o\u0003o\u056b\bo\u0001p\u0003p\u056e\bp\u0001p\u0001p\u0001p\u0003p\u0573"+
		"\bp\u0001p\u0003p\u0576\bp\u0001p\u0003p\u0579\bp\u0001p\u0001p\u0003"+
		"p\u057d\bp\u0001p\u0001p\u0001q\u0001q\u0003q\u0583\bq\u0001r\u0001r\u0001"+
		"r\u0003r\u0588\br\u0001s\u0003s\u058b\bs\u0001s\u0003s\u058e\bs\u0001"+
		"s\u0001s\u0001s\u0001t\u0001t\u0001t\u0001t\u0001t\u0003t\u0598\bt\u0001"+
		"u\u0001u\u0003u\u059c\bu\u0001v\u0001v\u0001w\u0001w\u0001x\u0001x\u0001"+
		"x\u0003x\u05a5\bx\u0001x\u0001x\u0003x\u05a9\bx\u0001x\u0001x\u0001x\u0001"+
		"x\u0001y\u0001y\u0003y\u05b1\by\u0001z\u0001z\u0001z\u0003z\u05b6\bz\u0001"+
		"{\u0003{\u05b9\b{\u0001{\u0001{\u0001{\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0003|\u05c3\b|\u0001}\u0001}\u0003}\u05c7\b}\u0001~\u0001~\u0001~\u0001"+
		"\u007f\u0001\u007f\u0001\u007f\u0003\u007f\u05cf\b\u007f\u0001\u0080\u0003"+
		"\u0080\u05d2\b\u0080\u0001\u0080\u0003\u0080\u05d5\b\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0080\u0003\u0080\u05da\b\u0080\u0001\u0080\u0003\u0080"+
		"\u05dd\b\u0080\u0001\u0080\u0003\u0080\u05e0\b\u0080\u0001\u0080\u0001"+
		"\u0080\u0001\u0081\u0001\u0081\u0001\u0082\u0001\u0082\u0005\u0082\u05e8"+
		"\b\u0082\n\u0082\f\u0082\u05eb\t\u0082\u0001\u0082\u0001\u0082\u0001\u0083"+
		"\u0001\u0083\u0003\u0083\u05f1\b\u0083\u0001\u0084\u0003\u0084\u05f4\b"+
		"\u0084\u0001\u0084\u0003\u0084\u05f7\b\u0084\u0001\u0084\u0003\u0084\u05fa"+
		"\b\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u05ff\b\u0084"+
		"\u0001\u0084\u0003\u0084\u0602\b\u0084\u0001\u0084\u0003\u0084\u0605\b"+
		"\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u060a\b\u0084\u0001"+
		"\u0084\u0003\u0084\u060d\b\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u0611"+
		"\b\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u0616\b\u0084"+
		"\u0001\u0084\u0003\u0084\u0619\b\u0084\u0001\u0084\u0003\u0084\u061c\b"+
		"\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u0620\b\u0084\u0001\u0085\u0001"+
		"\u0085\u0001\u0086\u0001\u0086\u0005\u0086\u0626\b\u0086\n\u0086\f\u0086"+
		"\u0629\t\u0086\u0001\u0086\u0001\u0086\u0001\u0087\u0001\u0087\u0003\u0087"+
		"\u062f\b\u0087\u0001\u0088\u0003\u0088\u0632\b\u0088\u0001\u0088\u0003"+
		"\u0088\u0635\b\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0003\u0088\u063a"+
		"\b\u0088\u0001\u0088\u0001\u0088\u0001\u0089\u0001\u0089\u0001\u008a\u0001"+
		"\u008a\u0005\u008a\u0642\b\u008a\n\u008a\f\u008a\u0645\t\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008b\u0001\u008b\u0003\u008b\u064b\b\u008b\u0001\u008c"+
		"\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0003\u008c"+
		"\u0653\b\u008c\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008e\u0001\u008e\u0001\u008e\u0003\u008e\u065d\b\u008e\u0001\u008e"+
		"\u0001\u008e\u0003\u008e\u0661\b\u008e\u0001\u008f\u0001\u008f\u0003\u008f"+
		"\u0665\b\u008f\u0001\u008f\u0001\u008f\u0003\u008f\u0669\b\u008f\u0001"+
		"\u008f\u0003\u008f\u066c\b\u008f\u0001\u008f\u0001\u008f\u0003\u008f\u0670"+
		"\b\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0003\u008f\u0675\b\u008f"+
		"\u0003\u008f\u0677\b\u008f\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090"+
		"\u0001\u0091\u0003\u0091\u067e\b\u0091\u0001\u0091\u0003\u0091\u0681\b"+
		"\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0003\u0091\u0686\b\u0091\u0001"+
		"\u0091\u0003\u0091\u0689\b\u0091\u0001\u0092\u0001\u0092\u0003\u0092\u068d"+
		"\b\u0092\u0001\u0092\u0001\u0092\u0003\u0092\u0691\b\u0092\u0001\u0092"+
		"\u0003\u0092\u0694\b\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092"+
		"\u0003\u0092\u069a\b\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0003\u0092"+
		"\u069f\b\u0092\u0001\u0092\u0001\u0092\u0003\u0092\u06a3\b\u0092\u0001"+
		"\u0093\u0003\u0093\u06a6\b\u0093\u0001\u0093\u0003\u0093\u06a9\b\u0093"+
		"\u0001\u0093\u0001\u0093\u0003\u0093\u06ad\b\u0093\u0001\u0093\u0003\u0093"+
		"\u06b0\b\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u06b5\b"+
		"\u0093\u0001\u0093\u0003\u0093\u06b8\b\u0093\u0001\u0093\u0001\u0093\u0003"+
		"\u0093\u06bc\b\u0093\u0001\u0094\u0001\u0094\u0001\u0095\u0003\u0095\u06c1"+
		"\b\u0095\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0096\u0003\u0096\u06c7"+
		"\b\u0096\u0001\u0096\u0003\u0096\u06ca\b\u0096\u0001\u0096\u0001\u0096"+
		"\u0001\u0096\u0003\u0096\u06cf\b\u0096\u0001\u0096\u0001\u0096\u0001\u0096"+
		"\u0003\u0096\u06d4\b\u0096\u0001\u0096\u0003\u0096\u06d7\b\u0096\u0001"+
		"\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0003\u0096\u06de"+
		"\b\u0096\u0001\u0097\u0001\u0097\u0005\u0097\u06e2\b\u0097\n\u0097\f\u0097"+
		"\u06e5\t\u0097\u0001\u0097\u0001\u0097\u0001\u0098\u0001\u0098\u0003\u0098"+
		"\u06eb\b\u0098\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099"+
		"\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099"+
		"\u0001\u0099\u0003\u0099\u06f9\b\u0099\u0001\u009a\u0003\u009a\u06fc\b"+
		"\u009a\u0001\u009a\u0003\u009a\u06ff\b\u009a\u0001\u009a\u0001\u009a\u0001"+
		"\u009a\u0001\u009b\u0001\u009b\u0003\u009b\u0706\b\u009b\u0001\u009b\u0001"+
		"\u009b\u0001\u009c\u0001\u009c\u0001\u009c\u0003\u009c\u070d\b\u009c\u0001"+
		"\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009e\u0001\u009e\u0001"+
		"\u009e\u0001\u009e\u0001\u009f\u0001\u009f\u0001\u009f\u0001\u009f\u0003"+
		"\u009f\u071b\b\u009f\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a1\u0001"+
		"\u00a1\u0001\u00a1\u0001\u00a1\u0005\u00a1\u0724\b\u00a1\n\u00a1\f\u00a1"+
		"\u0727\t\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a2\u0001\u00a2\u0001\u00a2"+
		"\u0003\u00a2\u072e\b\u00a2\u0001\u00a3\u0001\u00a3\u0001\u00a3\u0001\u00a3"+
		"\u0001\u00a3\u0001\u00a3\u0003\u00a3\u0736\b\u00a3\u0001\u00a4\u0001\u00a4"+
		"\u0001\u00a4\u0001\u00a4\u0001\u00a5\u0001\u00a5\u0001\u00a5\u0001\u00a5"+
		"\u0001\u00a6\u0001\u00a6\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0005\u00a7"+
		"\u0745\b\u00a7\n\u00a7\f\u00a7\u0748\t\u00a7\u0001\u00a8\u0001\u00a8\u0001"+
		"\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001"+
		"\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001"+
		"\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001"+
		"\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0003"+
		"\u00a9\u0764\b\u00a9\u0001\u00aa\u0004\u00aa\u0767\b\u00aa\u000b\u00aa"+
		"\f\u00aa\u0768\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab"+
		"\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab"+
		"\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab"+
		"\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab"+
		"\u0001\u00ab\u0001\u00ab\u0003\u00ab\u0784\b\u00ab\u0001\u00ac\u0001\u00ac"+
		"\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0003\u00ad\u078b\b\u00ad\u0001\u00ad"+
		"\u0001\u00ad\u0003\u00ad\u078f\b\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad"+
		"\u0003\u00ad\u0794\b\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad"+
		"\u0001\u00ad\u0003\u00ad\u079b\b\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad"+
		"\u0005\u00ad\u07a0\b\u00ad\n\u00ad\f\u00ad\u07a3\t\u00ad\u0001\u00ae\u0001"+
		"\u00ae\u0001\u00af\u0001\u00af\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001"+
		"\u00b0\u0003\u00b0\u07ad\b\u00b0\u0001\u00b1\u0001\u00b1\u0003\u00b1\u07b1"+
		"\b\u00b1\u0001\u00b1\u0001\u00b1\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0005"+
		"\u00b2\u07b8\b\u00b2\n\u00b2\f\u00b2\u07bb\t\u00b2\u0001\u00b3\u0001\u00b3"+
		"\u0001\u00b4\u0003\u00b4\u07c0\b\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4"+
		"\u0003\u00b4\u07c5\b\u00b4\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b6"+
		"\u0001\u00b6\u0001\u00b7\u0001\u00b7\u0001\u00b7\u0003\u00b7\u07cf\b\u00b7"+
		"\u0001\u00b8\u0001\u00b8\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0001\u00b9"+
		"\u0001\u00ba\u0004\u00ba\u07d8\b\u00ba\u000b\u00ba\f\u00ba\u07d9\u0001"+
		"\u00bb\u0005\u00bb\u07dd\b\u00bb\n\u00bb\f\u00bb\u07e0\t\u00bb\u0001\u00bc"+
		"\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc"+
		"\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc"+
		"\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0003\u00bc\u07f3\b\u00bc"+
		"\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd"+
		"\u0003\u00bd\u07fb\b\u00bd\u0001\u00be\u0003\u00be\u07fe\b\u00be\u0001"+
		"\u00be\u0001\u00be\u0003\u00be\u0802\b\u00be\u0001\u00bf\u0001\u00bf\u0001"+
		"\u00bf\u0005\u00bf\u0807\b\u00bf\n\u00bf\f\u00bf\u080a\t\u00bf\u0001\u00c0"+
		"\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0003\u00c0\u0811\b\u00c0"+
		"\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c2\u0001\u00c2\u0001\u00c2"+
		"\u0001\u00c2\u0001\u00c2\u0003\u00c2\u081b\b\u00c2\u0001\u00c3\u0001\u00c3"+
		"\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0003\u00c3\u0822\b\u00c3\u0001\u00c3"+
		"\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0003\u00c3\u0828\b\u00c3\u0001\u00c3"+
		"\u0001\u00c3\u0001\u00c3\u0003\u00c3\u082d\b\u00c3\u0001\u00c4\u0004\u00c4"+
		"\u0830\b\u00c4\u000b\u00c4\f\u00c4\u0831\u0001\u00c5\u0001\u00c5\u0003"+
		"\u00c5\u0836\b\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c6\u0001"+
		"\u00c6\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0001"+
		"\u00c6\u0001\u00c6\u0001\u00c6\u0003\u00c6\u0845\b\u00c6\u0001\u00c7\u0001"+
		"\u00c7\u0003\u00c7\u0849\b\u00c7\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001"+
		"\u00c7\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001"+
		"\u00c7\u0003\u00c7\u0855\b\u00c7\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001"+
		"\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0003\u00c8\u085f"+
		"\b\u00c8\u0001\u00c9\u0001\u00c9\u0003\u00c9\u0863\b\u00c9\u0001\u00c9"+
		"\u0001\u00c9\u0001\u00ca\u0001\u00ca\u0003\u00ca\u0869\b\u00ca\u0001\u00ca"+
		"\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0003\u00ca\u086f\b\u00ca\u0001\u00cb"+
		"\u0001\u00cb\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc"+
		"\u0001\u00cc\u0001\u00cc\u0003\u00cc\u087a\b\u00cc\u0001\u00cd\u0001\u00cd"+
		"\u0003\u00cd\u087e\b\u00cd\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0001\u00cd"+
		"\u0003\u00cd\u0884\b\u00cd\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce"+
		"\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf"+
		"\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf"+
		"\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf"+
		"\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf"+
		"\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf"+
		"\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0003\u00cf\u08ab\b\u00cf\u0001\u00d0"+
		"\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0"+
		"\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0"+
		"\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0"+
		"\u0003\u00d0\u08c0\b\u00d0\u0001\u00d1\u0001\u00d1\u0001\u00d1\u0003\u00d1"+
		"\u08c5\b\u00d1\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d3"+
		"\u0001\u00d3\u0001\u00d3\u0001\u00d3\u0001\u00d3\u0001\u00d4\u0001\u00d4"+
		"\u0001\u00d4\u0001\u00d4\u0001\u00d5\u0001\u00d5\u0003\u00d5\u08d6\b\u00d5"+
		"\u0001\u00d5\u0003\u00d5\u08d9\b\u00d5\u0001\u00d5\u0001\u00d5\u0001\u00d6"+
		"\u0003\u00d6\u08de\b\u00d6\u0001\u00d6\u0001\u00d6\u0003\u00d6\u08e2\b"+
		"\u00d6\u0001\u00d6\u0003\u00d6\u08e5\b\u00d6\u0001\u00d6\u0001\u00d6\u0001"+
		"\u00d6\u0001\u00d6\u0001\u00d6\u0003\u00d6\u08ec\b\u00d6\u0001\u00d7\u0001"+
		"\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0003"+
		"\u00d7\u08f5\b\u00d7\u0001\u00d8\u0001\u00d8\u0001\u00d8\u0005\u00d8\u08fa"+
		"\b\u00d8\n\u00d8\f\u00d8\u08fd\t\u00d8\u0001\u00d9\u0001\u00d9\u0001\u00d9"+
		"\u0005\u00d9\u0902\b\u00d9\n\u00d9\f\u00d9\u0905\t\u00d9\u0001\u00da\u0001"+
		"\u00da\u0003\u00da\u0909\b\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001"+
		"\u00da\u0003\u00da\u090f\b\u00da\u0001\u00db\u0001\u00db\u0001\u00dc\u0001"+
		"\u00dc\u0001\u00dc\u0001\u00dc\u0001\u00dd\u0001\u00dd\u0001\u00dd\u0005"+
		"\u00dd\u091a\b\u00dd\n\u00dd\f\u00dd\u091d\t\u00dd\u0001\u00de\u0003\u00de"+
		"\u0920\b\u00de\u0001\u00de\u0001\u00de\u0001\u00df\u0001\u00df\u0001\u00e0"+
		"\u0001\u00e0\u0001\u00e0\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1"+
		"\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2"+
		"\u0004\u00e2\u0933\b\u00e2\u000b\u00e2\f\u00e2\u0934\u0001\u00e2\u0001"+
		"\u00e2\u0003\u00e2\u0939\b\u00e2\u0001\u00e3\u0001\u00e3\u0001\u00e3\u0001"+
		"\u00e3\u0001\u00e3\u0003\u00e3\u0940\b\u00e3\u0001\u00e4\u0001\u00e4\u0001"+
		"\u00e5\u0001\u00e5\u0001\u00e5\u0001\u00e5\u0001\u00e5\u0001\u00e5\u0001"+
		"\u00e5\u0001\u00e5\u0001\u00e5\u0001\u00e5\u0001\u00e5\u0001\u00e5\u0001"+
		"\u00e5\u0001\u00e5\u0001\u00e5\u0001\u00e5\u0001\u00e5\u0003\u00e5\u0955"+
		"\b\u00e5\u0001\u00e6\u0001\u00e6\u0001\u00e6\u0001\u00e6\u0001\u00e6\u0001"+
		"\u00e7\u0001\u00e7\u0001\u00e7\u0003\u00e7\u095f\b\u00e7\u0001\u00e7\u0001"+
		"\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0003\u00e7\u0967"+
		"\b\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001"+
		"\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001"+
		"\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001"+
		"\u00e7\u0003\u00e7\u097b\b\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001"+
		"\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001"+
		"\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001"+
		"\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0001\u00e7\u0005\u00e7\u0991"+
		"\b\u00e7\n\u00e7\f\u00e7\u0994\t\u00e7\u0001\u00e8\u0001\u00e8\u0001\u00e8"+
		"\u0001\u00e8\u0001\u00e8\u0001\u00e8\u0003\u00e8\u099c\b\u00e8\u0001\u00e9"+
		"\u0001\u00e9\u0001\u00e9\u0005\u00e9\u09a1\b\u00e9\n\u00e9\f\u00e9\u09a4"+
		"\t\u00e9\u0001\u00ea\u0001\u00ea\u0001\u00ea\u0001\u00ea\u0001\u00ea\u0001"+
		"\u00ea\u0001\u00ea\u0001\u00ea\u0001\u00ea\u0001\u00ea\u0003\u00ea\u09b0"+
		"\b\u00ea\u0001\u00eb\u0001\u00eb\u0001\u00ec\u0001\u00ec\u0005\u00ec\u09b6"+
		"\b\u00ec\n\u00ec\f\u00ec\u09b9\t\u00ec\u0001\u00ed\u0001\u00ed\u0001\u00ed"+
		"\u0001\u00ee\u0001\u00ee\u0001\u00ee\u0001\u00ee\u0001\u00ee\u0001\u00ee"+
		"\u0001\u00ee\u0001\u00ef\u0001\u00ef\u0001\u00ef\u0001\u00ef\u0001\u00ef"+
		"\u0001\u00ef\u0001\u00ef\u0001\u00ef\u0001\u00ef\u0003\u00ef\u09ce\b\u00ef"+
		"\u0001\u00ef\u0001\u00ef\u0001\u00ef\u0001\u00ef\u0001\u00ef\u0001\u00ef"+
		"\u0001\u00ef\u0001\u00ef\u0001\u00ef\u0001\u00ef\u0005\u00ef\u09da\b\u00ef"+
		"\n\u00ef\f\u00ef\u09dd\t\u00ef\u0001\u00f0\u0001\u00f0\u0003\u00f0\u09e1"+
		"\b\u00f0\u0001\u00f0\u0003\u00f0\u09e4\b\u00f0\u0001\u00f0\u0001\u00f0"+
		"\u0001\u00f1\u0001\u00f1\u0003\u00f1\u09ea\b\u00f1\u0001\u00f1\u0001\u00f1"+
		"\u0003\u00f1\u09ee\b\u00f1\u0001\u00f2\u0001\u00f2\u0001\u00f3\u0001\u00f3"+
		"\u0003\u00f3\u09f4\b\u00f3\u0001\u00f3\u0001\u00f3\u0001\u00f4\u0001\u00f4"+
		"\u0001\u00f4\u0001\u00f4\u0001\u00f4\u0003\u00f4\u09fd\b\u00f4\u0001\u00f5"+
		"\u0001\u00f5\u0001\u00f5\u0001\u00f5\u0003\u00f5\u0a03\b\u00f5\u0001\u00f6"+
		"\u0001\u00f6\u0001\u00f7\u0003\u00f7\u0a08\b\u00f7\u0001\u00f7\u0001\u00f7"+
		"\u0003\u00f7\u0a0c\b\u00f7\u0001\u00f7\u0001\u00f7\u0001\u00f7\u0001\u00f7"+
		"\u0003\u00f7\u0a12\b\u00f7\u0001\u00f7\u0001\u00f7\u0001\u00f7\u0001\u00f7"+
		"\u0001\u00f7\u0003\u00f7\u0a19\b\u00f7\u0001\u00f8\u0001\u00f8\u0001\u00f8"+
		"\u0001\u00f8\u0001\u00f8\u0003\u00f8\u0a20\b\u00f8\u0001\u00f8\u0001\u00f8"+
		"\u0003\u00f8\u0a24\b\u00f8\u0001\u00f9\u0001\u00f9\u0001\u00f9\u0001\u00f9"+
		"\u0001\u00f9\u0003\u00f9\u0a2b\b\u00f9\u0001\u00fa\u0003\u00fa\u0a2e\b"+
		"\u00fa\u0001\u00fa\u0003\u00fa\u0a31\b\u00fa\u0001\u00fa\u0001\u00fa\u0001"+
		"\u00fa\u0001\u00fa\u0003\u00fa\u0a37\b\u00fa\u0001\u00fb\u0001\u00fb\u0001"+
		"\u00fc\u0001\u00fc\u0001\u00fc\u0001\u00fc\u0001\u00fd\u0001\u00fd\u0001"+
		"\u00fd\u0001\u00fd\u0001\u00fd\u0001\u00fd\u0001\u00fe\u0001\u00fe\u0001"+
		"\u00fe\u0004\u00fe\u0a48\b\u00fe\u000b\u00fe\f\u00fe\u0a49\u0001\u00ff"+
		"\u0001\u00ff\u0001\u0100\u0001\u0100\u0001\u0100\u0001\u0100\u0001\u0100"+
		"\u0001\u0100\u0001\u0100\u0001\u0100\u0001\u0100\u0003\u0100\u0a57\b\u0100"+
		"\u0001\u0101\u0001\u0101\u0001\u0101\u0001\u0101\u0001\u0101\u0003\u0101"+
		"\u0a5e\b\u0101\u0001\u0102\u0001\u0102\u0001\u0103\u0001\u0103\u0003\u0103"+
		"\u0a64\b\u0103\u0001\u0104\u0001\u0104\u0003\u0104\u0a68\b\u0104\u0001"+
		"\u0105\u0001\u0105\u0001\u0106\u0001\u0106\u0001\u0107\u0001\u0107\u0001"+
		"\u0107\u0001\u0108\u0001\u0108\u0001\u0108\u0001\u0109\u0001\u0109\u0001"+
		"\u0109\u0001\u0109\u0001\u010a\u0001\u010a\u0001\u010a\u0001\u010a\u0001"+
		"\u010b\u0001\u010b\u0001\u010b\u0001\u010b\u0001\u010c\u0001\u010c\u0001"+
		"\u010c\u0001\u010c\u0001\u010d\u0001\u010d\u0001\u010d\u0001\u010d\u0001"+
		"\u010d\u0001\u010e\u0001\u010e\u0001\u010e\u0001\u010e\u0001\u010f\u0001"+
		"\u010f\u0001\u010f\u0001\u0110\u0001\u0110\u0001\u0110\u0001\u0111\u0001"+
		"\u0111\u0001\u0111\u0001\u0112\u0001\u0112\u0001\u0112\u0005\u0112\u0a99"+
		"\b\u0112\n\u0112\f\u0112\u0a9c\t\u0112\u0001\u0112\u0001\u0112\u0001\u0112"+
		"\u0005\u0112\u0aa1\b\u0112\n\u0112\f\u0112\u0aa4\t\u0112\u0003\u0112\u0aa6"+
		"\b\u0112\u0001\u0113\u0001\u0113\u0003\u0113\u0aaa\b\u0113\u0001\u0114"+
		"\u0001\u0114\u0003\u0114\u0aae\b\u0114\u0001\u0115\u0001\u0115\u0001\u0116"+
		"\u0001\u0116\u0003\u0116\u0ab4\b\u0116\u0001\u0117\u0001\u0117\u0001\u0117"+
		"\u0001\u0117\u0003\u0117\u0aba\b\u0117\u0001\u0118\u0003\u0118\u0abd\b"+
		"\u0118\u0001\u0118\u0001\u0118\u0003\u0118\u0ac1\b\u0118\u0001\u0118\u0003"+
		"\u0118\u0ac4\b\u0118\u0001\u0119\u0001\u0119\u0001\u011a\u0001\u011a\u0001"+
		"\u011b\u0001\u011b\u0001\u011c\u0001\u011c\u0001\u011c\u0000\u0004b\u015a"+
		"\u01ce\u01de\u011d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152"+
		"\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a"+
		"\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182"+
		"\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a"+
		"\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2"+
		"\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca"+
		"\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2"+
		"\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa"+
		"\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\u020a\u020c\u020e\u0210\u0212"+
		"\u0214\u0216\u0218\u021a\u021c\u021e\u0220\u0222\u0224\u0226\u0228\u022a"+
		"\u022c\u022e\u0230\u0232\u0234\u0236\u0238\u0000\f\u0002\u0000\u0082\u0082"+
		"\u009a\u009a\u0002\u0000\u0006\u0006\"\'\u0001\u0000>@\u0001\u0000QR\u0005"+
		"\u0000UV\u0084\u0084\u008b\u008d\u0092\u0093\u0096\u0096\u0003\u0000H"+
		"HKKhi\r\u0000\u001a\u001c\u001e\u001f(+./5578:FHKPR^accnqt~\u000b\u0000"+
		"\u0001\u0004\u0007\u0015\u001a\u001c\u001e\u001f!TWW^accegnrt\u0081\u0003"+
		"\u0000\u008e\u008f\u0091\u0092\u0094\u009d\u0002\u0000\u007f\u007f\u0081"+
		"\u0081\u0001\u0000\u00a1\u00a5\u0001\u0000\u00a7\u00a8\u0b7d\u0000\u023b"+
		"\u0001\u0000\u0000\u0000\u0002\u0263\u0001\u0000\u0000\u0000\u0004\u0265"+
		"\u0001\u0000\u0000\u0000\u0006\u0267\u0001\u0000\u0000\u0000\b\u0271\u0001"+
		"\u0000\u0000\u0000\n\u028f\u0001\u0000\u0000\u0000\f\u0293\u0001\u0000"+
		"\u0000\u0000\u000e\u0295\u0001\u0000\u0000\u0000\u0010\u02a1\u0001\u0000"+
		"\u0000\u0000\u0012\u02a5\u0001\u0000\u0000\u0000\u0014\u02b1\u0001\u0000"+
		"\u0000\u0000\u0016\u02b3\u0001\u0000\u0000\u0000\u0018\u02c1\u0001\u0000"+
		"\u0000\u0000\u001a\u02c3\u0001\u0000\u0000\u0000\u001c\u02cb\u0001\u0000"+
		"\u0000\u0000\u001e\u02cd\u0001\u0000\u0000\u0000 \u02d7\u0001\u0000\u0000"+
		"\u0000\"\u02d9\u0001\u0000\u0000\u0000$\u02de\u0001\u0000\u0000\u0000"+
		"&\u02e6\u0001\u0000\u0000\u0000(\u02f0\u0001\u0000\u0000\u0000*\u02f2"+
		"\u0001\u0000\u0000\u0000,\u0301\u0001\u0000\u0000\u0000.\u0303\u0001\u0000"+
		"\u0000\u00000\u0306\u0001\u0000\u0000\u00002\u0309\u0001\u0000\u0000\u0000"+
		"4\u0317\u0001\u0000\u0000\u00006\u0319\u0001\u0000\u0000\u00008\u031c"+
		"\u0001\u0000\u0000\u0000:\u0323\u0001\u0000\u0000\u0000<\u0325\u0001\u0000"+
		"\u0000\u0000>\u0329\u0001\u0000\u0000\u0000@\u032d\u0001\u0000\u0000\u0000"+
		"B\u032f\u0001\u0000\u0000\u0000D\u0333\u0001\u0000\u0000\u0000F\u0336"+
		"\u0001\u0000\u0000\u0000H\u0339\u0001\u0000\u0000\u0000J\u033e\u0001\u0000"+
		"\u0000\u0000L\u0342\u0001\u0000\u0000\u0000N\u034d\u0001\u0000\u0000\u0000"+
		"P\u034f\u0001\u0000\u0000\u0000R\u0358\u0001\u0000\u0000\u0000T\u035e"+
		"\u0001\u0000\u0000\u0000V\u0362\u0001\u0000\u0000\u0000X\u0367\u0001\u0000"+
		"\u0000\u0000Z\u036b\u0001\u0000\u0000\u0000\\\u036d\u0001\u0000\u0000"+
		"\u0000^\u036f\u0001\u0000\u0000\u0000`\u0371\u0001\u0000\u0000\u0000b"+
		"\u037d\u0001\u0000\u0000\u0000d\u039c\u0001\u0000\u0000\u0000f\u039e\u0001"+
		"\u0000\u0000\u0000h\u03a2\u0001\u0000\u0000\u0000j\u03a4\u0001\u0000\u0000"+
		"\u0000l\u03b4\u0001\u0000\u0000\u0000n\u03b6\u0001\u0000\u0000\u0000p"+
		"\u03b8\u0001\u0000\u0000\u0000r\u03ba\u0001\u0000\u0000\u0000t\u03bf\u0001"+
		"\u0000\u0000\u0000v\u03c7\u0001\u0000\u0000\u0000x\u03c9\u0001\u0000\u0000"+
		"\u0000z\u03cd\u0001\u0000\u0000\u0000|\u03de\u0001\u0000\u0000\u0000~"+
		"\u03e0\u0001\u0000\u0000\u0000\u0080\u03e3\u0001\u0000\u0000\u0000\u0082"+
		"\u03ed\u0001\u0000\u0000\u0000\u0084\u03f7\u0001\u0000\u0000\u0000\u0086"+
		"\u03f9\u0001\u0000\u0000\u0000\u0088\u03fd\u0001\u0000\u0000\u0000\u008a"+
		"\u0401\u0001\u0000\u0000\u0000\u008c\u0409\u0001\u0000\u0000\u0000\u008e"+
		"\u041b\u0001\u0000\u0000\u0000\u0090\u041e\u0001\u0000\u0000\u0000\u0092"+
		"\u0423\u0001\u0000\u0000\u0000\u0094\u0425\u0001\u0000\u0000\u0000\u0096"+
		"\u042c\u0001\u0000\u0000\u0000\u0098\u0434\u0001\u0000\u0000\u0000\u009a"+
		"\u0436\u0001\u0000\u0000\u0000\u009c\u0440\u0001\u0000\u0000\u0000\u009e"+
		"\u0443\u0001\u0000\u0000\u0000\u00a0\u044b\u0001\u0000\u0000\u0000\u00a2"+
		"\u0453\u0001\u0000\u0000\u0000\u00a4\u0457\u0001\u0000\u0000\u0000\u00a6"+
		"\u047d\u0001\u0000\u0000\u0000\u00a8\u0480\u0001\u0000\u0000\u0000\u00aa"+
		"\u0487\u0001\u0000\u0000\u0000\u00ac\u0495\u0001\u0000\u0000\u0000\u00ae"+
		"\u0498\u0001\u0000\u0000\u0000\u00b0\u04a1\u0001\u0000\u0000\u0000\u00b2"+
		"\u04ac\u0001\u0000\u0000\u0000\u00b4\u04bc\u0001\u0000\u0000\u0000\u00b6"+
		"\u04bf\u0001\u0000\u0000\u0000\u00b8\u04c7\u0001\u0000\u0000\u0000\u00ba"+
		"\u04da\u0001\u0000\u0000\u0000\u00bc\u04dd\u0001\u0000\u0000\u0000\u00be"+
		"\u04e6\u0001\u0000\u0000\u0000\u00c0\u04ef\u0001\u0000\u0000\u0000\u00c2"+
		"\u04fb\u0001\u0000\u0000\u0000\u00c4\u04fd\u0001\u0000\u0000\u0000\u00c6"+
		"\u0500\u0001\u0000\u0000\u0000\u00c8\u050d\u0001\u0000\u0000\u0000\u00ca"+
		"\u0516\u0001\u0000\u0000\u0000\u00cc\u0524\u0001\u0000\u0000\u0000\u00ce"+
		"\u0526\u0001\u0000\u0000\u0000\u00d0\u052c\u0001\u0000\u0000\u0000\u00d2"+
		"\u0534\u0001\u0000\u0000\u0000\u00d4\u0536\u0001\u0000\u0000\u0000\u00d6"+
		"\u0553\u0001\u0000\u0000\u0000\u00d8\u0555\u0001\u0000\u0000\u0000\u00da"+
		"\u0557\u0001\u0000\u0000\u0000\u00dc\u0559\u0001\u0000\u0000\u0000\u00de"+
		"\u056a\u0001\u0000\u0000\u0000\u00e0\u056d\u0001\u0000\u0000\u0000\u00e2"+
		"\u0580\u0001\u0000\u0000\u0000\u00e4\u0587\u0001\u0000\u0000\u0000\u00e6"+
		"\u058a\u0001\u0000\u0000\u0000\u00e8\u0597\u0001\u0000\u0000\u0000\u00ea"+
		"\u0599\u0001\u0000\u0000\u0000\u00ec\u059d\u0001\u0000\u0000\u0000\u00ee"+
		"\u059f\u0001\u0000\u0000\u0000\u00f0\u05a1\u0001\u0000\u0000\u0000\u00f2"+
		"\u05ae\u0001\u0000\u0000\u0000\u00f4\u05b5\u0001\u0000\u0000\u0000\u00f6"+
		"\u05b8\u0001\u0000\u0000\u0000\u00f8\u05c2\u0001\u0000\u0000\u0000\u00fa"+
		"\u05c4\u0001\u0000\u0000\u0000\u00fc\u05c8\u0001\u0000\u0000\u0000\u00fe"+
		"\u05ce\u0001\u0000\u0000\u0000\u0100\u05d1\u0001\u0000\u0000\u0000\u0102"+
		"\u05e3\u0001\u0000\u0000\u0000\u0104\u05e5\u0001\u0000\u0000\u0000\u0106"+
		"\u05f0\u0001\u0000\u0000\u0000\u0108\u061f\u0001\u0000\u0000\u0000\u010a"+
		"\u0621\u0001\u0000\u0000\u0000\u010c\u0623\u0001\u0000\u0000\u0000\u010e"+
		"\u062e\u0001\u0000\u0000\u0000\u0110\u0631\u0001\u0000\u0000\u0000\u0112"+
		"\u063d\u0001\u0000\u0000\u0000\u0114\u063f\u0001\u0000\u0000\u0000\u0116"+
		"\u064a\u0001\u0000\u0000\u0000\u0118\u0652\u0001\u0000\u0000\u0000\u011a"+
		"\u0654\u0001\u0000\u0000\u0000\u011c\u0659\u0001\u0000\u0000\u0000\u011e"+
		"\u0676\u0001\u0000\u0000\u0000\u0120\u0678\u0001\u0000\u0000\u0000\u0122"+
		"\u067d\u0001\u0000\u0000\u0000\u0124\u06a2\u0001\u0000\u0000\u0000\u0126"+
		"\u06bb\u0001\u0000\u0000\u0000\u0128\u06bd\u0001\u0000\u0000\u0000\u012a"+
		"\u06c0\u0001\u0000\u0000\u0000\u012c\u06dd\u0001\u0000\u0000\u0000\u012e"+
		"\u06df\u0001\u0000\u0000\u0000\u0130\u06ea\u0001\u0000\u0000\u0000\u0132"+
		"\u06f8\u0001\u0000\u0000\u0000\u0134\u06fb\u0001\u0000\u0000\u0000\u0136"+
		"\u0703\u0001\u0000\u0000\u0000\u0138\u070c\u0001\u0000\u0000\u0000\u013a"+
		"\u070e\u0001\u0000\u0000\u0000\u013c\u0712\u0001\u0000\u0000\u0000\u013e"+
		"\u0716\u0001\u0000\u0000\u0000\u0140\u071c\u0001\u0000\u0000\u0000\u0142"+
		"\u071f\u0001\u0000\u0000\u0000\u0144\u072d\u0001\u0000\u0000\u0000\u0146"+
		"\u0735\u0001\u0000\u0000\u0000\u0148\u0737\u0001\u0000\u0000\u0000\u014a"+
		"\u073b\u0001\u0000\u0000\u0000\u014c\u073f\u0001\u0000\u0000\u0000\u014e"+
		"\u0741\u0001\u0000\u0000\u0000\u0150\u0749\u0001\u0000\u0000\u0000\u0152"+
		"\u0763\u0001\u0000\u0000\u0000\u0154\u0766\u0001\u0000\u0000\u0000\u0156"+
		"\u0783\u0001\u0000\u0000\u0000\u0158\u0785\u0001\u0000\u0000\u0000\u015a"+
		"\u079a\u0001\u0000\u0000\u0000\u015c\u07a4\u0001\u0000\u0000\u0000\u015e"+
		"\u07a6\u0001\u0000\u0000\u0000\u0160\u07ac\u0001\u0000\u0000\u0000\u0162"+
		"\u07ae\u0001\u0000\u0000\u0000\u0164\u07b4\u0001\u0000\u0000\u0000\u0166"+
		"\u07bc\u0001\u0000\u0000\u0000\u0168\u07bf\u0001\u0000\u0000\u0000\u016a"+
		"\u07c6\u0001\u0000\u0000\u0000\u016c\u07c9\u0001\u0000\u0000\u0000\u016e"+
		"\u07cb\u0001\u0000\u0000\u0000\u0170\u07d0\u0001\u0000\u0000\u0000\u0172"+
		"\u07d2\u0001\u0000\u0000\u0000\u0174\u07d7\u0001\u0000\u0000\u0000\u0176"+
		"\u07de\u0001\u0000\u0000\u0000\u0178\u07f2\u0001\u0000\u0000\u0000\u017a"+
		"\u07fa\u0001\u0000\u0000\u0000\u017c\u07fd\u0001\u0000\u0000\u0000\u017e"+
		"\u0803\u0001\u0000\u0000\u0000\u0180\u0810\u0001\u0000\u0000\u0000\u0182"+
		"\u0812\u0001\u0000\u0000\u0000\u0184\u081a\u0001\u0000\u0000\u0000\u0186"+
		"\u082c\u0001\u0000\u0000\u0000\u0188\u082f\u0001\u0000\u0000\u0000\u018a"+
		"\u0833\u0001\u0000\u0000\u0000\u018c\u0844\u0001\u0000\u0000\u0000\u018e"+
		"\u0854\u0001\u0000\u0000\u0000\u0190\u085e\u0001\u0000\u0000\u0000\u0192"+
		"\u0860\u0001\u0000\u0000\u0000\u0194\u086e\u0001\u0000\u0000\u0000\u0196"+
		"\u0870\u0001\u0000\u0000\u0000\u0198\u0879\u0001\u0000\u0000\u0000\u019a"+
		"\u0883\u0001\u0000\u0000\u0000\u019c\u0885\u0001\u0000\u0000\u0000\u019e"+
		"\u08aa\u0001\u0000\u0000\u0000\u01a0\u08bf\u0001\u0000\u0000\u0000\u01a2"+
		"\u08c4\u0001\u0000\u0000\u0000\u01a4\u08c6\u0001\u0000\u0000\u0000\u01a6"+
		"\u08ca\u0001\u0000\u0000\u0000\u01a8\u08cf\u0001\u0000\u0000\u0000\u01aa"+
		"\u08d3\u0001\u0000\u0000\u0000\u01ac\u08eb\u0001\u0000\u0000\u0000\u01ae"+
		"\u08f4\u0001\u0000\u0000\u0000\u01b0\u08f6\u0001\u0000\u0000\u0000\u01b2"+
		"\u08fe\u0001\u0000\u0000\u0000\u01b4\u090e\u0001\u0000\u0000\u0000\u01b6"+
		"\u0910\u0001\u0000\u0000\u0000\u01b8\u0912\u0001\u0000\u0000\u0000\u01ba"+
		"\u0916\u0001\u0000\u0000\u0000\u01bc\u091f\u0001\u0000\u0000\u0000\u01be"+
		"\u0923\u0001\u0000\u0000\u0000\u01c0\u0925\u0001\u0000\u0000\u0000\u01c2"+
		"\u0928\u0001\u0000\u0000\u0000\u01c4\u0938\u0001\u0000\u0000\u0000\u01c6"+
		"\u093f\u0001\u0000\u0000\u0000\u01c8\u0941\u0001\u0000\u0000\u0000\u01ca"+
		"\u0954\u0001\u0000\u0000\u0000\u01cc\u0956\u0001\u0000\u0000\u0000\u01ce"+
		"\u095e\u0001\u0000\u0000\u0000\u01d0\u099b\u0001\u0000\u0000\u0000\u01d2"+
		"\u099d\u0001\u0000\u0000\u0000\u01d4\u09af\u0001\u0000\u0000\u0000\u01d6"+
		"\u09b1\u0001\u0000\u0000\u0000\u01d8\u09b3\u0001\u0000\u0000\u0000\u01da"+
		"\u09ba\u0001\u0000\u0000\u0000\u01dc\u09bd\u0001\u0000\u0000\u0000\u01de"+
		"\u09cd\u0001\u0000\u0000\u0000\u01e0\u09de\u0001\u0000\u0000\u0000\u01e2"+
		"\u09e7\u0001\u0000\u0000\u0000\u01e4\u09ef\u0001\u0000\u0000\u0000\u01e6"+
		"\u09f1\u0001\u0000\u0000\u0000\u01e8\u09fc\u0001\u0000\u0000\u0000\u01ea"+
		"\u0a02\u0001\u0000\u0000\u0000\u01ec\u0a04\u0001\u0000\u0000\u0000\u01ee"+
		"\u0a18\u0001\u0000\u0000\u0000\u01f0\u0a23\u0001\u0000\u0000\u0000\u01f2"+
		"\u0a2a\u0001\u0000\u0000\u0000\u01f4\u0a36\u0001\u0000\u0000\u0000\u01f6"+
		"\u0a38\u0001\u0000\u0000\u0000\u01f8\u0a3a\u0001\u0000\u0000\u0000\u01fa"+
		"\u0a3e\u0001\u0000\u0000\u0000\u01fc\u0a44\u0001\u0000\u0000\u0000\u01fe"+
		"\u0a4b\u0001\u0000\u0000\u0000\u0200\u0a56\u0001\u0000\u0000\u0000\u0202"+
		"\u0a5d\u0001\u0000\u0000\u0000\u0204\u0a5f\u0001\u0000\u0000\u0000\u0206"+
		"\u0a63\u0001\u0000\u0000\u0000\u0208\u0a67\u0001\u0000\u0000\u0000\u020a"+
		"\u0a69\u0001\u0000\u0000\u0000\u020c\u0a6b\u0001\u0000\u0000\u0000\u020e"+
		"\u0a6d\u0001\u0000\u0000\u0000\u0210\u0a70\u0001\u0000\u0000\u0000\u0212"+
		"\u0a73\u0001\u0000\u0000\u0000\u0214\u0a77\u0001\u0000\u0000\u0000\u0216"+
		"\u0a7b\u0001\u0000\u0000\u0000\u0218\u0a7f\u0001\u0000\u0000\u0000\u021a"+
		"\u0a83\u0001\u0000\u0000\u0000\u021c\u0a88\u0001\u0000\u0000\u0000\u021e"+
		"\u0a8c\u0001\u0000\u0000\u0000\u0220\u0a8f\u0001\u0000\u0000\u0000\u0222"+
		"\u0a92\u0001\u0000\u0000\u0000\u0224\u0aa5\u0001\u0000\u0000\u0000\u0226"+
		"\u0aa9\u0001\u0000\u0000\u0000\u0228\u0aad\u0001\u0000\u0000\u0000\u022a"+
		"\u0aaf\u0001\u0000\u0000\u0000\u022c\u0ab3\u0001\u0000\u0000\u0000\u022e"+
		"\u0ab9\u0001\u0000\u0000\u0000\u0230\u0ac3\u0001\u0000\u0000\u0000\u0232"+
		"\u0ac5\u0001\u0000\u0000\u0000\u0234\u0ac7\u0001\u0000\u0000\u0000\u0236"+
		"\u0ac9\u0001\u0000\u0000\u0000\u0238\u0acb\u0001\u0000\u0000\u0000\u023a"+
		"\u023c\u0003\u0004\u0002\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023b"+
		"\u023c\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d"+
		"\u023e\u0005\u0000\u0000\u0001\u023e\u0001\u0001\u0000\u0000\u0000\u023f"+
		"\u0241\u0003\u017c\u00be\u0000\u0240\u0242\u0005\u008d\u0000\u0000\u0241"+
		"\u0240\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242"+
		"\u0264\u0001\u0000\u0000\u0000\u0243\u0245\u0003\u008eG\u0000\u0244\u0246"+
		"\u0005\u008d\u0000\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0245\u0246"+
		"\u0001\u0000\u0000\u0000\u0246\u0264\u0001\u0000\u0000\u0000\u0247\u0249"+
		"\u0003\b\u0004\u0000\u0248\u024a\u0005\u008d\u0000\u0000\u0249\u0248\u0001"+
		"\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u0264\u0001"+
		"\u0000\u0000\u0000\u024b\u024d\u0003\u001c\u000e\u0000\u024c\u024e\u0005"+
		"\u008d\u0000\u0000\u024d\u024c\u0001\u0000\u0000\u0000\u024d\u024e\u0001"+
		"\u0000\u0000\u0000\u024e\u0264\u0001\u0000\u0000\u0000\u024f\u0251\u0003"+
		"4\u001a\u0000\u0250\u0252\u0005\u008d\u0000\u0000\u0251\u0250\u0001\u0000"+
		"\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0264\u0001\u0000"+
		"\u0000\u0000\u0253\u0255\u0003:\u001d\u0000\u0254\u0256\u0005\u008d\u0000"+
		"\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000"+
		"\u0000\u0256\u0264\u0001\u0000\u0000\u0000\u0257\u0259\u0003F#\u0000\u0258"+
		"\u025a\u0005\u008d\u0000\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u0259"+
		"\u025a\u0001\u0000\u0000\u0000\u025a\u0264\u0001\u0000\u0000\u0000\u025b"+
		"\u025d\u0003H$\u0000\u025c\u025e\u0005\u008d\u0000\u0000\u025d\u025c\u0001"+
		"\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u0264\u0001"+
		"\u0000\u0000\u0000\u025f\u0261\u0003N\'\u0000\u0260\u0262\u0005\u008d"+
		"\u0000\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000"+
		"\u0000\u0000\u0262\u0264\u0001\u0000\u0000\u0000\u0263\u023f\u0001\u0000"+
		"\u0000\u0000\u0263\u0243\u0001\u0000\u0000\u0000\u0263\u0247\u0001\u0000"+
		"\u0000\u0000\u0263\u024b\u0001\u0000\u0000\u0000\u0263\u024f\u0001\u0000"+
		"\u0000\u0000\u0263\u0253\u0001\u0000\u0000\u0000\u0263\u0257\u0001\u0000"+
		"\u0000\u0000\u0263\u025b\u0001\u0000\u0000\u0000\u0263\u025f\u0001\u0000"+
		"\u0000\u0000\u0264\u0003\u0001\u0000\u0000\u0000\u0265\u0266\u0003\u0006"+
		"\u0003\u0000\u0266\u0005\u0001\u0000\u0000\u0000\u0267\u0268\u0004\u0003"+
		"\u0000\u0001\u0268\u0269\u0003\u0002\u0001\u0000\u0269\u026b\u0006\u0003"+
		"\uffff\uffff\u0000\u026a\u026c\u0003\u0006\u0003\u0000\u026b\u026a\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u0007\u0001"+
		"\u0000\u0000\u0000\u026d\u0272\u0003\n\u0005\u0000\u026e\u0272\u0003\u000e"+
		"\u0007\u0000\u026f\u0272\u0003\u0010\b\u0000\u0270\u0272\u0003\u001a\r"+
		"\u0000\u0271\u026d\u0001\u0000\u0000\u0000\u0271\u026e\u0001\u0000\u0000"+
		"\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0271\u0270\u0001\u0000\u0000"+
		"\u0000\u0272\t\u0001\u0000\u0000\u0000\u0273\u0275\u0005\u0001\u0000\u0000"+
		"\u0274\u0276\u0003\f\u0006\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0275"+
		"\u0276\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277"+
		"\u0279\u0005\u008d\u0000\u0000\u0278\u027a\u0003\u017c\u00be\u0000\u0279"+
		"\u0278\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a"+
		"\u027b\u0001\u0000\u0000\u0000\u027b\u027d\u0005\u008d\u0000\u0000\u027c"+
		"\u027e\u0003\u017c\u00be\u0000\u027d\u027c\u0001\u0000\u0000\u0000\u027d"+
		"\u027e\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f"+
		"\u0290\u0003\u0094J\u0000\u0280\u0281\u0005\u0001\u0000\u0000\u0281\u0283"+
		"\u0005\u0086\u0000\u0000\u0282\u0284\u0003\f\u0006\u0000\u0283\u0282\u0001"+
		"\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0285\u0001"+
		"\u0000\u0000\u0000\u0285\u0287\u0005\u008d\u0000\u0000\u0286\u0288\u0003"+
		"\u017c\u00be\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0287\u0288\u0001"+
		"\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028b\u0005"+
		"\u008d\u0000\u0000\u028a\u028c\u0003\u017c\u00be\u0000\u028b\u028a\u0001"+
		"\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u028d\u0001"+
		"\u0000\u0000\u0000\u028d\u028e\u0005\u0089\u0000\u0000\u028e\u0290\u0003"+
		"\u0094J\u0000\u028f\u0273\u0001\u0000\u0000\u0000\u028f\u0280\u0001\u0000"+
		"\u0000\u0000\u0290\u000b\u0001\u0000\u0000\u0000\u0291\u0294\u0003\u00a6"+
		"S\u0000\u0292\u0294\u0003\u017e\u00bf\u0000\u0293\u0291\u0001\u0000\u0000"+
		"\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0294\r\u0001\u0000\u0000\u0000"+
		"\u0295\u0297\u0005\u0001\u0000\u0000\u0296\u0298\u0005\u0002\u0000\u0000"+
		"\u0297\u0296\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000"+
		"\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029a\u0003\u015a\u00ad\u0000"+
		"\u029a\u029b\u0005\u0003\u0000\u0000\u029b\u029d\u0003\u017c\u00be\u0000"+
		"\u029c\u029e\u00030\u0018\u0000\u029d\u029c\u0001\u0000\u0000\u0000\u029d"+
		"\u029e\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f"+
		"\u02a0\u0003\u0094J\u0000\u02a0\u000f\u0001\u0000\u0000\u0000\u02a1\u02a2"+
		"\u0005\u0004\u0000\u0000\u02a2\u02a3\u0003\u0012\t\u0000\u02a3\u02a4\u0003"+
		"\u0094J\u0000\u02a4\u0011\u0001\u0000\u0000\u0000\u02a5\u02aa\u0003\u0014"+
		"\n\u0000\u02a6\u02a7\u0005\u008b\u0000\u0000\u02a7\u02a9\u0003\u0014\n"+
		"\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a9\u02ac\u0001\u0000\u0000"+
		"\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000"+
		"\u0000\u02ab\u0013\u0001\u0000\u0000\u0000\u02ac\u02aa\u0001\u0000\u0000"+
		"\u0000\u02ad\u02b2\u0003\u017c\u00be\u0000\u02ae\u02b2\u0003r9\u0000\u02af"+
		"\u02b2\u0003\u0016\u000b\u0000\u02b0\u02b2\u0003\u0018\f\u0000\u02b1\u02ad"+
		"\u0001\u0000\u0000\u0000\u02b1\u02ae\u0001\u0000\u0000\u0000\u02b1\u02af"+
		"\u0001\u0000\u0000\u0000\u02b1\u02b0\u0001\u0000\u0000\u0000\u02b2\u0015"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005\u0002\u0000\u0000\u02b4\u02b5"+
		"\u0003\u015a\u00ad\u0000\u02b5\u02b7\u0003\u00a4R\u0000\u02b6\u02b8\u0003"+
		"0\u0018\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000"+
		"\u0000\u0000\u02b8\u0017\u0001\u0000\u0000\u0000\u02b9\u02ba\u0005\u0005"+
		"\u0000\u0000\u02ba\u02bb\u0003\u015a\u00ad\u0000\u02bb\u02bc\u0003\u00a4"+
		"R\u0000\u02bc\u02c2\u0001\u0000\u0000\u0000\u02bd\u02be\u0005\u0006\u0000"+
		"\u0000\u02be\u02bf\u0003\u015a\u00ad\u0000\u02bf\u02c0\u0003\u00a4R\u0000"+
		"\u02c0\u02c2\u0001\u0000\u0000\u0000\u02c1\u02b9\u0001\u0000\u0000\u0000"+
		"\u02c1\u02bd\u0001\u0000\u0000\u0000\u02c2\u0019\u0001\u0000\u0000\u0000"+
		"\u02c3\u02c4\u0005\u0007\u0000\u0000\u02c4\u02c5\u0003\u0094J\u0000\u02c5"+
		"\u02c6\u0005\u0004\u0000\u0000\u02c6\u02c7\u0003\u017c\u00be\u0000\u02c7"+
		"\u001b\u0001\u0000\u0000\u0000\u02c8\u02cc\u0003\u001e\u000f\u0000\u02c9"+
		"\u02cc\u0003\"\u0011\u0000\u02ca\u02cc\u0003$\u0012\u0000\u02cb\u02c8"+
		"\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000\u0000\u0000\u02cb\u02ca"+
		"\u0001\u0000\u0000\u0000\u02cc\u001d\u0001\u0000\u0000\u0000\u02cd\u02ce"+
		"\u0005\b\u0000\u0000\u02ce\u02cf\u0003\u0012\t\u0000\u02cf\u02d1\u0003"+
		"\u0094J\u0000\u02d0\u02d2\u0003 \u0010\u0000\u02d1\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u001f\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d4\u0005\t\u0000\u0000\u02d4\u02d8\u0003\u0094J\u0000"+
		"\u02d5\u02d6\u0005\t\u0000\u0000\u02d6\u02d8\u0003\u001e\u000f\u0000\u02d7"+
		"\u02d3\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d8"+
		"!\u0001\u0000\u0000\u0000\u02d9\u02da\u0005\n\u0000\u0000\u02da\u02db"+
		"\u0003\u0012\t\u0000\u02db\u02dc\u0005\t\u0000\u0000\u02dc\u02dd\u0003"+
		"\u0094J\u0000\u02dd#\u0001\u0000\u0000\u0000\u02de\u02df\u0005\u000b\u0000"+
		"\u0000\u02df\u02e0\u0003\u017c\u00be\u0000\u02e0\u02e2\u0005\u0085\u0000"+
		"\u0000\u02e1\u02e3\u0003&\u0013\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000"+
		"\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e4\u02e5\u0005\u0088\u0000\u0000\u02e5%\u0001\u0000\u0000\u0000\u02e6"+
		"\u02e8\u0003(\u0014\u0000\u02e7\u02e9\u0003&\u0013\u0000\u02e8\u02e7\u0001"+
		"\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\'\u0001\u0000"+
		"\u0000\u0000\u02ea\u02eb\u0003*\u0015\u0000\u02eb\u02ec\u0003\u0004\u0002"+
		"\u0000\u02ec\u02f1\u0001\u0000\u0000\u0000\u02ed\u02ee\u0003.\u0017\u0000"+
		"\u02ee\u02ef\u0003\u0004\u0002\u0000\u02ef\u02f1\u0001\u0000\u0000\u0000"+
		"\u02f0\u02ea\u0001\u0000\u0000\u0000\u02f0\u02ed\u0001\u0000\u0000\u0000"+
		"\u02f1)\u0001\u0000\u0000\u0000\u02f2\u02f3\u0005\u0002\u0000\u0000\u02f3"+
		"\u02f4\u0003,\u0016\u0000\u02f4\u02f5\u0005\u008c\u0000\u0000\u02f5+\u0001"+
		"\u0000\u0000\u0000\u02f6\u02f8\u0003\u015a\u00ad\u0000\u02f7\u02f9\u0003"+
		"0\u0018\u0000\u02f8\u02f7\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000"+
		"\u0000\u0000\u02f9\u0302\u0001\u0000\u0000\u0000\u02fa\u02fc\u0003\u015a"+
		"\u00ad\u0000\u02fb\u02fd\u00030\u0018\u0000\u02fc\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000"+
		"\u0000\u02fe\u02ff\u0005\u008b\u0000\u0000\u02ff\u0300\u0003,\u0016\u0000"+
		"\u0300\u0302\u0001\u0000\u0000\u0000\u0301\u02f6\u0001\u0000\u0000\u0000"+
		"\u0301\u02fa\u0001\u0000\u0000\u0000\u0302-\u0001\u0000\u0000\u0000\u0303"+
		"\u0304\u0005\f\u0000\u0000\u0304\u0305\u0005\u008c\u0000\u0000\u0305/"+
		"\u0001\u0000\u0000\u0000\u0306\u0307\u0005\r\u0000\u0000\u0307\u0308\u0003"+
		"2\u0019\u0000\u03081\u0001\u0000\u0000\u0000\u0309\u030a\u0003\u017c\u00be"+
		"\u0000\u030a3\u0001\u0000\u0000\u0000\u030b\u030c\u00036\u001b\u0000\u030c"+
		"\u030d\u0003\b\u0004\u0000\u030d\u0318\u0001\u0000\u0000\u0000\u030e\u030f"+
		"\u00036\u001b\u0000\u030f\u0310\u0003\u001e\u000f\u0000\u0310\u0318\u0001"+
		"\u0000\u0000\u0000\u0311\u0312\u00036\u001b\u0000\u0312\u0313\u0003$\u0012"+
		"\u0000\u0313\u0318\u0001\u0000\u0000\u0000\u0314\u0315\u00036\u001b\u0000"+
		"\u0315\u0316\u0003H$\u0000\u0316\u0318\u0001\u0000\u0000\u0000\u0317\u030b"+
		"\u0001\u0000\u0000\u0000\u0317\u030e\u0001\u0000\u0000\u0000\u0317\u0311"+
		"\u0001\u0000\u0000\u0000\u0317\u0314\u0001\u0000\u0000\u0000\u03185\u0001"+
		"\u0000\u0000\u0000\u0319\u031a\u00038\u001c\u0000\u031a\u031b\u0005\u008c"+
		"\u0000\u0000\u031b7\u0001\u0000\u0000\u0000\u031c\u031d\u0003\u0206\u0103"+
		"\u0000\u031d9\u0001\u0000\u0000\u0000\u031e\u0324\u0003<\u001e\u0000\u031f"+
		"\u0324\u0003>\u001f\u0000\u0320\u0324\u0003@ \u0000\u0321\u0324\u0003"+
		"B!\u0000\u0322\u0324\u0003D\"\u0000\u0323\u031e\u0001\u0000\u0000\u0000"+
		"\u0323\u031f\u0001\u0000\u0000\u0000\u0323\u0320\u0001\u0000\u0000\u0000"+
		"\u0323\u0321\u0001\u0000\u0000\u0000\u0323\u0322\u0001\u0000\u0000\u0000"+
		"\u0324;\u0001\u0000\u0000\u0000\u0325\u0327\u0005\u000e\u0000\u0000\u0326"+
		"\u0328\u00038\u001c\u0000\u0327\u0326\u0001\u0000\u0000\u0000\u0327\u0328"+
		"\u0001\u0000\u0000\u0000\u0328=\u0001\u0000\u0000\u0000\u0329\u032b\u0005"+
		"\u000f\u0000\u0000\u032a\u032c\u00038\u001c\u0000\u032b\u032a\u0001\u0000"+
		"\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000\u032c?\u0001\u0000\u0000"+
		"\u0000\u032d\u032e\u0005\u0010\u0000\u0000\u032eA\u0001\u0000\u0000\u0000"+
		"\u032f\u0331\u0005\u0011\u0000\u0000\u0330\u0332\u0003\u017c\u00be\u0000"+
		"\u0331\u0330\u0001\u0000\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000"+
		"\u0332C\u0001\u0000\u0000\u0000\u0333\u0334\u0005\u0012\u0000\u0000\u0334"+
		"\u0335\u0003\u017c\u00be\u0000\u0335E\u0001\u0000\u0000\u0000\u0336\u0337"+
		"\u0005\u0013\u0000\u0000\u0337\u0338\u0003\u0094J\u0000\u0338G\u0001\u0000"+
		"\u0000\u0000\u0339\u033a\u0005\u0014\u0000\u0000\u033a\u033c\u0003\u0094"+
		"J\u0000\u033b\u033d\u0003J%\u0000\u033c\u033b\u0001\u0000\u0000\u0000"+
		"\u033c\u033d\u0001\u0000\u0000\u0000\u033dI\u0001\u0000\u0000\u0000\u033e"+
		"\u0340\u0003L&\u0000\u033f\u0341\u0003J%\u0000\u0340\u033f\u0001\u0000"+
		"\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341K\u0001\u0000\u0000"+
		"\u0000\u0342\u0344\u0005\u0015\u0000\u0000\u0343\u0345\u0003\u015a\u00ad"+
		"\u0000\u0344\u0343\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000"+
		"\u0000\u0345\u0347\u0001\u0000\u0000\u0000\u0346\u0348\u00030\u0018\u0000"+
		"\u0347\u0346\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000\u0000\u0000"+
		"\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u034a\u0003\u0094J\u0000\u034a"+
		"M\u0001\u0000\u0000\u0000\u034b\u034e\u0003P(\u0000\u034c\u034e\u0003"+
		"l6\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034d\u034c\u0001\u0000\u0000"+
		"\u0000\u034eO\u0001\u0000\u0000\u0000\u034f\u0351\u0003R)\u0000\u0350"+
		"\u0352\u0003T*\u0000\u0351\u0350\u0001\u0000\u0000\u0000\u0351\u0352\u0001"+
		"\u0000\u0000\u0000\u0352\u0354\u0001\u0000\u0000\u0000\u0353\u0355\u0003"+
		"X,\u0000\u0354\u0353\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000"+
		"\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356\u0357\u0003`0\u0000\u0357"+
		"Q\u0001\u0000\u0000\u0000\u0358\u0359\u0003Z-\u0000\u0359\u035b\u0003"+
		"b1\u0000\u035a\u035c\u0003\u0004\u0002\u0000\u035b\u035a\u0001\u0000\u0000"+
		"\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035cS\u0001\u0000\u0000\u0000"+
		"\u035d\u035f\u0003V+\u0000\u035e\u035d\u0001\u0000\u0000\u0000\u035f\u0360"+
		"\u0001\u0000\u0000\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0360\u0361"+
		"\u0001\u0000\u0000\u0000\u0361U\u0001\u0000\u0000\u0000\u0362\u0363\u0003"+
		"\\.\u0000\u0363\u0365\u0003b1\u0000\u0364\u0366\u0003\u0004\u0002\u0000"+
		"\u0365\u0364\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000"+
		"\u0366W\u0001\u0000\u0000\u0000\u0367\u0369\u0003^/\u0000\u0368\u036a"+
		"\u0003\u0004\u0002\u0000\u0369\u0368\u0001\u0000\u0000\u0000\u0369\u036a"+
		"\u0001\u0000\u0000\u0000\u036aY\u0001\u0000\u0000\u0000\u036b\u036c\u0005"+
		"\u0016\u0000\u0000\u036c[\u0001\u0000\u0000\u0000\u036d\u036e\u0005\u0017"+
		"\u0000\u0000\u036e]\u0001\u0000\u0000\u0000\u036f\u0370\u0005\u0018\u0000"+
		"\u0000\u0370_\u0001\u0000\u0000\u0000\u0371\u0372\u0005\u0019\u0000\u0000"+
		"\u0372a\u0001\u0000\u0000\u0000\u0373\u0374\u00061\uffff\uffff\u0000\u0374"+
		"\u037e\u0003d2\u0000\u0375\u037e\u0003\u0208\u0104\u0000\u0376\u037e\u0003"+
		"\u0232\u0119\u0000\u0377\u0378\u0005\u0086\u0000\u0000\u0378\u0379\u0003"+
		"b1\u0000\u0379\u037a\u0005\u0089\u0000\u0000\u037a\u037e\u0001\u0000\u0000"+
		"\u0000\u037b\u037c\u0005\u0091\u0000\u0000\u037c\u037e\u0003b1\u0003\u037d"+
		"\u0373\u0001\u0000\u0000\u0000\u037d\u0375\u0001\u0000\u0000\u0000\u037d"+
		"\u0376\u0001\u0000\u0000\u0000\u037d\u0377\u0001\u0000\u0000\u0000\u037d"+
		"\u037b\u0001\u0000\u0000\u0000\u037e\u0389\u0001\u0000\u0000\u0000\u037f"+
		"\u0380\n\u0002\u0000\u0000\u0380\u0381\u0003\u0212\u0109\u0000\u0381\u0382"+
		"\u0003b1\u0003\u0382\u0388\u0001\u0000\u0000\u0000\u0383\u0384\n\u0001"+
		"\u0000\u0000\u0384\u0385\u0003\u0214\u010a\u0000\u0385\u0386\u0003b1\u0002"+
		"\u0386\u0388\u0001\u0000\u0000\u0000\u0387\u037f\u0001\u0000\u0000\u0000"+
		"\u0387\u0383\u0001\u0000\u0000\u0000\u0388\u038b\u0001\u0000\u0000\u0000"+
		"\u0389\u0387\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000\u0000\u0000"+
		"\u038ac\u0001\u0000\u0000\u0000\u038b\u0389\u0001\u0000\u0000\u0000\u038c"+
		"\u038d\u0005\u001a\u0000\u0000\u038d\u038e\u0005\u0086\u0000\u0000\u038e"+
		"\u038f\u0003h4\u0000\u038f\u0390\u0005\u0089\u0000\u0000\u0390\u039d\u0001"+
		"\u0000\u0000\u0000\u0391\u0392\u0005\u001b\u0000\u0000\u0392\u0393\u0005"+
		"\u0086\u0000\u0000\u0393\u0394\u0003j5\u0000\u0394\u0395\u0005\u0089\u0000"+
		"\u0000\u0395\u039d\u0001\u0000\u0000\u0000\u0396\u0397\u0005\u001c\u0000"+
		"\u0000\u0397\u0398\u0005\u0086\u0000\u0000\u0398\u0399\u0003\u0216\u010b"+
		"\u0000\u0399\u039a\u0003f3\u0000\u039a\u039b\u0005\u0089\u0000\u0000\u039b"+
		"\u039d\u0001\u0000\u0000\u0000\u039c\u038c\u0001\u0000\u0000\u0000\u039c"+
		"\u0391\u0001\u0000\u0000\u0000\u039c\u0396\u0001\u0000\u0000\u0000\u039d"+
		"e\u0001\u0000\u0000\u0000\u039e\u039f\u0005\u00a4\u0000\u0000\u039f\u03a0"+
		"\u0005\u0084\u0000\u0000\u03a0\u03a1\u0005\u00a4\u0000\u0000\u03a1g\u0001"+
		"\u0000\u0000\u0000\u03a2\u03a3\u0003\u0206\u0103\u0000\u03a3i\u0001\u0000"+
		"\u0000\u0000\u03a4\u03a5\u0003\u0206\u0103\u0000\u03a5k\u0001\u0000\u0000"+
		"\u0000\u03a6\u03a7\u0005\u001d\u0000\u0000\u03a7\u03a8\u0005\u0086\u0000"+
		"\u0000\u03a8\u03a9\u0005\u001e\u0000\u0000\u03a9\u03aa\u0005\u008c\u0000"+
		"\u0000\u03aa\u03ab\u0003p8\u0000\u03ab\u03ac\u0005\u008b\u0000\u0000\u03ac"+
		"\u03ad\u0005\u001f\u0000\u0000\u03ad\u03ae\u0005\u008c\u0000\u0000\u03ae"+
		"\u03af\u0003n7\u0000\u03af\u03b0\u0005\u0089\u0000\u0000\u03b0\u03b5\u0001"+
		"\u0000\u0000\u0000\u03b1\u03b2\u0005\u001d\u0000\u0000\u03b2\u03b3\u0005"+
		"\u0086\u0000\u0000\u03b3\u03b5\u0005\u0089\u0000\u0000\u03b4\u03a6\u0001"+
		"\u0000\u0000\u0000\u03b4\u03b1\u0001\u0000\u0000\u0000\u03b5m\u0001\u0000"+
		"\u0000\u0000\u03b6\u03b7\u0003\u0236\u011b\u0000\u03b7o\u0001\u0000\u0000"+
		"\u0000\u03b8\u03b9\u0005\u00a7\u0000\u0000\u03b9q\u0001\u0000\u0000\u0000"+
		"\u03ba\u03bb\u0005 \u0000\u0000\u03bb\u03bc\u0005\u0086\u0000\u0000\u03bc"+
		"\u03bd\u0003t:\u0000\u03bd\u03be\u0005\u0089\u0000\u0000\u03bes\u0001"+
		"\u0000\u0000\u0000\u03bf\u03c4\u0003v;\u0000\u03c0\u03c1\u0005\u008b\u0000"+
		"\u0000\u03c1\u03c3\u0003v;\u0000\u03c2\u03c0\u0001\u0000\u0000\u0000\u03c3"+
		"\u03c6\u0001\u0000\u0000\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c4"+
		"\u03c5\u0001\u0000\u0000\u0000\u03c5u\u0001\u0000\u0000\u0000\u03c6\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c7\u03c8\u0007\u0000\u0000\u0000\u03c8w\u0001"+
		"\u0000\u0000\u0000\u03c9\u03ca\u0005\u008e\u0000\u0000\u03ca\u03cb\u0003"+
		"z=\u0000\u03cb\u03cc\u0005\u008f\u0000\u0000\u03ccy\u0001\u0000\u0000"+
		"\u0000\u03cd\u03d2\u0003|>\u0000\u03ce\u03cf\u0005\u008b\u0000\u0000\u03cf"+
		"\u03d1\u0003|>\u0000\u03d0\u03ce\u0001\u0000\u0000\u0000\u03d1\u03d4\u0001"+
		"\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001"+
		"\u0000\u0000\u0000\u03d3{\u0001\u0000\u0000\u0000\u03d4\u03d2\u0001\u0000"+
		"\u0000\u0000\u03d5\u03df\u0003\u01e4\u00f2\u0000\u03d6\u03d7\u0003\u01e4"+
		"\u00f2\u0000\u03d7\u03d8\u0005\u008c\u0000\u0000\u03d8\u03d9\u0003\u01e2"+
		"\u00f1\u0000\u03d9\u03df\u0001\u0000\u0000\u0000\u03da\u03db\u0003\u01e4"+
		"\u00f2\u0000\u03db\u03dc\u0005\u008c\u0000\u0000\u03dc\u03dd\u0003\u01fc"+
		"\u00fe\u0000\u03dd\u03df\u0001\u0000\u0000\u0000\u03de\u03d5\u0001\u0000"+
		"\u0000\u0000\u03de\u03d6\u0001\u0000\u0000\u0000\u03de\u03da\u0001\u0000"+
		"\u0000\u0000\u03df}\u0001\u0000\u0000\u0000\u03e0\u03e1\u0005\r\u0000"+
		"\u0000\u03e1\u03e2\u0003\u0080@\u0000\u03e2\u007f\u0001\u0000\u0000\u0000"+
		"\u03e3\u03e8\u0003\u0082A\u0000\u03e4\u03e5\u0005\u008b\u0000\u0000\u03e5"+
		"\u03e7\u0003\u0082A\u0000\u03e6\u03e4\u0001\u0000\u0000\u0000\u03e7\u03ea"+
		"\u0001\u0000\u0000\u0000\u03e8\u03e6\u0001\u0000\u0000\u0000\u03e8\u03e9"+
		"\u0001\u0000\u0000\u0000\u03e9\u0081\u0001\u0000\u0000\u0000\u03ea\u03e8"+
		"\u0001\u0000\u0000\u0000\u03eb\u03ee\u0003\u0084B\u0000\u03ec\u03ee\u0003"+
		"\u0086C\u0000\u03ed\u03eb\u0001\u0000\u0000\u0000\u03ed\u03ec\u0001\u0000"+
		"\u0000\u0000\u03ee\u0083\u0001\u0000\u0000\u0000\u03ef\u03f0\u0003\u01e2"+
		"\u00f1\u0000\u03f0\u03f1\u0005\u008c\u0000\u0000\u03f1\u03f2\u0003\u01e2"+
		"\u00f1\u0000\u03f2\u03f8\u0001\u0000\u0000\u0000\u03f3\u03f4\u0003\u01e2"+
		"\u00f1\u0000\u03f4\u03f5\u0005\u008c\u0000\u0000\u03f5\u03f6\u0003\u01fc"+
		"\u00fe\u0000\u03f6\u03f8\u0001\u0000\u0000\u0000\u03f7\u03ef\u0001\u0000"+
		"\u0000\u0000\u03f7\u03f3\u0001\u0000\u0000\u0000\u03f8\u0085\u0001\u0000"+
		"\u0000\u0000\u03f9\u03fa\u0003\u01e2\u00f1\u0000\u03fa\u03fb\u0003\u021c"+
		"\u010e\u0000\u03fb\u03fc\u0003\u01de\u00ef\u0000\u03fc\u0087\u0001\u0000"+
		"\u0000\u0000\u03fd\u03fe\u0005\u008e\u0000\u0000\u03fe\u03ff\u0003\u008a"+
		"E\u0000\u03ff\u0400\u0005\u008f\u0000\u0000\u0400\u0089\u0001\u0000\u0000"+
		"\u0000\u0401\u0406\u0003\u008cF\u0000\u0402\u0403\u0005\u008b\u0000\u0000"+
		"\u0403\u0405\u0003\u008cF\u0000\u0404\u0402\u0001\u0000\u0000\u0000\u0405"+
		"\u0408\u0001\u0000\u0000\u0000\u0406\u0404\u0001\u0000\u0000\u0000\u0406"+
		"\u0407\u0001\u0000\u0000\u0000\u0407\u008b\u0001\u0000\u0000\u0000\u0408"+
		"\u0406\u0001\u0000\u0000\u0000\u0409\u040a\u0003\u01de\u00ef\u0000\u040a"+
		"\u008d\u0001\u0000\u0000\u0000\u040b\u041c\u0003\u0096K\u0000\u040c\u041c"+
		"\u0003\u009eO\u0000\u040d\u041c\u0003\u00a6S\u0000\u040e\u041c\u0003\u00c0"+
		"`\u0000\u040f\u041c\u0003\u00c6c\u0000\u0410\u041c\u0003\u00deo\u0000"+
		"\u0411\u041c\u0003\u0100\u0080\u0000\u0412\u041c\u0003\u0108\u0084\u0000"+
		"\u0413\u041c\u0003\u0110\u0088\u0000\u0414\u041c\u0003\u0124\u0092\u0000"+
		"\u0415\u041c\u0003\u012a\u0095\u0000\u0416\u041c\u0003\u012c\u0096\u0000"+
		"\u0417\u041c\u0003\u0132\u0099\u0000\u0418\u041c\u0003\u0138\u009c\u0000"+
		"\u0419\u041c\u0003\u0138\u009c\u0000\u041a\u041c\u0003\u0142\u00a1\u0000"+
		"\u041b\u040b\u0001\u0000\u0000\u0000\u041b\u040c\u0001\u0000\u0000\u0000"+
		"\u041b\u040d\u0001\u0000\u0000\u0000\u041b\u040e\u0001\u0000\u0000\u0000"+
		"\u041b\u040f\u0001\u0000\u0000\u0000\u041b\u0410\u0001\u0000\u0000\u0000"+
		"\u041b\u0411\u0001\u0000\u0000\u0000\u041b\u0412\u0001\u0000\u0000\u0000"+
		"\u041b\u0413\u0001\u0000\u0000\u0000\u041b\u0414\u0001\u0000\u0000\u0000"+
		"\u041b\u0415\u0001\u0000\u0000\u0000\u041b\u0416\u0001\u0000\u0000\u0000"+
		"\u041b\u0417\u0001\u0000\u0000\u0000\u041b\u0418\u0001\u0000\u0000\u0000"+
		"\u041b\u0419\u0001\u0000\u0000\u0000\u041b\u041a\u0001\u0000\u0000\u0000"+
		"\u041c\u008f\u0001\u0000\u0000\u0000\u041d\u041f\u0003\u008eG\u0000\u041e"+
		"\u041d\u0001\u0000\u0000\u0000\u041f\u0420\u0001\u0000\u0000\u0000\u0420"+
		"\u041e\u0001\u0000\u0000\u0000\u0420\u0421\u0001\u0000\u0000\u0000\u0421"+
		"\u0091\u0001\u0000\u0000\u0000\u0422\u0424\u0003\u0004\u0002\u0000\u0423"+
		"\u0422\u0001\u0000\u0000\u0000\u0423\u0424\u0001\u0000\u0000\u0000\u0424"+
		"\u0093\u0001\u0000\u0000\u0000\u0425\u0427\u0005\u0085\u0000\u0000\u0426"+
		"\u0428\u0003\u0004\u0002\u0000\u0427\u0426\u0001\u0000\u0000\u0000\u0427"+
		"\u0428\u0001\u0000\u0000\u0000\u0428\u0429\u0001\u0000\u0000\u0000\u0429"+
		"\u042a\u0005\u0088\u0000\u0000\u042a\u0095\u0001\u0000\u0000\u0000\u042b"+
		"\u042d\u0003\u0174\u00ba\u0000\u042c\u042b\u0001\u0000\u0000\u0000\u042c"+
		"\u042d\u0001\u0000\u0000\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e"+
		"\u0430\u0005!\u0000\u0000\u042f\u0431\u0003\u0098L\u0000\u0430\u042f\u0001"+
		"\u0000\u0000\u0000\u0430\u0431\u0001\u0000\u0000\u0000\u0431\u0432\u0001"+
		"\u0000\u0000\u0000\u0432\u0433\u0003\u009aM\u0000\u0433\u0097\u0001\u0000"+
		"\u0000\u0000\u0434\u0435\u0007\u0001\u0000\u0000\u0435\u0099\u0001\u0000"+
		"\u0000\u0000\u0436\u043b\u0003\u009cN\u0000\u0437\u0438\u0005\u0084\u0000"+
		"\u0000\u0438\u043a\u0003\u009cN\u0000\u0439\u0437\u0001\u0000\u0000\u0000"+
		"\u043a\u043d\u0001\u0000\u0000\u0000\u043b\u0439\u0001\u0000\u0000\u0000"+
		"\u043b\u043c\u0001\u0000\u0000\u0000\u043c\u009b\u0001\u0000\u0000\u0000"+
		"\u043d\u043b\u0001\u0000\u0000\u0000\u043e\u0441\u0003\u0206\u0103\u0000"+
		"\u043f\u0441\u0003\u0224\u0112\u0000\u0440\u043e\u0001\u0000\u0000\u0000"+
		"\u0440\u043f\u0001\u0000\u0000\u0000\u0441\u009d\u0001\u0000\u0000\u0000"+
		"\u0442\u0444\u0003\u0174\u00ba\u0000\u0443\u0442\u0001\u0000\u0000\u0000"+
		"\u0443\u0444\u0001\u0000\u0000\u0000\u0444\u0446\u0001\u0000\u0000\u0000"+
		"\u0445\u0447\u0003\u0154\u00aa\u0000\u0446\u0445\u0001\u0000\u0000\u0000"+
		"\u0446\u0447\u0001\u0000\u0000\u0000\u0447\u0448\u0001\u0000\u0000\u0000"+
		"\u0448\u0449\u0005\u0005\u0000\u0000\u0449\u044a\u0003\u00a0P\u0000\u044a"+
		"\u009f\u0001\u0000\u0000\u0000\u044b\u0450\u0003\u00a2Q\u0000\u044c\u044d"+
		"\u0005\u008b\u0000\u0000\u044d\u044f\u0003\u00a2Q\u0000\u044e\u044c\u0001"+
		"\u0000\u0000\u0000\u044f\u0452\u0001\u0000\u0000\u0000\u0450\u044e\u0001"+
		"\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000\u0451\u00a1\u0001"+
		"\u0000\u0000\u0000\u0452\u0450\u0001\u0000\u0000\u0000\u0453\u0455\u0003"+
		"\u015a\u00ad\u0000\u0454\u0456\u0003\u00a4R\u0000\u0455\u0454\u0001\u0000"+
		"\u0000\u0000\u0455\u0456\u0001\u0000\u0000\u0000\u0456\u00a3\u0001\u0000"+
		"\u0000\u0000\u0457\u0458\u0003\u020e\u0107\u0000\u0458\u0459\u0003\u017c"+
		"\u00be\u0000\u0459\u00a5\u0001\u0000\u0000\u0000\u045a\u045b\u0003\u00a8"+
		"T\u0000\u045b\u045c\u0003\u00aaU\u0000\u045c\u045d\u0003\u01e0\u00f0\u0000"+
		"\u045d\u045e\u0003\u0094J\u0000\u045e\u047e\u0001\u0000\u0000\u0000\u045f"+
		"\u0460\u0003\u00a8T\u0000\u0460\u0461\u0003\u00aaU\u0000\u0461\u0462\u0003"+
		"\u01e0\u00f0\u0000\u0462\u0463\u0003\u00acV\u0000\u0463\u047e\u0001\u0000"+
		"\u0000\u0000\u0464\u0465\u0003\u00a8T\u0000\u0465\u0466\u0003\u00aaU\u0000"+
		"\u0466\u0467\u0003\u01e0\u00f0\u0000\u0467\u0468\u0003\u00b4Z\u0000\u0468"+
		"\u047e\u0001\u0000\u0000\u0000\u0469\u046a\u0003\u00a8T\u0000\u046a\u046b"+
		"\u0003\u00aaU\u0000\u046b\u046d\u0003\u01e0\u00f0\u0000\u046c\u046e\u0003"+
		"\u00a4R\u0000\u046d\u046c\u0001\u0000\u0000\u0000\u046d\u046e\u0001\u0000"+
		"\u0000\u0000\u046e\u046f\u0001\u0000\u0000\u0000\u046f\u0470\u0003\u00ba"+
		"]\u0000\u0470\u047e\u0001\u0000\u0000\u0000\u0471\u0472\u0003\u00a8T\u0000"+
		"\u0472\u0473\u0003\u00aaU\u0000\u0473\u0474\u0003\u01e0\u00f0\u0000\u0474"+
		"\u0476\u0003\u01e0\u00f0\u0000\u0475\u0477\u0003\u00a4R\u0000\u0476\u0475"+
		"\u0001\u0000\u0000\u0000\u0476\u0477\u0001\u0000\u0000\u0000\u0477\u0478"+
		"\u0001\u0000\u0000\u0000\u0478\u0479\u0003\u00ba]\u0000\u0479\u047e\u0001"+
		"\u0000\u0000\u0000\u047a\u047b\u0003\u00a8T\u0000\u047b\u047c\u0003\u00a0"+
		"P\u0000\u047c\u047e\u0001\u0000\u0000\u0000\u047d\u045a\u0001\u0000\u0000"+
		"\u0000\u047d\u045f\u0001\u0000\u0000\u0000\u047d\u0464\u0001\u0000\u0000"+
		"\u0000\u047d\u0469\u0001\u0000\u0000\u0000\u047d\u0471\u0001\u0000\u0000"+
		"\u0000\u047d\u047a\u0001\u0000\u0000\u0000\u047e\u00a7\u0001\u0000\u0000"+
		"\u0000\u047f\u0481\u0003\u0174\u00ba\u0000\u0480\u047f\u0001\u0000\u0000"+
		"\u0000\u0480\u0481\u0001\u0000\u0000\u0000\u0481\u0483\u0001\u0000\u0000"+
		"\u0000\u0482\u0484\u0003\u0154\u00aa\u0000\u0483\u0482\u0001\u0000\u0000"+
		"\u0000\u0483\u0484\u0001\u0000\u0000\u0000\u0484\u0485\u0001\u0000\u0000"+
		"\u0000\u0485\u0486\u0005\u0006\u0000\u0000\u0486\u00a9\u0001\u0000\u0000"+
		"\u0000\u0487\u0488\u0003\u0206\u0103\u0000\u0488\u00ab\u0001\u0000\u0000"+
		"\u0000\u0489\u048a\u0005\u0085\u0000\u0000\u048a\u048c\u0003\u00aeW\u0000"+
		"\u048b\u048d\u0003\u00b0X\u0000\u048c\u048b\u0001\u0000\u0000\u0000\u048c"+
		"\u048d\u0001\u0000\u0000\u0000\u048d\u048e\u0001\u0000\u0000\u0000\u048e"+
		"\u048f\u0005\u0088\u0000\u0000\u048f\u0496\u0001\u0000\u0000\u0000\u0490"+
		"\u0491\u0005\u0085\u0000\u0000\u0491\u0492\u0003\u00b0X\u0000\u0492\u0493"+
		"\u0003\u00aeW\u0000\u0493\u0494\u0005\u0088\u0000\u0000\u0494\u0496\u0001"+
		"\u0000\u0000\u0000\u0495\u0489\u0001\u0000\u0000\u0000\u0495\u0490\u0001"+
		"\u0000\u0000\u0000\u0496\u00ad\u0001\u0000\u0000\u0000\u0497\u0499\u0003"+
		"\u0174\u00ba\u0000\u0498\u0497\u0001\u0000\u0000\u0000\u0498\u0499\u0001"+
		"\u0000\u0000\u0000\u0499\u049b\u0001\u0000\u0000\u0000\u049a\u049c\u0003"+
		"\u0158\u00ac\u0000\u049b\u049a\u0001\u0000\u0000\u0000\u049b\u049c\u0001"+
		"\u0000\u0000\u0000\u049c\u049d\u0001\u0000\u0000\u0000\u049d\u049e\u0005"+
		"(\u0000\u0000\u049e\u049f\u0003\u0094J\u0000\u049f\u00af\u0001\u0000\u0000"+
		"\u0000\u04a0\u04a2\u0003\u0174\u00ba\u0000\u04a1\u04a0\u0001\u0000\u0000"+
		"\u0000\u04a1\u04a2\u0001\u0000\u0000\u0000\u04a2\u04a4\u0001\u0000\u0000"+
		"\u0000\u04a3\u04a5\u0003\u0158\u00ac\u0000\u04a4\u04a3\u0001\u0000\u0000"+
		"\u0000\u04a4\u04a5\u0001\u0000\u0000\u0000\u04a5\u04a6\u0001\u0000\u0000"+
		"\u0000\u04a6\u04a8\u0005)\u0000\u0000\u04a7\u04a9\u0003\u00b2Y\u0000\u04a8"+
		"\u04a7\u0001\u0000\u0000\u0000\u04a8\u04a9\u0001\u0000\u0000\u0000\u04a9"+
		"\u04aa\u0001\u0000\u0000\u0000\u04aa\u04ab\u0003\u0094J\u0000\u04ab\u00b1"+
		"\u0001\u0000\u0000\u0000\u04ac\u04ad\u0005\u0086\u0000\u0000\u04ad\u04ae"+
		"\u0003\u0206\u0103\u0000\u04ae\u04af\u0005\u0089\u0000\u0000\u04af\u00b3"+
		"\u0001\u0000\u0000\u0000\u04b0\u04b1\u0005\u0085\u0000\u0000\u04b1\u04b3"+
		"\u0003\u00b6[\u0000\u04b2\u04b4\u0003\u00b8\\\u0000\u04b3\u04b2\u0001"+
		"\u0000\u0000\u0000\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4\u04b5\u0001"+
		"\u0000\u0000\u0000\u04b5\u04b6\u0005\u0088\u0000\u0000\u04b6\u04bd\u0001"+
		"\u0000\u0000\u0000\u04b7\u04b8\u0005\u0085\u0000\u0000\u04b8\u04b9\u0003"+
		"\u00b8\\\u0000\u04b9\u04ba\u0003\u00b6[\u0000\u04ba\u04bb\u0005\u0088"+
		"\u0000\u0000\u04bb\u04bd\u0001\u0000\u0000\u0000\u04bc\u04b0\u0001\u0000"+
		"\u0000\u0000\u04bc\u04b7\u0001\u0000\u0000\u0000\u04bd\u00b5\u0001\u0000"+
		"\u0000\u0000\u04be\u04c0\u0003\u0174\u00ba\u0000\u04bf\u04be\u0001\u0000"+
		"\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000\u04c0\u04c2\u0001\u0000"+
		"\u0000\u0000\u04c1\u04c3\u0003\u0158\u00ac\u0000\u04c2\u04c1\u0001\u0000"+
		"\u0000\u0000\u04c2\u04c3\u0001\u0000\u0000\u0000\u04c3\u04c4\u0001\u0000"+
		"\u0000\u0000\u04c4\u04c5\u0005(\u0000\u0000\u04c5\u00b7\u0001\u0000\u0000"+
		"\u0000\u04c6\u04c8\u0003\u0174\u00ba\u0000\u04c7\u04c6\u0001\u0000\u0000"+
		"\u0000\u04c7\u04c8\u0001\u0000\u0000\u0000\u04c8\u04ca\u0001\u0000\u0000"+
		"\u0000\u04c9\u04cb\u0003\u0158\u00ac\u0000\u04ca\u04c9\u0001\u0000\u0000"+
		"\u0000\u04ca\u04cb\u0001\u0000\u0000\u0000\u04cb\u04cc\u0001\u0000\u0000"+
		"\u0000\u04cc\u04cd\u0005)\u0000\u0000\u04cd\u00b9\u0001\u0000\u0000\u0000"+
		"\u04ce\u04cf\u0005\u0085\u0000\u0000\u04cf\u04d1\u0003\u00bc^\u0000\u04d0"+
		"\u04d2\u0003\u00be_\u0000\u04d1\u04d0\u0001\u0000\u0000\u0000\u04d1\u04d2"+
		"\u0001\u0000\u0000\u0000\u04d2\u04d3\u0001\u0000\u0000\u0000\u04d3\u04d4"+
		"\u0005\u0088\u0000\u0000\u04d4\u04db\u0001\u0000\u0000\u0000\u04d5\u04d6"+
		"\u0005\u0085\u0000\u0000\u04d6\u04d7\u0003\u00be_\u0000\u04d7\u04d8\u0003"+
		"\u00bc^\u0000\u04d8\u04d9\u0005\u0088\u0000\u0000\u04d9\u04db\u0001\u0000"+
		"\u0000\u0000\u04da\u04ce\u0001\u0000\u0000\u0000\u04da\u04d5\u0001\u0000"+
		"\u0000\u0000\u04db\u00bb\u0001\u0000\u0000\u0000\u04dc\u04de\u0003\u0174"+
		"\u00ba\u0000\u04dd\u04dc\u0001\u0000\u0000\u0000\u04dd\u04de\u0001\u0000"+
		"\u0000\u0000\u04de\u04df\u0001\u0000\u0000\u0000\u04df\u04e1\u0005*\u0000"+
		"\u0000\u04e0\u04e2\u0003\u00b2Y\u0000\u04e1\u04e0\u0001\u0000\u0000\u0000"+
		"\u04e1\u04e2\u0001\u0000\u0000\u0000\u04e2\u04e3\u0001\u0000\u0000\u0000"+
		"\u04e3\u04e4\u0003\u0094J\u0000\u04e4\u00bd\u0001\u0000\u0000\u0000\u04e5"+
		"\u04e7\u0003\u0174\u00ba\u0000\u04e6\u04e5\u0001\u0000\u0000\u0000\u04e6"+
		"\u04e7\u0001\u0000\u0000\u0000\u04e7\u04e8\u0001\u0000\u0000\u0000\u04e8"+
		"\u04ea\u0005+\u0000\u0000\u04e9\u04eb\u0003\u00b2Y\u0000\u04ea\u04e9\u0001"+
		"\u0000\u0000\u0000\u04ea\u04eb\u0001\u0000\u0000\u0000\u04eb\u04ec\u0001"+
		"\u0000\u0000\u0000\u04ec\u04ed\u0003\u0094J\u0000\u04ed\u00bf\u0001\u0000"+
		"\u0000\u0000\u04ee\u04f0\u0003\u0174\u00ba\u0000\u04ef\u04ee\u0001\u0000"+
		"\u0000\u0000\u04ef\u04f0\u0001\u0000\u0000\u0000\u04f0\u04f2\u0001\u0000"+
		"\u0000\u0000\u04f1\u04f3\u0003\u0156\u00ab\u0000\u04f2\u04f1\u0001\u0000"+
		"\u0000\u0000\u04f2\u04f3\u0001\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000"+
		"\u0000\u0000\u04f4\u04f5\u0005\"\u0000\u0000\u04f5\u04f7\u0003\u00c2a"+
		"\u0000\u04f6\u04f8\u0003x<\u0000\u04f7\u04f6\u0001\u0000\u0000\u0000\u04f7"+
		"\u04f8\u0001\u0000\u0000\u0000\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9"+
		"\u04fa\u0003\u00c4b\u0000\u04fa\u00c1\u0001\u0000\u0000\u0000\u04fb\u04fc"+
		"\u0003\u0206\u0103\u0000\u04fc\u00c3\u0001\u0000\u0000\u0000\u04fd\u04fe"+
		"\u0003\u020e\u0107\u0000\u04fe\u04ff\u0003\u01de\u00ef\u0000\u04ff\u00c5"+
		"\u0001\u0000\u0000\u0000\u0500\u0501\u0003\u00c8d\u0000\u0501\u0503\u0003"+
		"\u00cae\u0000\u0502\u0504\u0003x<\u0000\u0503\u0502\u0001\u0000\u0000"+
		"\u0000\u0503\u0504\u0001\u0000\u0000\u0000\u0504\u0505\u0001\u0000\u0000"+
		"\u0000\u0505\u0507\u0003\u00ccf\u0000\u0506\u0508\u0003~?\u0000\u0507"+
		"\u0506\u0001\u0000\u0000\u0000\u0507\u0508\u0001\u0000\u0000\u0000\u0508"+
		"\u050a\u0001\u0000\u0000\u0000\u0509\u050b\u0003\u00d0h\u0000\u050a\u0509"+
		"\u0001\u0000\u0000\u0000\u050a\u050b\u0001\u0000\u0000\u0000\u050b\u00c7"+
		"\u0001\u0000\u0000\u0000\u050c\u050e\u0003\u0174\u00ba\u0000\u050d\u050c"+
		"\u0001\u0000\u0000\u0000\u050d\u050e\u0001\u0000\u0000\u0000\u050e\u0510"+
		"\u0001\u0000\u0000\u0000\u050f\u0511\u0003\u0154\u00aa\u0000\u0510\u050f"+
		"\u0001\u0000\u0000\u0000\u0510\u0511\u0001\u0000\u0000\u0000\u0511\u0512"+
		"\u0001\u0000\u0000\u0000\u0512\u0513\u0005\'\u0000\u0000\u0513\u00c9\u0001"+
		"\u0000\u0000\u0000\u0514\u0517\u0003\u0206\u0103\u0000\u0515\u0517\u0003"+
		"\u0224\u0112\u0000\u0516\u0514\u0001\u0000\u0000\u0000\u0516\u0515\u0001"+
		"\u0000\u0000\u0000\u0517\u00cb\u0001\u0000\u0000\u0000\u0518\u051a\u0003"+
		"\u00d2i\u0000\u0519\u051b\u0005,\u0000\u0000\u051a\u0519\u0001\u0000\u0000"+
		"\u0000\u051a\u051b\u0001\u0000\u0000\u0000\u051b\u051d\u0001\u0000\u0000"+
		"\u0000\u051c\u051e\u0003\u00ceg\u0000\u051d\u051c\u0001\u0000\u0000\u0000"+
		"\u051d\u051e\u0001\u0000\u0000\u0000\u051e\u0525\u0001\u0000\u0000\u0000"+
		"\u051f\u0520\u0003\u00d2i\u0000\u0520\u0522\u0005-\u0000\u0000\u0521\u0523"+
		"\u0003\u00ceg\u0000\u0522\u0521\u0001\u0000\u0000\u0000\u0522\u0523\u0001"+
		"\u0000\u0000\u0000\u0523\u0525\u0001\u0000\u0000\u0000\u0524\u0518\u0001"+
		"\u0000\u0000\u0000\u0524\u051f\u0001\u0000\u0000\u0000\u0525\u00cd\u0001"+
		"\u0000\u0000\u0000\u0526\u0528\u0003\u0218\u010c\u0000\u0527\u0529\u0003"+
		"\u0174\u00ba\u0000\u0528\u0527\u0001\u0000\u0000\u0000\u0528\u0529\u0001"+
		"\u0000\u0000\u0000\u0529\u052a\u0001\u0000\u0000\u0000\u052a\u052b\u0003"+
		"\u01de\u00ef\u0000\u052b\u00cf\u0001\u0000\u0000\u0000\u052c\u052d\u0003"+
		"\u0094J\u0000\u052d\u00d1\u0001\u0000\u0000\u0000\u052e\u052f\u0005\u0086"+
		"\u0000\u0000\u052f\u0535\u0005\u0089\u0000\u0000\u0530\u0531\u0005\u0086"+
		"\u0000\u0000\u0531\u0532\u0003\u00d4j\u0000\u0532\u0533\u0005\u0089\u0000"+
		"\u0000\u0533\u0535\u0001\u0000\u0000\u0000\u0534\u052e\u0001\u0000\u0000"+
		"\u0000\u0534\u0530\u0001\u0000\u0000\u0000\u0535\u00d3\u0001\u0000\u0000"+
		"\u0000\u0536\u053b\u0003\u00d6k\u0000\u0537\u0538\u0005\u008b\u0000\u0000"+
		"\u0538\u053a\u0003\u00d6k\u0000\u0539\u0537\u0001\u0000\u0000\u0000\u053a"+
		"\u053d\u0001\u0000\u0000\u0000\u053b\u0539\u0001\u0000\u0000\u0000\u053b"+
		"\u053c\u0001\u0000\u0000\u0000\u053c\u00d5\u0001\u0000\u0000\u0000\u053d"+
		"\u053b\u0001\u0000\u0000\u0000\u053e\u0540\u0003\u00d8l\u0000\u053f\u053e"+
		"\u0001\u0000\u0000\u0000\u053f\u0540\u0001\u0000\u0000\u0000\u0540\u0541"+
		"\u0001\u0000\u0000\u0000\u0541\u0542\u0003\u00dam\u0000\u0542\u0544\u0003"+
		"\u01e0\u00f0\u0000\u0543\u0545\u0003\u00dcn\u0000\u0544\u0543\u0001\u0000"+
		"\u0000\u0000\u0544\u0545\u0001\u0000\u0000\u0000\u0545\u0554\u0001\u0000"+
		"\u0000\u0000\u0546\u0548\u0003\u00d8l\u0000\u0547\u0546\u0001\u0000\u0000"+
		"\u0000\u0547\u0548\u0001\u0000\u0000\u0000\u0548\u0549\u0001\u0000\u0000"+
		"\u0000\u0549\u054a\u0003\u00dam\u0000\u054a\u054b\u0003\u01e0\u00f0\u0000"+
		"\u054b\u0554\u0001\u0000\u0000\u0000\u054c\u054e\u0003\u00d8l\u0000\u054d"+
		"\u054c\u0001\u0000\u0000\u0000\u054d\u054e\u0001\u0000\u0000\u0000\u054e"+
		"\u054f\u0001\u0000\u0000\u0000\u054f\u0550\u0003\u00dam\u0000\u0550\u0551"+
		"\u0003\u01e0\u00f0\u0000\u0551\u0552\u0003\u021a\u010d\u0000\u0552\u0554"+
		"\u0001\u0000\u0000\u0000\u0553\u053f\u0001\u0000\u0000\u0000\u0553\u0547"+
		"\u0001\u0000\u0000\u0000\u0553\u054d\u0001\u0000\u0000\u0000\u0554\u00d7"+
		"\u0001\u0000\u0000\u0000\u0555\u0556\u0003\u0208\u0104\u0000\u0556\u00d9"+
		"\u0001\u0000\u0000\u0000\u0557\u0558\u0003\u0208\u0104\u0000\u0558\u00db"+
		"\u0001\u0000\u0000\u0000\u0559\u055a\u0003\u020e\u0107\u0000\u055a\u055b"+
		"\u0003\u017c\u00be\u0000\u055b\u00dd\u0001\u0000\u0000\u0000\u055c\u055e"+
		"\u0003\u0174\u00ba\u0000\u055d\u055c\u0001\u0000\u0000\u0000\u055d\u055e"+
		"\u0001\u0000\u0000\u0000\u055e\u0560\u0001\u0000\u0000\u0000\u055f\u0561"+
		"\u0003\u0156\u00ab\u0000\u0560\u055f\u0001\u0000\u0000\u0000\u0560\u0561"+
		"\u0001\u0000\u0000\u0000\u0561\u0562\u0001\u0000\u0000\u0000\u0562\u056b"+
		"\u0003\u00e0p\u0000\u0563\u0565\u0003\u0174\u00ba\u0000\u0564\u0563\u0001"+
		"\u0000\u0000\u0000\u0564\u0565\u0001\u0000\u0000\u0000\u0565\u0567\u0001"+
		"\u0000\u0000\u0000\u0566\u0568\u0003\u0156\u00ab\u0000\u0567\u0566\u0001"+
		"\u0000\u0000\u0000\u0567\u0568\u0001\u0000\u0000\u0000\u0568\u0569\u0001"+
		"\u0000\u0000\u0000\u0569\u056b\u0003\u00f0x\u0000\u056a\u055d\u0001\u0000"+
		"\u0000\u0000\u056a\u0564\u0001\u0000\u0000\u0000\u056b\u00df\u0001\u0000"+
		"\u0000\u0000\u056c\u056e\u0005.\u0000\u0000\u056d\u056c\u0001\u0000\u0000"+
		"\u0000\u056d\u056e\u0001\u0000\u0000\u0000\u056e\u056f\u0001\u0000\u0000"+
		"\u0000\u056f\u0570\u0005%\u0000\u0000\u0570\u0572\u0003\u00ecv\u0000\u0571"+
		"\u0573\u0003x<\u0000\u0572\u0571\u0001\u0000\u0000\u0000\u0572\u0573\u0001"+
		"\u0000\u0000\u0000\u0573\u0575\u0001\u0000\u0000\u0000\u0574\u0576\u0003"+
		"\u0200\u0100\u0000\u0575\u0574\u0001\u0000\u0000\u0000\u0575\u0576\u0001"+
		"\u0000\u0000\u0000\u0576\u0578\u0001\u0000\u0000\u0000\u0577\u0579\u0003"+
		"~?\u0000\u0578\u0577\u0001\u0000\u0000\u0000\u0578\u0579\u0001\u0000\u0000"+
		"\u0000\u0579\u057a\u0001\u0000\u0000\u0000\u057a\u057c\u0005\u0085\u0000"+
		"\u0000\u057b\u057d\u0003\u00e2q\u0000\u057c\u057b\u0001\u0000\u0000\u0000"+
		"\u057c\u057d\u0001\u0000\u0000\u0000\u057d\u057e\u0001\u0000\u0000\u0000"+
		"\u057e\u057f\u0005\u0088\u0000\u0000\u057f\u00e1\u0001\u0000\u0000\u0000"+
		"\u0580\u0582\u0003\u00e4r\u0000\u0581\u0583\u0003\u00e2q\u0000\u0582\u0581"+
		"\u0001\u0000\u0000\u0000\u0582\u0583\u0001\u0000\u0000\u0000\u0583\u00e3"+
		"\u0001\u0000\u0000\u0000\u0584\u0588\u0003\u008eG\u0000\u0585\u0588\u0003"+
		"\u00e6s\u0000\u0586\u0588\u0003N\'\u0000\u0587\u0584\u0001\u0000\u0000"+
		"\u0000\u0587\u0585\u0001\u0000\u0000\u0000\u0587\u0586\u0001\u0000\u0000"+
		"\u0000\u0588\u00e5\u0001\u0000\u0000\u0000\u0589\u058b\u0003\u0174\u00ba"+
		"\u0000\u058a\u0589\u0001\u0000\u0000\u0000\u058a\u058b\u0001\u0000\u0000"+
		"\u0000\u058b\u058d\u0001\u0000\u0000\u0000\u058c\u058e\u0005.\u0000\u0000"+
		"\u058d\u058c\u0001\u0000\u0000\u0000\u058d\u058e\u0001\u0000\u0000\u0000"+
		"\u058e\u058f\u0001\u0000\u0000\u0000\u058f\u0590\u0005\u0002\u0000\u0000"+
		"\u0590\u0591\u0003\u00e8t\u0000\u0591\u00e7\u0001\u0000\u0000\u0000\u0592"+
		"\u0598\u0003\u00eau\u0000\u0593\u0594\u0003\u00eau\u0000\u0594\u0595\u0005"+
		"\u008b\u0000\u0000\u0595\u0596\u0003\u00e8t\u0000\u0596\u0598\u0001\u0000"+
		"\u0000\u0000\u0597\u0592\u0001\u0000\u0000\u0000\u0597\u0593\u0001\u0000"+
		"\u0000\u0000\u0598\u00e9\u0001\u0000\u0000\u0000\u0599\u059b\u0003\u00ee"+
		"w\u0000\u059a\u059c\u0003\u01e6\u00f3\u0000\u059b\u059a\u0001\u0000\u0000"+
		"\u0000\u059b\u059c\u0001\u0000\u0000\u0000\u059c\u00eb\u0001\u0000\u0000"+
		"\u0000\u059d\u059e\u0003\u0206\u0103\u0000\u059e\u00ed\u0001\u0000\u0000"+
		"\u0000\u059f\u05a0\u0003\u0206\u0103\u0000\u05a0\u00ef\u0001\u0000\u0000"+
		"\u0000\u05a1\u05a2\u0005%\u0000\u0000\u05a2\u05a4\u0003\u00ecv\u0000\u05a3"+
		"\u05a5\u0003x<\u0000\u05a4\u05a3\u0001\u0000\u0000\u0000\u05a4\u05a5\u0001"+
		"\u0000\u0000\u0000\u05a5\u05a6\u0001\u0000\u0000\u0000\u05a6\u05a8\u0003"+
		"\u0200\u0100\u0000\u05a7\u05a9\u0003~?\u0000\u05a8\u05a7\u0001\u0000\u0000"+
		"\u0000\u05a8\u05a9\u0001\u0000\u0000\u0000\u05a9\u05aa\u0001\u0000\u0000"+
		"\u0000\u05aa\u05ab\u0005\u0085\u0000\u0000\u05ab\u05ac\u0003\u00f2y\u0000"+
		"\u05ac\u05ad\u0005\u0088\u0000\u0000\u05ad\u00f1\u0001\u0000\u0000\u0000"+
		"\u05ae\u05b0\u0003\u00f4z\u0000\u05af\u05b1\u0003\u00f2y\u0000\u05b0\u05af"+
		"\u0001\u0000\u0000\u0000\u05b0\u05b1\u0001\u0000\u0000\u0000\u05b1\u00f3"+
		"\u0001\u0000\u0000\u0000\u05b2\u05b6\u0003\u008eG\u0000\u05b3\u05b6\u0003"+
		"\u00f6{\u0000\u05b4\u05b6\u0003N\'\u0000\u05b5\u05b2\u0001\u0000\u0000"+
		"\u0000\u05b5\u05b3\u0001\u0000\u0000\u0000\u05b5\u05b4\u0001\u0000\u0000"+
		"\u0000\u05b6\u00f5\u0001\u0000\u0000\u0000\u05b7\u05b9\u0003\u0174\u00ba"+
		"\u0000\u05b8\u05b7\u0001\u0000\u0000\u0000\u05b8\u05b9\u0001\u0000\u0000"+
		"\u0000\u05b9\u05ba\u0001\u0000\u0000\u0000\u05ba\u05bb\u0005\u0002\u0000"+
		"\u0000\u05bb\u05bc\u0003\u00f8|\u0000\u05bc\u00f7\u0001\u0000\u0000\u0000"+
		"\u05bd\u05c3\u0003\u00fa}\u0000\u05be\u05bf\u0003\u00fa}\u0000\u05bf\u05c0"+
		"\u0005\u008b\u0000\u0000\u05c0\u05c1\u0003\u00f8|\u0000\u05c1\u05c3\u0001"+
		"\u0000\u0000\u0000\u05c2\u05bd\u0001\u0000\u0000\u0000\u05c2\u05be\u0001"+
		"\u0000\u0000\u0000\u05c3\u00f9\u0001\u0000\u0000\u0000\u05c4\u05c6\u0003"+
		"\u00eew\u0000\u05c5\u05c7\u0003\u00fc~\u0000\u05c6\u05c5\u0001\u0000\u0000"+
		"\u0000\u05c6\u05c7\u0001\u0000\u0000\u0000\u05c7\u00fb\u0001\u0000\u0000"+
		"\u0000\u05c8\u05c9\u0003\u020e\u0107\u0000\u05c9\u05ca\u0003\u00fe\u007f"+
		"\u0000\u05ca\u00fd\u0001\u0000\u0000\u0000\u05cb\u05cf\u0003\u0230\u0118"+
		"\u0000\u05cc\u05cf\u0005\u00a7\u0000\u0000\u05cd\u05cf\u0003\u0232\u0119"+
		"\u0000\u05ce\u05cb\u0001\u0000\u0000\u0000\u05ce\u05cc\u0001\u0000\u0000"+
		"\u0000\u05ce\u05cd\u0001\u0000\u0000\u0000\u05cf\u00ff\u0001\u0000\u0000"+
		"\u0000\u05d0\u05d2\u0003\u0174\u00ba\u0000\u05d1\u05d0\u0001\u0000\u0000"+
		"\u0000\u05d1\u05d2\u0001\u0000\u0000\u0000\u05d2\u05d4\u0001\u0000\u0000"+
		"\u0000\u05d3\u05d5\u0003\u0156\u00ab\u0000\u05d4\u05d3\u0001\u0000\u0000"+
		"\u0000\u05d4\u05d5\u0001\u0000\u0000\u0000\u05d5\u05d6\u0001\u0000\u0000"+
		"\u0000\u05d6\u05d7\u0005#\u0000\u0000\u05d7\u05d9\u0003\u0102\u0081\u0000"+
		"\u05d8\u05da\u0003x<\u0000\u05d9\u05d8\u0001\u0000\u0000\u0000\u05d9\u05da"+
		"\u0001\u0000\u0000\u0000\u05da\u05dc\u0001\u0000\u0000\u0000\u05db\u05dd"+
		"\u0003\u0200\u0100\u0000\u05dc\u05db\u0001\u0000\u0000\u0000\u05dc\u05dd"+
		"\u0001\u0000\u0000\u0000\u05dd\u05df\u0001\u0000\u0000\u0000\u05de\u05e0"+
		"\u0003~?\u0000\u05df\u05de\u0001\u0000\u0000\u0000\u05df\u05e0\u0001\u0000"+
		"\u0000\u0000\u05e0\u05e1\u0001\u0000\u0000\u0000\u05e1\u05e2\u0003\u0104"+
		"\u0082\u0000\u05e2\u0101\u0001\u0000\u0000\u0000\u05e3\u05e4\u0003\u0206"+
		"\u0103\u0000\u05e4\u0103\u0001\u0000\u0000\u0000\u05e5\u05e9\u0005\u0085"+
		"\u0000\u0000\u05e6\u05e8\u0003\u0106\u0083\u0000\u05e7\u05e6\u0001\u0000"+
		"\u0000\u0000\u05e8\u05eb\u0001\u0000\u0000\u0000\u05e9\u05e7\u0001\u0000"+
		"\u0000\u0000\u05e9\u05ea\u0001\u0000\u0000\u0000\u05ea\u05ec\u0001\u0000"+
		"\u0000\u0000\u05eb\u05e9\u0001\u0000\u0000\u0000\u05ec\u05ed\u0005\u0088"+
		"\u0000\u0000\u05ed\u0105\u0001\u0000\u0000\u0000\u05ee\u05f1\u0003\u008e"+
		"G\u0000\u05ef\u05f1\u0003N\'\u0000\u05f0\u05ee\u0001\u0000\u0000\u0000"+
		"\u05f0\u05ef\u0001\u0000\u0000\u0000\u05f1\u0107\u0001\u0000\u0000\u0000"+
		"\u05f2\u05f4\u0003\u0174\u00ba\u0000\u05f3\u05f2\u0001\u0000\u0000\u0000"+
		"\u05f3\u05f4\u0001\u0000\u0000\u0000\u05f4\u05f6\u0001\u0000\u0000\u0000"+
		"\u05f5\u05f7\u0003\u0156\u00ab\u0000\u05f6\u05f5\u0001\u0000\u0000\u0000"+
		"\u05f6\u05f7\u0001\u0000\u0000\u0000\u05f7\u05f9\u0001\u0000\u0000\u0000"+
		"\u05f8\u05fa\u0005/\u0000\u0000\u05f9\u05f8\u0001\u0000\u0000\u0000\u05f9"+
		"\u05fa\u0001\u0000\u0000\u0000\u05fa\u05fb\u0001\u0000\u0000\u0000\u05fb"+
		"\u05fc\u0005$\u0000\u0000\u05fc\u05fe\u0003\u010a\u0085\u0000\u05fd\u05ff"+
		"\u0003x<\u0000\u05fe\u05fd\u0001\u0000\u0000\u0000\u05fe\u05ff\u0001\u0000"+
		"\u0000\u0000\u05ff\u0601\u0001\u0000\u0000\u0000\u0600\u0602\u0003\u0200"+
		"\u0100\u0000\u0601\u0600\u0001\u0000\u0000\u0000\u0601\u0602\u0001\u0000"+
		"\u0000\u0000\u0602\u0604\u0001\u0000\u0000\u0000\u0603\u0605\u0003~?\u0000"+
		"\u0604\u0603\u0001\u0000\u0000\u0000\u0604\u0605\u0001\u0000\u0000\u0000"+
		"\u0605\u0606\u0001\u0000\u0000\u0000\u0606\u0607\u0003\u010c\u0086\u0000"+
		"\u0607\u0620\u0001\u0000\u0000\u0000\u0608\u060a\u0003\u0174\u00ba\u0000"+
		"\u0609\u0608\u0001\u0000\u0000\u0000\u0609\u060a\u0001\u0000\u0000\u0000"+
		"\u060a\u060c\u0001\u0000\u0000\u0000\u060b\u060d\u0003\u0156\u00ab\u0000"+
		"\u060c\u060b\u0001\u0000\u0000\u0000\u060c\u060d\u0001\u0000\u0000\u0000"+
		"\u060d\u060e\u0001\u0000\u0000\u0000\u060e\u0610\u0005/\u0000\u0000\u060f"+
		"\u0611\u0003\u0156\u00ab\u0000\u0610\u060f\u0001\u0000\u0000\u0000\u0610"+
		"\u0611\u0001\u0000\u0000\u0000\u0611\u0612\u0001\u0000\u0000\u0000\u0612"+
		"\u0613\u0005$\u0000\u0000\u0613\u0615\u0003\u010a\u0085\u0000\u0614\u0616"+
		"\u0003x<\u0000\u0615\u0614\u0001\u0000\u0000\u0000\u0615\u0616\u0001\u0000"+
		"\u0000\u0000\u0616\u0618\u0001\u0000\u0000\u0000\u0617\u0619\u0003\u0200"+
		"\u0100\u0000\u0618\u0617\u0001\u0000\u0000\u0000\u0618\u0619\u0001\u0000"+
		"\u0000\u0000\u0619\u061b\u0001\u0000\u0000\u0000\u061a\u061c\u0003~?\u0000"+
		"\u061b\u061a\u0001\u0000\u0000\u0000\u061b\u061c\u0001\u0000\u0000\u0000"+
		"\u061c\u061d\u0001\u0000\u0000\u0000\u061d\u061e\u0003\u010c\u0086\u0000"+
		"\u061e\u0620\u0001\u0000\u0000\u0000\u061f\u05f3\u0001\u0000\u0000\u0000"+
		"\u061f\u0609\u0001\u0000\u0000\u0000\u0620\u0109\u0001\u0000\u0000\u0000"+
		"\u0621\u0622\u0003\u0206\u0103\u0000\u0622\u010b\u0001\u0000\u0000\u0000"+
		"\u0623\u0627\u0005\u0085\u0000\u0000\u0624\u0626\u0003\u010e\u0087\u0000"+
		"\u0625\u0624\u0001\u0000\u0000\u0000\u0626\u0629\u0001\u0000\u0000\u0000"+
		"\u0627\u0625\u0001\u0000\u0000\u0000\u0627\u0628\u0001\u0000\u0000\u0000"+
		"\u0628\u062a\u0001\u0000\u0000\u0000\u0629\u0627\u0001\u0000\u0000\u0000"+
		"\u062a\u062b\u0005\u0088\u0000\u0000\u062b\u010d\u0001\u0000\u0000\u0000"+
		"\u062c\u062f\u0003\u008eG\u0000\u062d\u062f\u0003N\'\u0000\u062e\u062c"+
		"\u0001\u0000\u0000\u0000\u062e\u062d\u0001\u0000\u0000\u0000\u062f\u010f"+
		"\u0001\u0000\u0000\u0000\u0630\u0632\u0003\u0174\u00ba\u0000\u0631\u0630"+
		"\u0001\u0000\u0000\u0000\u0631\u0632\u0001\u0000\u0000\u0000\u0632\u0634"+
		"\u0001\u0000\u0000\u0000\u0633\u0635\u0003\u0156\u00ab\u0000\u0634\u0633"+
		"\u0001\u0000\u0000\u0000\u0634\u0635\u0001\u0000\u0000\u0000\u0635\u0636"+
		"\u0001\u0000\u0000\u0000\u0636\u0637\u0005&\u0000\u0000\u0637\u0639\u0003"+
		"\u0112\u0089\u0000\u0638\u063a\u0003\u0200\u0100\u0000\u0639\u0638\u0001"+
		"\u0000\u0000\u0000\u0639\u063a\u0001\u0000\u0000\u0000\u063a\u063b\u0001"+
		"\u0000\u0000\u0000\u063b\u063c\u0003\u0114\u008a\u0000\u063c\u0111\u0001"+
		"\u0000\u0000\u0000\u063d\u063e\u0003\u0206\u0103\u0000\u063e\u0113\u0001"+
		"\u0000\u0000\u0000\u063f\u0643\u0005\u0085\u0000\u0000\u0640\u0642\u0003"+
		"\u0116\u008b\u0000\u0641\u0640\u0001\u0000\u0000\u0000\u0642\u0645\u0001"+
		"\u0000\u0000\u0000\u0643\u0641\u0001\u0000\u0000\u0000\u0643\u0644\u0001"+
		"\u0000\u0000\u0000\u0644\u0646\u0001\u0000\u0000\u0000\u0645\u0643\u0001"+
		"\u0000\u0000\u0000\u0646\u0647\u0005\u0088\u0000\u0000\u0647\u0115\u0001"+
		"\u0000\u0000\u0000\u0648\u064b\u0003\u0118\u008c\u0000\u0649\u064b\u0003"+
		"N\'\u0000\u064a\u0648\u0001\u0000\u0000\u0000\u064a\u0649\u0001\u0000"+
		"\u0000\u0000\u064b\u0117\u0001\u0000\u0000\u0000\u064c\u0653\u0003\u011a"+
		"\u008d\u0000\u064d\u0653\u0003\u011c\u008e\u0000\u064e\u0653\u0003\u011e"+
		"\u008f\u0000\u064f\u0653\u0003\u0120\u0090\u0000\u0650\u0653\u0003\u0122"+
		"\u0091\u0000\u0651\u0653\u0003\u00c0`\u0000\u0652\u064c\u0001\u0000\u0000"+
		"\u0000\u0652\u064d\u0001\u0000\u0000\u0000\u0652\u064e\u0001\u0000\u0000"+
		"\u0000\u0652\u064f\u0001\u0000\u0000\u0000\u0652\u0650\u0001\u0000\u0000"+
		"\u0000\u0652\u0651\u0001\u0000\u0000\u0000\u0653\u0119\u0001\u0000\u0000"+
		"\u0000\u0654\u0655\u0003\u00a8T\u0000\u0655\u0656\u0003\u00aaU\u0000\u0656"+
		"\u0657\u0003\u01e0\u00f0\u0000\u0657\u0658\u0003\u00b4Z\u0000\u0658\u011b"+
		"\u0001\u0000\u0000\u0000\u0659\u065a\u0003\u00c8d\u0000\u065a\u065c\u0003"+
		"\u00cae\u0000\u065b\u065d\u0003x<\u0000\u065c\u065b\u0001\u0000\u0000"+
		"\u0000\u065c\u065d\u0001\u0000\u0000\u0000\u065d\u065e\u0001\u0000\u0000"+
		"\u0000\u065e\u0660\u0003\u00ccf\u0000\u065f\u0661\u0003~?\u0000\u0660"+
		"\u065f\u0001\u0000\u0000\u0000\u0660\u0661\u0001\u0000\u0000\u0000\u0661"+
		"\u011d\u0001\u0000\u0000\u0000\u0662\u0664\u0003\u0126\u0093\u0000\u0663"+
		"\u0665\u0003x<\u0000\u0664\u0663\u0001\u0000\u0000\u0000\u0664\u0665\u0001"+
		"\u0000\u0000\u0000\u0665\u0666\u0001\u0000\u0000\u0000\u0666\u0668\u0003"+
		"\u00d2i\u0000\u0667\u0669\u0005,\u0000\u0000\u0668\u0667\u0001\u0000\u0000"+
		"\u0000\u0668\u0669\u0001\u0000\u0000\u0000\u0669\u066b\u0001\u0000\u0000"+
		"\u0000\u066a\u066c\u0003~?\u0000\u066b\u066a\u0001\u0000\u0000\u0000\u066b"+
		"\u066c\u0001\u0000\u0000\u0000\u066c\u0677\u0001\u0000\u0000\u0000\u066d"+
		"\u066f\u0003\u0126\u0093\u0000\u066e\u0670\u0003x<\u0000\u066f\u066e\u0001"+
		"\u0000\u0000\u0000\u066f\u0670\u0001\u0000\u0000\u0000\u0670\u0671\u0001"+
		"\u0000\u0000\u0000\u0671\u0672\u0003\u00d2i\u0000\u0672\u0674\u0005-\u0000"+
		"\u0000\u0673\u0675\u0003~?\u0000\u0674\u0673\u0001\u0000\u0000\u0000\u0674"+
		"\u0675\u0001\u0000\u0000\u0000\u0675\u0677\u0001\u0000\u0000\u0000\u0676"+
		"\u0662\u0001\u0000\u0000\u0000\u0676\u066d\u0001\u0000\u0000\u0000\u0677"+
		"\u011f\u0001\u0000\u0000\u0000\u0678\u0679\u0003\u0134\u009a\u0000\u0679"+
		"\u067a\u0003\u0136\u009b\u0000\u067a\u067b\u0003\u00b4Z\u0000\u067b\u0121"+
		"\u0001\u0000\u0000\u0000\u067c\u067e\u0003\u0174\u00ba\u0000\u067d\u067c"+
		"\u0001\u0000\u0000\u0000\u067d\u067e\u0001\u0000\u0000\u0000\u067e\u0680"+
		"\u0001\u0000\u0000\u0000\u067f\u0681\u0003\u0156\u00ab\u0000\u0680\u067f"+
		"\u0001\u0000\u0000\u0000\u0680\u0681\u0001\u0000\u0000\u0000\u0681\u0682"+
		"\u0001\u0000\u0000\u0000\u0682\u0683\u00050\u0000\u0000\u0683\u0685\u0003"+
		"\u00c2a\u0000\u0684\u0686\u0003\u0200\u0100\u0000\u0685\u0684\u0001\u0000"+
		"\u0000\u0000\u0685\u0686\u0001\u0000\u0000\u0000\u0686\u0688\u0001\u0000"+
		"\u0000\u0000\u0687\u0689\u0003\u00c4b\u0000\u0688\u0687\u0001\u0000\u0000"+
		"\u0000\u0688\u0689\u0001\u0000\u0000\u0000\u0689\u0123\u0001\u0000\u0000"+
		"\u0000\u068a\u068c\u0003\u0126\u0093\u0000\u068b\u068d\u0003x<\u0000\u068c"+
		"\u068b\u0001\u0000\u0000\u0000\u068c\u068d\u0001\u0000\u0000\u0000\u068d"+
		"\u068e\u0001\u0000\u0000\u0000\u068e\u0690\u0003\u00d2i\u0000\u068f\u0691"+
		"\u0005,\u0000\u0000\u0690\u068f\u0001\u0000\u0000\u0000\u0690\u0691\u0001"+
		"\u0000\u0000\u0000\u0691\u0693\u0001\u0000\u0000\u0000\u0692\u0694\u0003"+
		"~?\u0000\u0693\u0692\u0001\u0000\u0000\u0000\u0693\u0694\u0001\u0000\u0000"+
		"\u0000\u0694\u0695\u0001\u0000\u0000\u0000\u0695\u0696\u0003\u0128\u0094"+
		"\u0000\u0696\u06a3\u0001\u0000\u0000\u0000\u0697\u0699\u0003\u0126\u0093"+
		"\u0000\u0698\u069a\u0003x<\u0000\u0699\u0698\u0001\u0000\u0000\u0000\u0699"+
		"\u069a\u0001\u0000\u0000\u0000\u069a\u069b\u0001\u0000\u0000\u0000\u069b"+
		"\u069c\u0003\u00d2i\u0000\u069c\u069e\u0005-\u0000\u0000\u069d\u069f\u0003"+
		"~?\u0000\u069e\u069d\u0001\u0000\u0000\u0000\u069e\u069f\u0001\u0000\u0000"+
		"\u0000\u069f\u06a0\u0001\u0000\u0000\u0000\u06a0\u06a1\u0003\u0128\u0094"+
		"\u0000\u06a1\u06a3\u0001\u0000\u0000\u0000\u06a2\u068a\u0001\u0000\u0000"+
		"\u0000\u06a2\u0697\u0001\u0000\u0000\u0000\u06a3\u0125\u0001\u0000\u0000"+
		"\u0000\u06a4\u06a6\u0003\u0174\u00ba\u0000\u06a5\u06a4\u0001\u0000\u0000"+
		"\u0000\u06a5\u06a6\u0001\u0000\u0000\u0000\u06a6\u06a8\u0001\u0000\u0000"+
		"\u0000\u06a7\u06a9\u0003\u0154\u00aa\u0000\u06a8\u06a7\u0001\u0000\u0000"+
		"\u0000\u06a8\u06a9\u0001\u0000\u0000\u0000\u06a9\u06aa\u0001\u0000\u0000"+
		"\u0000\u06aa\u06bc\u00051\u0000\u0000\u06ab\u06ad\u0003\u0174\u00ba\u0000"+
		"\u06ac\u06ab\u0001\u0000\u0000\u0000\u06ac\u06ad\u0001\u0000\u0000\u0000"+
		"\u06ad\u06af\u0001\u0000\u0000\u0000\u06ae\u06b0\u0003\u0154\u00aa\u0000"+
		"\u06af\u06ae\u0001\u0000\u0000\u0000\u06af\u06b0\u0001\u0000\u0000\u0000"+
		"\u06b0\u06b1\u0001\u0000\u0000\u0000\u06b1\u06b2\u00051\u0000\u0000\u06b2"+
		"\u06bc\u0005\u0092\u0000\u0000\u06b3\u06b5\u0003\u0174\u00ba\u0000\u06b4"+
		"\u06b3\u0001\u0000\u0000\u0000\u06b4\u06b5\u0001\u0000\u0000\u0000\u06b5"+
		"\u06b7\u0001\u0000\u0000\u0000\u06b6\u06b8\u0003\u0154\u00aa\u0000\u06b7"+
		"\u06b6\u0001\u0000\u0000\u0000\u06b7\u06b8\u0001\u0000\u0000\u0000\u06b8"+
		"\u06b9\u0001\u0000\u0000\u0000\u06b9\u06ba\u00051\u0000\u0000\u06ba\u06bc"+
		"\u0005\u0091\u0000\u0000\u06bb\u06a5\u0001\u0000\u0000\u0000\u06bb\u06ac"+
		"\u0001\u0000\u0000\u0000\u06bb\u06b4\u0001\u0000\u0000\u0000\u06bc\u0127"+
		"\u0001\u0000\u0000\u0000\u06bd\u06be\u0003\u0094J\u0000\u06be\u0129\u0001"+
		"\u0000\u0000\u0000\u06bf\u06c1\u0003\u0174\u00ba\u0000\u06c0\u06bf\u0001"+
		"\u0000\u0000\u0000\u06c0\u06c1\u0001\u0000\u0000\u0000\u06c1\u06c2\u0001"+
		"\u0000\u0000\u0000\u06c2\u06c3\u00052\u0000\u0000\u06c3\u06c4\u0003\u0094"+
		"J\u0000\u06c4\u012b\u0001\u0000\u0000\u0000\u06c5\u06c7\u0003\u0174\u00ba"+
		"\u0000\u06c6\u06c5\u0001\u0000\u0000\u0000\u06c6\u06c7\u0001\u0000\u0000"+
		"\u0000\u06c7\u06c9\u0001\u0000\u0000\u0000\u06c8\u06ca\u0003\u0156\u00ab"+
		"\u0000\u06c9\u06c8\u0001\u0000\u0000\u0000\u06c9\u06ca\u0001\u0000\u0000"+
		"\u0000\u06ca\u06cb\u0001\u0000\u0000\u0000\u06cb\u06cc\u00053\u0000\u0000"+
		"\u06cc\u06ce\u0003\u01e2\u00f1\u0000\u06cd\u06cf\u0003\u0200\u0100\u0000"+
		"\u06ce\u06cd\u0001\u0000\u0000\u0000\u06ce\u06cf\u0001\u0000\u0000\u0000"+
		"\u06cf\u06d0\u0001\u0000\u0000\u0000\u06d0\u06d1\u0003\u012e\u0097\u0000"+
		"\u06d1\u06de\u0001\u0000\u0000\u0000\u06d2\u06d4\u0003\u0174\u00ba\u0000"+
		"\u06d3\u06d2\u0001\u0000\u0000\u0000\u06d3\u06d4\u0001\u0000\u0000\u0000"+
		"\u06d4\u06d6\u0001\u0000\u0000\u0000\u06d5\u06d7\u0003\u0156\u00ab\u0000"+
		"\u06d6\u06d5\u0001\u0000\u0000\u0000\u06d6\u06d7\u0001\u0000\u0000\u0000"+
		"\u06d7\u06d8\u0001\u0000\u0000\u0000\u06d8\u06d9\u00053\u0000\u0000\u06d9"+
		"\u06da\u0003\u01e2\u00f1\u0000\u06da\u06db\u0003~?\u0000\u06db\u06dc\u0003"+
		"\u012e\u0097\u0000\u06dc\u06de\u0001\u0000\u0000\u0000\u06dd\u06c6\u0001"+
		"\u0000\u0000\u0000\u06dd\u06d3\u0001\u0000\u0000\u0000\u06de\u012d\u0001"+
		"\u0000\u0000\u0000\u06df\u06e3\u0005\u0085\u0000\u0000\u06e0\u06e2\u0003"+
		"\u0130\u0098\u0000\u06e1\u06e0\u0001\u0000\u0000\u0000\u06e2\u06e5\u0001"+
		"\u0000\u0000\u0000\u06e3\u06e1\u0001\u0000\u0000\u0000\u06e3\u06e4\u0001"+
		"\u0000\u0000\u0000\u06e4\u06e6\u0001\u0000\u0000\u0000\u06e5\u06e3\u0001"+
		"\u0000\u0000\u0000\u06e6\u06e7\u0005\u0088\u0000\u0000\u06e7\u012f\u0001"+
		"\u0000\u0000\u0000\u06e8\u06eb\u0003\u008eG\u0000\u06e9\u06eb\u0003N\'"+
		"\u0000\u06ea\u06e8\u0001\u0000\u0000\u0000\u06ea\u06e9\u0001\u0000\u0000"+
		"\u0000\u06eb\u0131\u0001\u0000\u0000\u0000\u06ec\u06ed\u0003\u0134\u009a"+
		"\u0000\u06ed\u06ee\u0003\u0136\u009b\u0000\u06ee\u06ef\u0003\u0094J\u0000"+
		"\u06ef\u06f9\u0001\u0000\u0000\u0000\u06f0\u06f1\u0003\u0134\u009a\u0000"+
		"\u06f1\u06f2\u0003\u0136\u009b\u0000\u06f2\u06f3\u0003\u00acV\u0000\u06f3"+
		"\u06f9\u0001\u0000\u0000\u0000\u06f4\u06f5\u0003\u0134\u009a\u0000\u06f5"+
		"\u06f6\u0003\u0136\u009b\u0000\u06f6\u06f7\u0003\u00b4Z\u0000\u06f7\u06f9"+
		"\u0001\u0000\u0000\u0000\u06f8\u06ec\u0001\u0000\u0000\u0000\u06f8\u06f0"+
		"\u0001\u0000\u0000\u0000\u06f8\u06f4\u0001\u0000\u0000\u0000\u06f9\u0133"+
		"\u0001\u0000\u0000\u0000\u06fa\u06fc\u0003\u0174\u00ba\u0000\u06fb\u06fa"+
		"\u0001\u0000\u0000\u0000\u06fb\u06fc\u0001\u0000\u0000\u0000\u06fc\u06fe"+
		"\u0001\u0000\u0000\u0000\u06fd\u06ff\u0003\u0154\u00aa\u0000\u06fe\u06fd"+
		"\u0001\u0000\u0000\u0000\u06fe\u06ff\u0001\u0000\u0000\u0000\u06ff\u0700"+
		"\u0001\u0000\u0000\u0000\u0700\u0701\u00054\u0000\u0000\u0701\u0702\u0003"+
		"\u00d2i\u0000\u0702\u0135\u0001\u0000\u0000\u0000\u0703\u0705\u0003\u0218"+
		"\u010c\u0000\u0704\u0706\u0003\u0174\u00ba\u0000\u0705\u0704\u0001\u0000"+
		"\u0000\u0000\u0705\u0706\u0001\u0000\u0000\u0000\u0706\u0707\u0001\u0000"+
		"\u0000\u0000\u0707\u0708\u0003\u01de\u00ef\u0000\u0708\u0137\u0001\u0000"+
		"\u0000\u0000\u0709\u070d\u0003\u013a\u009d\u0000\u070a\u070d\u0003\u013c"+
		"\u009e\u0000\u070b\u070d\u0003\u013e\u009f\u0000\u070c\u0709\u0001\u0000"+
		"\u0000\u0000\u070c\u070a\u0001\u0000\u0000\u0000\u070c\u070b\u0001\u0000"+
		"\u0000\u0000\u070d\u0139\u0001\u0000\u0000\u0000\u070e\u070f\u00055\u0000"+
		"\u0000\u070f\u0710\u00056\u0000\u0000\u0710\u0711\u0003\u0224\u0112\u0000"+
		"\u0711\u013b\u0001\u0000\u0000\u0000\u0712\u0713\u00057\u0000\u0000\u0713"+
		"\u0714\u00056\u0000\u0000\u0714\u0715\u0003\u0224\u0112\u0000\u0715\u013d"+
		"\u0001\u0000\u0000\u0000\u0716\u0717\u00058\u0000\u0000\u0717\u0718\u0005"+
		"6\u0000\u0000\u0718\u071a\u0003\u0224\u0112\u0000\u0719\u071b\u0003\u0140"+
		"\u00a0\u0000\u071a\u0719\u0001\u0000\u0000\u0000\u071a\u071b\u0001\u0000"+
		"\u0000\u0000\u071b\u013f\u0001\u0000\u0000\u0000\u071c\u071d\u0005\u008c"+
		"\u0000\u0000\u071d\u071e\u0003\u0150\u00a8\u0000\u071e\u0141\u0001\u0000"+
		"\u0000\u0000\u071f\u0720\u00059\u0000\u0000\u0720\u0721\u0003\u0150\u00a8"+
		"\u0000\u0721\u0725\u0005\u0085\u0000\u0000\u0722\u0724\u0003\u0144\u00a2"+
		"\u0000\u0723\u0722\u0001\u0000\u0000\u0000\u0724\u0727\u0001\u0000\u0000"+
		"\u0000\u0725\u0723\u0001\u0000\u0000\u0000\u0725\u0726\u0001\u0000\u0000"+
		"\u0000\u0726\u0728\u0001\u0000\u0000\u0000\u0727\u0725\u0001\u0000\u0000"+
		"\u0000\u0728\u0729\u0005\u0088\u0000\u0000\u0729\u0143\u0001\u0000\u0000"+
		"\u0000\u072a\u072e\u0003\u0146\u00a3\u0000\u072b\u072e\u0003\u0148\u00a4"+
		"\u0000\u072c\u072e\u0003\u014a\u00a5\u0000\u072d\u072a\u0001\u0000\u0000"+
		"\u0000\u072d\u072b\u0001\u0000\u0000\u0000\u072d\u072c\u0001\u0000\u0000"+
		"\u0000\u072e\u0145\u0001\u0000\u0000\u0000\u072f\u0730\u0005:\u0000\u0000"+
		"\u0730\u0731\u0005\u008c\u0000\u0000\u0731\u0736\u0003\u014e\u00a7\u0000"+
		"\u0732\u0733\u0005;\u0000\u0000\u0733\u0734\u0005\u008c\u0000\u0000\u0734"+
		"\u0736\u0003\u014e\u00a7\u0000\u0735\u072f\u0001\u0000\u0000\u0000\u0735"+
		"\u0732\u0001\u0000\u0000\u0000\u0736\u0147\u0001\u0000\u0000\u0000\u0737"+
		"\u0738\u0005<\u0000\u0000\u0738\u0739\u0005\u008c\u0000\u0000\u0739\u073a"+
		"\u0003\u0232\u0119\u0000\u073a\u0149\u0001\u0000\u0000\u0000\u073b\u073c"+
		"\u0005=\u0000\u0000\u073c\u073d\u0005\u008c\u0000\u0000\u073d\u073e\u0003"+
		"\u014c\u00a6\u0000\u073e\u014b\u0001\u0000\u0000\u0000\u073f\u0740\u0007"+
		"\u0002\u0000\u0000\u0740\u014d\u0001\u0000\u0000\u0000\u0741\u0746\u0003"+
		"\u0150\u00a8\u0000\u0742\u0743\u0005\u008b\u0000\u0000\u0743\u0745\u0003"+
		"\u0150\u00a8\u0000\u0744\u0742\u0001\u0000\u0000\u0000\u0745\u0748\u0001"+
		"\u0000\u0000\u0000\u0746\u0744\u0001\u0000\u0000\u0000\u0746\u0747\u0001"+
		"\u0000\u0000\u0000\u0747\u014f\u0001\u0000\u0000\u0000\u0748\u0746\u0001"+
		"\u0000\u0000\u0000\u0749\u074a\u0003\u0206\u0103\u0000\u074a\u0151\u0001"+
		"\u0000\u0000\u0000\u074b\u0764\u0005$\u0000\u0000\u074c\u0764\u0005A\u0000"+
		"\u0000\u074d\u0764\u0005B\u0000\u0000\u074e\u0764\u0005/\u0000\u0000\u074f"+
		"\u0764\u00058\u0000\u0000\u0750\u0764\u0005C\u0000\u0000\u0751\u0764\u0005"+
		"D\u0000\u0000\u0752\u0764\u0005E\u0000\u0000\u0753\u0764\u00057\u0000"+
		"\u0000\u0754\u0764\u00055\u0000\u0000\u0755\u0764\u0005F\u0000\u0000\u0756"+
		"\u0764\u0005G\u0000\u0000\u0757\u0764\u0005H\u0000\u0000\u0758\u0759\u0005"+
		"H\u0000\u0000\u0759\u075a\u0005\u0086\u0000\u0000\u075a\u075b\u0005I\u0000"+
		"\u0000\u075b\u0764\u0005\u0089\u0000\u0000\u075c\u075d\u0005H\u0000\u0000"+
		"\u075d\u075e\u0005\u0086\u0000\u0000\u075e\u075f\u0005J\u0000\u0000\u075f"+
		"\u0764\u0005\u0089\u0000\u0000\u0760\u0764\u0005K\u0000\u0000\u0761\u0764"+
		"\u0003\u0156\u00ab\u0000\u0762\u0764\u0003\u0158\u00ac\u0000\u0763\u074b"+
		"\u0001\u0000\u0000\u0000\u0763\u074c\u0001\u0000\u0000\u0000\u0763\u074d"+
		"\u0001\u0000\u0000\u0000\u0763\u074e\u0001\u0000\u0000\u0000\u0763\u074f"+
		"\u0001\u0000\u0000\u0000\u0763\u0750\u0001\u0000\u0000\u0000\u0763\u0751"+
		"\u0001\u0000\u0000\u0000\u0763\u0752\u0001\u0000\u0000\u0000\u0763\u0753"+
		"\u0001\u0000\u0000\u0000\u0763\u0754\u0001\u0000\u0000\u0000\u0763\u0755"+
		"\u0001\u0000\u0000\u0000\u0763\u0756\u0001\u0000\u0000\u0000\u0763\u0757"+
		"\u0001\u0000\u0000\u0000\u0763\u0758\u0001\u0000\u0000\u0000\u0763\u075c"+
		"\u0001\u0000\u0000\u0000\u0763\u0760\u0001\u0000\u0000\u0000\u0763\u0761"+
		"\u0001\u0000\u0000\u0000\u0763\u0762\u0001\u0000\u0000\u0000\u0764\u0153"+
		"\u0001\u0000\u0000\u0000\u0765\u0767\u0003\u0152\u00a9\u0000\u0766\u0765"+
		"\u0001\u0000\u0000\u0000\u0767\u0768\u0001\u0000\u0000\u0000\u0768\u0766"+
		"\u0001\u0000\u0000\u0000\u0768\u0769\u0001\u0000\u0000\u0000\u0769\u0155"+
		"\u0001\u0000\u0000\u0000\u076a\u0784\u0005L\u0000\u0000\u076b\u076c\u0005"+
		"L\u0000\u0000\u076c\u076d\u0005\u0086\u0000\u0000\u076d\u076e\u0005)\u0000"+
		"\u0000\u076e\u0784\u0005\u0089\u0000\u0000\u076f\u0784\u0005M\u0000\u0000"+
		"\u0770\u0771\u0005M\u0000\u0000\u0771\u0772\u0005\u0086\u0000\u0000\u0772"+
		"\u0773\u0005)\u0000\u0000\u0773\u0784\u0005\u0089\u0000\u0000\u0774\u0784"+
		"\u0005N\u0000\u0000\u0775\u0776\u0005N\u0000\u0000\u0776\u0777\u0005\u0086"+
		"\u0000\u0000\u0777\u0778\u0005)\u0000\u0000\u0778\u0784\u0005\u0089\u0000"+
		"\u0000\u0779\u0784\u0005O\u0000\u0000\u077a\u077b\u0005O\u0000\u0000\u077b"+
		"\u077c\u0005\u0086\u0000\u0000\u077c\u077d\u0005)\u0000\u0000\u077d\u0784"+
		"\u0005\u0089\u0000\u0000\u077e\u0784\u0005P\u0000\u0000\u077f\u0780\u0005"+
		"P\u0000\u0000\u0780\u0781\u0005\u0086\u0000\u0000\u0781\u0782\u0005)\u0000"+
		"\u0000\u0782\u0784\u0005\u0089\u0000\u0000\u0783\u076a\u0001\u0000\u0000"+
		"\u0000\u0783\u076b\u0001\u0000\u0000\u0000\u0783\u076f\u0001\u0000\u0000"+
		"\u0000\u0783\u0770\u0001\u0000\u0000\u0000\u0783\u0774\u0001\u0000\u0000"+
		"\u0000\u0783\u0775\u0001\u0000\u0000\u0000\u0783\u0779\u0001\u0000\u0000"+
		"\u0000\u0783\u077a\u0001\u0000\u0000\u0000\u0783\u077e\u0001\u0000\u0000"+
		"\u0000\u0783\u077f\u0001\u0000\u0000\u0000\u0784\u0157\u0001\u0000\u0000"+
		"\u0000\u0785\u0786\u0007\u0003\u0000\u0000\u0786\u0159\u0001\u0000\u0000"+
		"\u0000\u0787\u0788\u0006\u00ad\uffff\uffff\u0000\u0788\u078a\u0003\u015c"+
		"\u00ae\u0000\u0789\u078b\u0003\u01e0\u00f0\u0000\u078a\u0789\u0001\u0000"+
		"\u0000\u0000\u078a\u078b\u0001\u0000\u0000\u0000\u078b\u079b\u0001\u0000"+
		"\u0000\u0000\u078c\u078e\u0003\u015e\u00af\u0000\u078d\u078f\u0003\u01e0"+
		"\u00f0\u0000\u078e\u078d\u0001\u0000\u0000\u0000\u078e\u078f\u0001\u0000"+
		"\u0000\u0000\u078f\u079b\u0001\u0000\u0000\u0000\u0790\u079b\u0003\u0160"+
		"\u00b0\u0000\u0791\u0793\u0003\u0162\u00b1\u0000\u0792\u0794\u0003\u01e0"+
		"\u00f0\u0000\u0793\u0792\u0001\u0000\u0000\u0000\u0793\u0794\u0001\u0000"+
		"\u0000\u0000\u0794\u079b\u0001\u0000\u0000\u0000\u0795\u079b\u0003\u0168"+
		"\u00b4\u0000\u0796\u079b\u0003\u016a\u00b5\u0000\u0797\u0798\u0005S\u0000"+
		"\u0000\u0798\u079b\u0003\u01de\u00ef\u0000\u0799\u079b\u0003\u016c\u00b6"+
		"\u0000\u079a\u0787\u0001\u0000\u0000\u0000\u079a\u078c\u0001\u0000\u0000"+
		"\u0000\u079a\u0790\u0001\u0000\u0000\u0000\u079a\u0791\u0001\u0000\u0000"+
		"\u0000\u079a\u0795\u0001\u0000\u0000\u0000\u079a\u0796\u0001\u0000\u0000"+
		"\u0000\u079a\u0797\u0001\u0000\u0000\u0000\u079a\u0799\u0001\u0000\u0000"+
		"\u0000\u079b\u07a1\u0001\u0000\u0000\u0000\u079c\u079d\n\u0002\u0000\u0000"+
		"\u079d\u079e\u0005T\u0000\u0000\u079e\u07a0\u0003\u01de\u00ef\u0000\u079f"+
		"\u079c\u0001\u0000\u0000\u0000\u07a0\u07a3\u0001\u0000\u0000\u0000\u07a1"+
		"\u079f\u0001\u0000\u0000\u0000\u07a1\u07a2\u0001\u0000\u0000\u0000\u07a2"+
		"\u015b\u0001\u0000\u0000\u0000\u07a3\u07a1\u0001\u0000\u0000\u0000\u07a4"+
		"\u07a5\u0005\u0090\u0000\u0000\u07a5\u015d\u0001\u0000\u0000\u0000\u07a6"+
		"\u07a7\u0003\u0206\u0103\u0000\u07a7\u015f\u0001\u0000\u0000\u0000\u07a8"+
		"\u07a9\u0005\u0006\u0000\u0000\u07a9\u07ad\u0003\u015a\u00ad\u0000\u07aa"+
		"\u07ab\u0005\u0005\u0000\u0000\u07ab\u07ad\u0003\u015a\u00ad\u0000\u07ac"+
		"\u07a8\u0001\u0000\u0000\u0000\u07ac\u07aa\u0001\u0000\u0000\u0000\u07ad"+
		"\u0161\u0001\u0000\u0000\u0000\u07ae\u07b0\u0005\u0086\u0000\u0000\u07af"+
		"\u07b1\u0003\u0164\u00b2\u0000\u07b0\u07af\u0001\u0000\u0000\u0000\u07b0"+
		"\u07b1\u0001\u0000\u0000\u0000\u07b1\u07b2\u0001\u0000\u0000\u0000\u07b2"+
		"\u07b3\u0005\u0089\u0000\u0000\u07b3\u0163\u0001\u0000\u0000\u0000\u07b4"+
		"\u07b9\u0003\u0166\u00b3\u0000\u07b5\u07b6\u0005\u008b\u0000\u0000\u07b6"+
		"\u07b8\u0003\u0166\u00b3\u0000\u07b7\u07b5\u0001\u0000\u0000\u0000\u07b8"+
		"\u07bb\u0001\u0000\u0000\u0000\u07b9\u07b7\u0001\u0000\u0000\u0000\u07b9"+
		"\u07ba\u0001\u0000\u0000\u0000\u07ba\u0165\u0001\u0000\u0000\u0000\u07bb"+
		"\u07b9\u0001\u0000\u0000\u0000\u07bc\u07bd\u0003\u015a\u00ad\u0000\u07bd"+
		"\u0167\u0001\u0000\u0000\u0000\u07be\u07c0\u0003\u01e2\u00f1\u0000\u07bf"+
		"\u07be\u0001\u0000\u0000\u0000\u07bf\u07c0\u0001\u0000\u0000\u0000\u07c0"+
		"\u07c1\u0001\u0000\u0000\u0000\u07c1\u07c2\u0005\u0084\u0000\u0000\u07c2"+
		"\u07c4\u0003\u00eew\u0000\u07c3\u07c5\u0003\u0162\u00b1\u0000\u07c4\u07c3"+
		"\u0001\u0000\u0000\u0000\u07c4\u07c5\u0001\u0000\u0000\u0000\u07c5\u0169"+
		"\u0001\u0000\u0000\u0000\u07c6\u07c7\u0003\u015e\u00af\u0000\u07c7\u07c8"+
		"\u0005\u0092\u0000\u0000\u07c8\u016b\u0001\u0000\u0000\u0000\u07c9\u07ca"+
		"\u0003\u017c\u00be\u0000\u07ca\u016d\u0001\u0000\u0000\u0000\u07cb\u07cc"+
		"\u0005\u0093\u0000\u0000\u07cc\u07ce\u0003\u0170\u00b8\u0000\u07cd\u07cf"+
		"\u0003\u0172\u00b9\u0000\u07ce\u07cd\u0001\u0000\u0000\u0000\u07ce\u07cf"+
		"\u0001\u0000\u0000\u0000\u07cf\u016f\u0001\u0000\u0000\u0000\u07d0\u07d1"+
		"\u0003\u0206\u0103\u0000\u07d1\u0171\u0001\u0000\u0000\u0000\u07d2\u07d3"+
		"\u0005\u0086\u0000\u0000\u07d3\u07d4\u0003\u0176\u00bb\u0000\u07d4\u07d5"+
		"\u0005\u0089\u0000\u0000\u07d5\u0173\u0001\u0000\u0000\u0000\u07d6\u07d8"+
		"\u0003\u016e\u00b7\u0000\u07d7\u07d6\u0001\u0000\u0000\u0000\u07d8\u07d9"+
		"\u0001\u0000\u0000\u0000\u07d9\u07d7\u0001\u0000\u0000\u0000\u07d9\u07da"+
		"\u0001\u0000\u0000\u0000\u07da\u0175\u0001\u0000\u0000\u0000\u07db\u07dd"+
		"\u0003\u0178\u00bc\u0000\u07dc\u07db\u0001\u0000\u0000\u0000\u07dd\u07e0"+
		"\u0001\u0000\u0000\u0000\u07de\u07dc\u0001\u0000\u0000\u0000\u07de\u07df"+
		"\u0001\u0000\u0000\u0000\u07df\u0177\u0001\u0000\u0000\u0000\u07e0\u07de"+
		"\u0001\u0000\u0000\u0000\u07e1\u07e2\u0005\u0086\u0000\u0000\u07e2\u07e3"+
		"\u0003\u0176\u00bb\u0000\u07e3\u07e4\u0005\u0089\u0000\u0000\u07e4\u07f3"+
		"\u0001\u0000\u0000\u0000\u07e5\u07e6\u0005\u0087\u0000\u0000\u07e6\u07e7"+
		"\u0003\u0176\u00bb\u0000\u07e7\u07e8\u0005\u008a\u0000\u0000\u07e8\u07f3"+
		"\u0001\u0000\u0000\u0000\u07e9\u07ea\u0005\u0085\u0000\u0000\u07ea\u07eb"+
		"\u0003\u0176\u00bb\u0000\u07eb\u07ec\u0005\u0088\u0000\u0000\u07ec\u07f3"+
		"\u0001\u0000\u0000\u0000\u07ed\u07f3\u0003\u0208\u0104\u0000\u07ee\u07f3"+
		"\u0003\u022e\u0117\u0000\u07ef\u07f3\u0003\u0224\u0112\u0000\u07f0\u07f3"+
		"\u0005\u0082\u0000\u0000\u07f1\u07f3\u0003\u017a\u00bd\u0000\u07f2\u07e1"+
		"\u0001\u0000\u0000\u0000\u07f2\u07e5\u0001\u0000\u0000\u0000\u07f2\u07e9"+
		"\u0001\u0000\u0000\u0000\u07f2\u07ed\u0001\u0000\u0000\u0000\u07f2\u07ee"+
		"\u0001\u0000\u0000\u0000\u07f2\u07ef\u0001\u0000\u0000\u0000\u07f2\u07f0"+
		"\u0001\u0000\u0000\u0000\u07f2\u07f1\u0001\u0000\u0000\u0000\u07f3\u0179"+
		"\u0001\u0000\u0000\u0000\u07f4\u07fb\u0007\u0004\u0000\u0000\u07f5\u07fb"+
		"\u0003\u0218\u010c\u0000\u07f6\u07f7\u0004\u00bd\u0004\u0000\u07f7\u07fb"+
		"\u0005\u0094\u0000\u0000\u07f8\u07f9\u0004\u00bd\u0005\u0000\u07f9\u07fb"+
		"\u0005\u0091\u0000\u0000\u07fa\u07f4\u0001\u0000\u0000\u0000\u07fa\u07f5"+
		"\u0001\u0000\u0000\u0000\u07fa\u07f6\u0001\u0000\u0000\u0000\u07fa\u07f8"+
		"\u0001\u0000\u0000\u0000\u07fb\u017b\u0001\u0000\u0000\u0000\u07fc\u07fe"+
		"\u0003\u0184\u00c2\u0000\u07fd\u07fc\u0001\u0000\u0000\u0000\u07fd\u07fe"+
		"\u0001\u0000\u0000\u0000\u07fe\u07ff\u0001\u0000\u0000\u0000\u07ff\u0801"+
		"\u0003\u0180\u00c0\u0000\u0800\u0802\u0003\u0188\u00c4\u0000\u0801\u0800"+
		"\u0001\u0000\u0000\u0000\u0801\u0802\u0001\u0000\u0000\u0000\u0802\u017d"+
		"\u0001\u0000\u0000\u0000\u0803\u0808\u0003\u017c\u00be\u0000\u0804\u0805"+
		"\u0005\u008b\u0000\u0000\u0805\u0807\u0003\u017c\u00be\u0000\u0806\u0804"+
		"\u0001\u0000\u0000\u0000\u0807\u080a\u0001\u0000\u0000\u0000\u0808\u0806"+
		"\u0001\u0000\u0000\u0000\u0808\u0809\u0001\u0000\u0000\u0000\u0809\u017f"+
		"\u0001\u0000\u0000\u0000\u080a\u0808\u0001\u0000\u0000\u0000\u080b\u080c"+
		"\u0003\u0220\u0110\u0000\u080c\u080d\u0003\u01ce\u00e7\u0000\u080d\u0811"+
		"\u0001\u0000\u0000\u0000\u080e\u0811\u0003\u01ce\u00e7\u0000\u080f\u0811"+
		"\u0003\u0182\u00c1\u0000\u0810\u080b\u0001\u0000\u0000\u0000\u0810\u080e"+
		"\u0001\u0000\u0000\u0000\u0810\u080f\u0001\u0000\u0000\u0000\u0811\u0181"+
		"\u0001\u0000\u0000\u0000\u0812\u0813\u0005\u0094\u0000\u0000\u0813\u0814"+
		"\u0003\u0206\u0103\u0000\u0814\u0183\u0001\u0000\u0000\u0000\u0815\u0816"+
		"\u0005W\u0000\u0000\u0816\u081b\u0005\u0092\u0000\u0000\u0817\u0818\u0005"+
		"W\u0000\u0000\u0818\u081b\u0005\u0091\u0000\u0000\u0819\u081b\u0005W\u0000"+
		"\u0000\u081a\u0815\u0001\u0000\u0000\u0000\u081a\u0817\u0001\u0000\u0000"+
		"\u0000\u081a\u0819\u0001\u0000\u0000\u0000\u081b\u0185\u0001\u0000\u0000"+
		"\u0000\u081c\u081d\u0003\u021e\u010f\u0000\u081d\u081e\u0003\u0180\u00c0"+
		"\u0000\u081e\u082d\u0001\u0000\u0000\u0000\u081f\u0821\u0003\u020e\u0107"+
		"\u0000\u0820\u0822\u0003\u0184\u00c2\u0000\u0821\u0820\u0001\u0000\u0000"+
		"\u0000\u0821\u0822\u0001\u0000\u0000\u0000\u0822\u0823\u0001\u0000\u0000"+
		"\u0000\u0823\u0824\u0003\u0180\u00c0\u0000\u0824\u082d\u0001\u0000\u0000"+
		"\u0000\u0825\u0827\u0003\u018a\u00c5\u0000\u0826\u0828\u0003\u0184\u00c2"+
		"\u0000\u0827\u0826\u0001\u0000\u0000\u0000\u0827\u0828\u0001\u0000\u0000"+
		"\u0000\u0828\u0829\u0001\u0000\u0000\u0000\u0829\u082a\u0003\u0180\u00c0"+
		"\u0000\u082a\u082d\u0001\u0000\u0000\u0000\u082b\u082d\u0003\u018c\u00c6"+
		"\u0000\u082c\u081c\u0001\u0000\u0000\u0000\u082c\u081f\u0001\u0000\u0000"+
		"\u0000\u082c\u0825\u0001\u0000\u0000\u0000\u082c\u082b\u0001\u0000\u0000"+
		"\u0000\u082d\u0187\u0001\u0000\u0000\u0000\u082e\u0830\u0003\u0186\u00c3"+
		"\u0000\u082f\u082e\u0001\u0000\u0000\u0000\u0830\u0831\u0001\u0000\u0000"+
		"\u0000\u0831\u082f\u0001\u0000\u0000\u0000\u0831\u0832\u0001\u0000\u0000"+
		"\u0000\u0832\u0189\u0001\u0000\u0000\u0000\u0833\u0835\u0005\u0092\u0000"+
		"\u0000\u0834\u0836\u0003\u0184\u00c2\u0000\u0835\u0834\u0001\u0000\u0000"+
		"\u0000\u0835\u0836\u0001\u0000\u0000\u0000\u0836\u0837\u0001\u0000\u0000"+
		"\u0000\u0837\u0838\u0003\u017c\u00be\u0000\u0838\u0839\u0005\u008c\u0000"+
		"\u0000\u0839\u018b\u0001\u0000\u0000\u0000\u083a\u083b\u0005S\u0000\u0000"+
		"\u083b\u0845\u0003\u01de\u00ef\u0000\u083c\u083d\u0005T\u0000\u0000\u083d"+
		"\u0845\u0003\u01de\u00ef\u0000\u083e\u083f\u0005T\u0000\u0000\u083f\u0840"+
		"\u0005\u0092\u0000\u0000\u0840\u0845\u0003\u01de\u00ef\u0000\u0841\u0842"+
		"\u0005T\u0000\u0000\u0842\u0843\u0005\u0091\u0000\u0000\u0843\u0845\u0003"+
		"\u01de\u00ef\u0000\u0844\u083a\u0001\u0000\u0000\u0000\u0844\u083c\u0001"+
		"\u0000\u0000\u0000\u0844\u083e\u0001\u0000\u0000\u0000\u0844\u0841\u0001"+
		"\u0000\u0000\u0000\u0845\u018d\u0001\u0000\u0000\u0000\u0846\u0848\u0003"+
		"\u0206\u0103\u0000\u0847\u0849\u0003\u0088D\u0000\u0848\u0847\u0001\u0000"+
		"\u0000\u0000\u0848\u0849\u0001\u0000\u0000\u0000\u0849\u0855\u0001\u0000"+
		"\u0000\u0000\u084a\u0855\u0003\u0190\u00c8\u0000\u084b\u0855\u0003\u01a0"+
		"\u00d0\u0000\u084c\u0855\u0003\u01a2\u00d1\u0000\u084d\u0855\u0003\u01aa"+
		"\u00d5\u0000\u084e\u0855\u0003\u01c2\u00e1\u0000\u084f\u0855\u0003\u01c4"+
		"\u00e2\u0000\u0850\u0855\u0003\u01c0\u00e0\u0000\u0851\u0855\u0003\u01c8"+
		"\u00e4\u0000\u0852\u0855\u0003\u01ca\u00e5\u0000\u0853\u0855\u0003\u01cc"+
		"\u00e6\u0000\u0854\u0846\u0001\u0000\u0000\u0000\u0854\u084a\u0001\u0000"+
		"\u0000\u0000\u0854\u084b\u0001\u0000\u0000\u0000\u0854\u084c\u0001\u0000"+
		"\u0000\u0000\u0854\u084d\u0001\u0000\u0000\u0000\u0854\u084e\u0001\u0000"+
		"\u0000\u0000\u0854\u084f\u0001\u0000\u0000\u0000\u0854\u0850\u0001\u0000"+
		"\u0000\u0000\u0854\u0851\u0001\u0000\u0000\u0000\u0854\u0852\u0001\u0000"+
		"\u0000\u0000\u0854\u0853\u0001\u0000\u0000\u0000\u0855\u018f\u0001\u0000"+
		"\u0000\u0000\u0856\u085f\u0003\u022e\u0117\u0000\u0857\u085f\u0003\u0192"+
		"\u00c9\u0000\u0858\u085f\u0003\u0198\u00cc\u0000\u0859\u085f\u0005X\u0000"+
		"\u0000\u085a\u085f\u0005Y\u0000\u0000\u085b\u085f\u0005Z\u0000\u0000\u085c"+
		"\u085f\u0005[\u0000\u0000\u085d\u085f\u0005\\\u0000\u0000\u085e\u0856"+
		"\u0001\u0000\u0000\u0000\u085e\u0857\u0001\u0000\u0000\u0000\u085e\u0858"+
		"\u0001\u0000\u0000\u0000\u085e\u0859\u0001\u0000\u0000\u0000\u085e\u085a"+
		"\u0001\u0000\u0000\u0000\u085e\u085b\u0001\u0000\u0000\u0000\u085e\u085c"+
		"\u0001\u0000\u0000\u0000\u085e\u085d\u0001\u0000\u0000\u0000\u085f\u0191"+
		"\u0001\u0000\u0000\u0000\u0860\u0862\u0005\u0087\u0000\u0000\u0861\u0863"+
		"\u0003\u0194\u00ca\u0000\u0862\u0861\u0001\u0000\u0000\u0000\u0862\u0863"+
		"\u0001\u0000\u0000\u0000\u0863\u0864\u0001\u0000\u0000\u0000\u0864\u0865"+
		"\u0005\u008a\u0000\u0000\u0865\u0193\u0001\u0000\u0000\u0000\u0866\u0868"+
		"\u0003\u0196\u00cb\u0000\u0867\u0869\u0005\u008b\u0000\u0000\u0868\u0867"+
		"\u0001\u0000\u0000\u0000\u0868\u0869\u0001\u0000\u0000\u0000\u0869\u086f"+
		"\u0001\u0000\u0000\u0000\u086a\u086b\u0003\u0196\u00cb\u0000\u086b\u086c"+
		"\u0005\u008b\u0000\u0000\u086c\u086d\u0003\u0194\u00ca\u0000\u086d\u086f"+
		"\u0001\u0000\u0000\u0000\u086e\u0866\u0001\u0000\u0000\u0000\u086e\u086a"+
		"\u0001\u0000\u0000\u0000\u086f\u0195\u0001\u0000\u0000\u0000\u0870\u0871"+
		"\u0003\u017c\u00be\u0000\u0871\u0197\u0001\u0000\u0000\u0000\u0872\u0873"+
		"\u0005\u0087\u0000\u0000\u0873\u0874\u0003\u019a\u00cd\u0000\u0874\u0875"+
		"\u0005\u008a\u0000\u0000\u0875\u087a\u0001\u0000\u0000\u0000\u0876\u0877"+
		"\u0005\u0087\u0000\u0000\u0877\u0878\u0005\u008c\u0000\u0000\u0878\u087a"+
		"\u0005\u008a\u0000\u0000\u0879\u0872\u0001\u0000\u0000\u0000\u0879\u0876"+
		"\u0001\u0000\u0000\u0000\u087a\u0199\u0001\u0000\u0000\u0000\u087b\u087d"+
		"\u0003\u019c\u00ce\u0000\u087c\u087e\u0005\u008b\u0000\u0000\u087d\u087c"+
		"\u0001\u0000\u0000\u0000\u087d\u087e\u0001\u0000\u0000\u0000\u087e\u0884"+
		"\u0001\u0000\u0000\u0000\u087f\u0880\u0003\u019c\u00ce\u0000\u0880\u0881"+
		"\u0005\u008b\u0000\u0000\u0881\u0882\u0003\u019a\u00cd\u0000\u0882\u0884"+
		"\u0001\u0000\u0000\u0000\u0883\u087b\u0001\u0000\u0000\u0000\u0883\u087f"+
		"\u0001\u0000\u0000\u0000\u0884\u019b\u0001\u0000\u0000\u0000\u0885\u0886"+
		"\u0003\u017c\u00be\u0000\u0886\u0887\u0005\u008c\u0000\u0000\u0887\u0888"+
		"\u0003\u017c\u00be\u0000\u0888\u019d\u0001\u0000\u0000\u0000\u0889\u088a"+
		"\u0005]\u0000\u0000\u088a\u088b\u0005\u0086\u0000\u0000\u088b\u088c\u0005"+
		"^\u0000\u0000\u088c\u088d\u0005\u008c\u0000\u0000\u088d\u088e\u0003\u017c"+
		"\u00be\u0000\u088e\u088f\u0005\u008b\u0000\u0000\u088f\u0890\u0005_\u0000"+
		"\u0000\u0890\u0891\u0005\u008c\u0000\u0000\u0891\u0892\u0003\u017c\u00be"+
		"\u0000\u0892\u0893\u0005\u008b\u0000\u0000\u0893\u0894\u0005`\u0000\u0000"+
		"\u0894\u0895\u0005\u008c\u0000\u0000\u0895\u0896\u0003\u017c\u00be\u0000"+
		"\u0896\u0897\u0005\u008b\u0000\u0000\u0897\u0898\u0005a\u0000\u0000\u0898"+
		"\u0899\u0005\u008c\u0000\u0000\u0899\u089a\u0003\u017c\u00be\u0000\u089a"+
		"\u089b\u0005\u0089\u0000\u0000\u089b\u08ab\u0001\u0000\u0000\u0000\u089c"+
		"\u089d\u0005b\u0000\u0000\u089d\u089e\u0005\u0086\u0000\u0000\u089e\u089f"+
		"\u0005c\u0000\u0000\u089f\u08a0\u0005\u008c\u0000\u0000\u08a0\u08a1\u0003"+
		"\u017c\u00be\u0000\u08a1\u08a2\u0005\u0089\u0000\u0000\u08a2\u08ab\u0001"+
		"\u0000\u0000\u0000\u08a3\u08a4\u0005d\u0000\u0000\u08a4\u08a5\u0005\u0086"+
		"\u0000\u0000\u08a5\u08a6\u0005c\u0000\u0000\u08a6\u08a7\u0005\u008c\u0000"+
		"\u0000\u08a7\u08a8\u0003\u017c\u00be\u0000\u08a8\u08a9\u0005\u0089\u0000"+
		"\u0000\u08a9\u08ab\u0001\u0000\u0000\u0000\u08aa\u0889\u0001\u0000\u0000"+
		"\u0000\u08aa\u089c\u0001\u0000\u0000\u0000\u08aa\u08a3\u0001\u0000\u0000"+
		"\u0000\u08ab\u019f\u0001\u0000\u0000\u0000\u08ac\u08c0\u0005e\u0000\u0000"+
		"\u08ad\u08ae\u0005e\u0000\u0000\u08ae\u08af\u0005\u0084\u0000\u0000\u08af"+
		"\u08c0\u0003\u0206\u0103\u0000\u08b0\u08b1\u0005e\u0000\u0000\u08b1\u08b2"+
		"\u0005\u0087\u0000\u0000\u08b2\u08b3\u0003\u017e\u00bf\u0000\u08b3\u08b4"+
		"\u0005\u008a\u0000\u0000\u08b4\u08c0\u0001\u0000\u0000\u0000\u08b5\u08b6"+
		"\u0005e\u0000\u0000\u08b6\u08b7\u0005\u0084\u0000\u0000\u08b7\u08c0\u0005"+
		"1\u0000\u0000\u08b8\u08c0\u0005f\u0000\u0000\u08b9\u08ba\u0005f\u0000"+
		"\u0000\u08ba\u08bb\u0005\u0084\u0000\u0000\u08bb\u08c0\u0003\u0206\u0103"+
		"\u0000\u08bc\u08bd\u0005f\u0000\u0000\u08bd\u08be\u0005\u0084\u0000\u0000"+
		"\u08be\u08c0\u00051\u0000\u0000\u08bf\u08ac\u0001\u0000\u0000\u0000\u08bf"+
		"\u08ad\u0001\u0000\u0000\u0000\u08bf\u08b0\u0001\u0000\u0000\u0000\u08bf"+
		"\u08b5\u0001\u0000\u0000\u0000\u08bf\u08b8\u0001\u0000\u0000\u0000\u08bf"+
		"\u08b9\u0001\u0000\u0000\u0000\u08bf\u08bc\u0001\u0000\u0000\u0000\u08c0"+
		"\u01a1\u0001\u0000\u0000\u0000\u08c1\u08c5\u0003\u01a4\u00d2\u0000\u08c2"+
		"\u08c5\u0003\u01a6\u00d3\u0000\u08c3\u08c5\u0003\u01a8\u00d4\u0000\u08c4"+
		"\u08c1\u0001\u0000\u0000\u0000\u08c4\u08c2\u0001\u0000\u0000\u0000\u08c4"+
		"\u08c3\u0001\u0000\u0000\u0000\u08c5\u01a3\u0001\u0000\u0000\u0000\u08c6"+
		"\u08c7\u0005g\u0000\u0000\u08c7\u08c8\u0005\u0084\u0000\u0000\u08c8\u08c9"+
		"\u0003\u0206\u0103\u0000\u08c9\u01a5\u0001\u0000\u0000\u0000\u08ca\u08cb"+
		"\u0005g\u0000\u0000\u08cb\u08cc\u0005\u0087\u0000\u0000\u08cc\u08cd\u0003"+
		"\u017c\u00be\u0000\u08cd\u08ce\u0005\u008a\u0000\u0000\u08ce\u01a7\u0001"+
		"\u0000\u0000\u0000\u08cf\u08d0\u0005g\u0000\u0000\u08d0\u08d1\u0005\u0084"+
		"\u0000\u0000\u08d1\u08d2\u00051\u0000\u0000\u08d2\u01a9\u0001\u0000\u0000"+
		"\u0000\u08d3\u08d5\u0005\u0085\u0000\u0000\u08d4\u08d6\u0003\u01ac\u00d6"+
		"\u0000\u08d5\u08d4\u0001\u0000\u0000\u0000\u08d5\u08d6\u0001\u0000\u0000"+
		"\u0000\u08d6\u08d8\u0001\u0000\u0000\u0000\u08d7\u08d9\u0003\u0004\u0002"+
		"\u0000\u08d8\u08d7\u0001\u0000\u0000\u0000\u08d8\u08d9\u0001\u0000\u0000"+
		"\u0000\u08d9\u08da\u0001\u0000\u0000\u0000\u08da\u08db\u0005\u0088\u0000"+
		"\u0000\u08db\u01ab\u0001\u0000\u0000\u0000\u08dc\u08de\u0003\u01b8\u00dc"+
		"\u0000\u08dd\u08dc\u0001\u0000\u0000\u0000\u08dd\u08de\u0001\u0000\u0000"+
		"\u0000\u08de\u08df\u0001\u0000\u0000\u0000\u08df\u08e1\u0003\u01ae\u00d7"+
		"\u0000\u08e0\u08e2\u0005,\u0000\u0000\u08e1\u08e0\u0001\u0000\u0000\u0000"+
		"\u08e1\u08e2\u0001\u0000\u0000\u0000\u08e2\u08e4\u0001\u0000\u0000\u0000"+
		"\u08e3\u08e5\u0003\u00ceg\u0000\u08e4\u08e3\u0001\u0000\u0000\u0000\u08e4"+
		"\u08e5\u0001\u0000\u0000\u0000\u08e5\u08e6\u0001\u0000\u0000\u0000\u08e6"+
		"\u08e7\u0005\u0003\u0000\u0000\u08e7\u08ec\u0001\u0000\u0000\u0000\u08e8"+
		"\u08e9\u0003\u01b8\u00dc\u0000\u08e9\u08ea\u0005\u0003\u0000\u0000\u08ea"+
		"\u08ec\u0001\u0000\u0000\u0000\u08eb\u08dd\u0001\u0000\u0000\u0000\u08eb"+
		"\u08e8\u0001\u0000\u0000\u0000\u08ec\u01ad\u0001\u0000\u0000\u0000\u08ed"+
		"\u08ee\u0005\u0086\u0000\u0000\u08ee\u08f5\u0005\u0089\u0000\u0000\u08ef"+
		"\u08f0\u0005\u0086\u0000\u0000\u08f0\u08f1\u0003\u01b2\u00d9\u0000\u08f1"+
		"\u08f2\u0005\u0089\u0000\u0000\u08f2\u08f5\u0001\u0000\u0000\u0000\u08f3"+
		"\u08f5\u0003\u01b0\u00d8\u0000\u08f4\u08ed\u0001\u0000\u0000\u0000\u08f4"+
		"\u08ef\u0001\u0000\u0000\u0000\u08f4\u08f3\u0001\u0000\u0000\u0000\u08f5"+
		"\u01af\u0001\u0000\u0000\u0000\u08f6\u08fb\u0003\u0206\u0103\u0000\u08f7"+
		"\u08f8\u0005\u008b\u0000\u0000\u08f8\u08fa\u0003\u0206\u0103\u0000\u08f9"+
		"\u08f7\u0001\u0000\u0000\u0000\u08fa\u08fd\u0001\u0000\u0000\u0000\u08fb"+
		"\u08f9\u0001\u0000\u0000\u0000\u08fb\u08fc\u0001\u0000\u0000\u0000\u08fc"+
		"\u01b1\u0001\u0000\u0000\u0000\u08fd\u08fb\u0001\u0000\u0000\u0000\u08fe"+
		"\u0903\u0003\u01b4\u00da\u0000\u08ff\u0900\u0005\u008b\u0000\u0000\u0900"+
		"\u0902\u0003\u01b4\u00da\u0000\u0901\u08ff\u0001\u0000\u0000\u0000\u0902"+
		"\u0905\u0001\u0000\u0000\u0000\u0903\u0901\u0001\u0000\u0000\u0000\u0903"+
		"\u0904\u0001\u0000\u0000\u0000\u0904\u01b3\u0001\u0000\u0000\u0000\u0905"+
		"\u0903\u0001\u0000\u0000\u0000\u0906\u0908\u0003\u01b6\u00db\u0000\u0907"+
		"\u0909\u0003\u01e0\u00f0\u0000\u0908\u0907\u0001\u0000\u0000\u0000\u0908"+
		"\u0909\u0001\u0000\u0000\u0000\u0909\u090f\u0001\u0000\u0000\u0000\u090a"+
		"\u090b\u0003\u01b6\u00db\u0000\u090b\u090c\u0003\u01e0\u00f0\u0000\u090c"+
		"\u090d\u0003\u021a\u010d\u0000\u090d\u090f\u0001\u0000\u0000\u0000\u090e"+
		"\u0906\u0001\u0000\u0000\u0000\u090e\u090a\u0001\u0000\u0000\u0000\u090f"+
		"\u01b5\u0001\u0000\u0000\u0000\u0910\u0911\u0003\u0208\u0104\u0000\u0911"+
		"\u01b7\u0001\u0000\u0000\u0000\u0912\u0913\u0005\u0087\u0000\u0000\u0913"+
		"\u0914\u0003\u01ba\u00dd\u0000\u0914\u0915\u0005\u008a\u0000\u0000\u0915"+
		"\u01b9\u0001\u0000\u0000\u0000\u0916\u091b\u0003\u01bc\u00de\u0000\u0917"+
		"\u0918\u0005\u008b\u0000\u0000\u0918\u091a\u0003\u01bc\u00de\u0000\u0919"+
		"\u0917\u0001\u0000\u0000\u0000\u091a\u091d\u0001\u0000\u0000\u0000\u091b"+
		"\u0919\u0001\u0000\u0000\u0000\u091b\u091c\u0001\u0000\u0000\u0000\u091c"+
		"\u01bb\u0001\u0000\u0000\u0000\u091d\u091b\u0001\u0000\u0000\u0000\u091e"+
		"\u0920\u0003\u01be\u00df\u0000\u091f\u091e\u0001\u0000\u0000\u0000\u091f"+
		"\u0920\u0001\u0000\u0000\u0000\u0920\u0921\u0001\u0000\u0000\u0000\u0921"+
		"\u0922\u0003\u017c\u00be\u0000\u0922\u01bd\u0001\u0000\u0000\u0000\u0923"+
		"\u0924\u0007\u0005\u0000\u0000\u0924\u01bf\u0001\u0000\u0000\u0000\u0925"+
		"\u0926\u0005\u0084\u0000\u0000\u0926\u0927\u0003\u0208\u0104\u0000\u0927"+
		"\u01c1\u0001\u0000\u0000\u0000\u0928\u0929\u0005\u0086\u0000\u0000\u0929"+
		"\u092a\u0003\u017c\u00be\u0000\u092a\u092b\u0005\u0089\u0000\u0000\u092b"+
		"\u01c3\u0001\u0000\u0000\u0000\u092c\u092d\u0005\u0086\u0000\u0000\u092d"+
		"\u0939\u0005\u0089\u0000\u0000\u092e\u092f\u0005\u0086\u0000\u0000\u092f"+
		"\u0932\u0003\u01c6\u00e3\u0000\u0930\u0931\u0005\u008b\u0000\u0000\u0931"+
		"\u0933\u0003\u01c6\u00e3\u0000\u0932\u0930\u0001\u0000\u0000\u0000\u0933"+
		"\u0934\u0001\u0000\u0000\u0000\u0934\u0932\u0001\u0000\u0000\u0000\u0934"+
		"\u0935\u0001\u0000\u0000\u0000\u0935\u0936\u0001\u0000\u0000\u0000\u0936"+
		"\u0937\u0005\u0089\u0000\u0000\u0937\u0939\u0001\u0000\u0000\u0000\u0938"+
		"\u092c\u0001\u0000\u0000\u0000\u0938\u092e\u0001\u0000\u0000\u0000\u0939"+
		"\u01c5\u0001\u0000\u0000\u0000\u093a\u0940\u0003\u017c\u00be\u0000\u093b"+
		"\u093c\u0003\u0208\u0104\u0000\u093c\u093d\u0005\u008c\u0000\u0000\u093d"+
		"\u093e\u0003\u017c\u00be\u0000\u093e\u0940\u0001\u0000\u0000\u0000\u093f"+
		"\u093a\u0001\u0000\u0000\u0000\u093f\u093b\u0001\u0000\u0000\u0000\u0940"+
		"\u01c7\u0001\u0000\u0000\u0000\u0941\u0942\u0005\u0090\u0000\u0000\u0942"+
		"\u01c9\u0001\u0000\u0000\u0000\u0943\u0944\u0005j\u0000\u0000\u0944\u0945"+
		"\u0005\u0086\u0000\u0000\u0945\u0946\u0003\u017c\u00be\u0000\u0946\u0947"+
		"\u0005\u0089\u0000\u0000\u0947\u0955\u0001\u0000\u0000\u0000\u0948\u0949"+
		"\u0005j\u0000\u0000\u0949\u094a\u0005\u0086\u0000\u0000\u094a\u094b\u0005"+
		"k\u0000\u0000\u094b\u094c\u0003\u017c\u00be\u0000\u094c\u094d\u0005\u0089"+
		"\u0000\u0000\u094d\u0955\u0001\u0000\u0000\u0000\u094e\u094f\u0005j\u0000"+
		"\u0000\u094f\u0950\u0005\u0086\u0000\u0000\u0950\u0951\u0005l\u0000\u0000"+
		"\u0951\u0952\u0003\u017c\u00be\u0000\u0952\u0953\u0005\u0089\u0000\u0000"+
		"\u0953\u0955\u0001\u0000\u0000\u0000\u0954\u0943\u0001\u0000\u0000\u0000"+
		"\u0954\u0948\u0001\u0000\u0000\u0000\u0954\u094e\u0001\u0000\u0000\u0000"+
		"\u0955\u01cb\u0001\u0000\u0000\u0000\u0956\u0957\u0005m\u0000\u0000\u0957"+
		"\u0958\u0005\u0086\u0000\u0000\u0958\u0959\u0003\u017c\u00be\u0000\u0959"+
		"\u095a\u0005\u0089\u0000\u0000\u095a\u01cd\u0001\u0000\u0000\u0000\u095b"+
		"\u095c\u0006\u00e7\uffff\uffff\u0000\u095c\u095f\u0003\u018e\u00c7\u0000"+
		"\u095d\u095f\u0003\u01dc\u00ee\u0000\u095e\u095b\u0001\u0000\u0000\u0000"+
		"\u095e\u095d\u0001\u0000\u0000\u0000\u095f\u0992\u0001\u0000\u0000\u0000"+
		"\u0960\u0961\n\f\u0000\u0000\u0961\u0991\u0003\u0222\u0111\u0000\u0962"+
		"\u0963\n\u000b\u0000\u0000\u0963\u0991\u0003\u01d0\u00e8\u0000\u0964\u0966"+
		"\n\n\u0000\u0000\u0965\u0967\u0003\u01d0\u00e8\u0000\u0966\u0965\u0001"+
		"\u0000\u0000\u0000\u0966\u0967\u0001\u0000\u0000\u0000\u0967\u0968\u0001"+
		"\u0000\u0000\u0000\u0968\u0991\u0003\u01d6\u00eb\u0000\u0969\u096a\n\t"+
		"\u0000\u0000\u096a\u096b\u0005\u0084\u0000\u0000\u096b\u0991\u00051\u0000"+
		"\u0000\u096c\u096d\n\b\u0000\u0000\u096d\u096e\u0005\u0084\u0000\u0000"+
		"\u096e\u096f\u00051\u0000\u0000\u096f\u0970\u0005\u0086\u0000\u0000\u0970"+
		"\u0971\u0003\u01d8\u00ec\u0000\u0971\u0972\u0005\u0089\u0000\u0000\u0972"+
		"\u0991\u0001\u0000\u0000\u0000\u0973\u0974\n\u0007\u0000\u0000\u0974\u0975"+
		"\u0005\u0084\u0000\u0000\u0975\u0991\u0005\u00a4\u0000\u0000\u0976\u0977"+
		"\n\u0006\u0000\u0000\u0977\u0978\u0005\u0084\u0000\u0000\u0978\u097a\u0003"+
		"\u0206\u0103\u0000\u0979\u097b\u0003\u0088D\u0000\u097a\u0979\u0001\u0000"+
		"\u0000\u0000\u097a\u097b\u0001\u0000\u0000\u0000\u097b\u0991\u0001\u0000"+
		"\u0000\u0000\u097c\u097d\n\u0005\u0000\u0000\u097d\u097e\u0005\u0084\u0000"+
		"\u0000\u097e\u097f\u0003\u0206\u0103\u0000\u097f\u0980\u0005\u0086\u0000"+
		"\u0000\u0980\u0981\u0003\u01d8\u00ec\u0000\u0981\u0982\u0005\u0089\u0000"+
		"\u0000\u0982\u0991\u0001\u0000\u0000\u0000\u0983\u0984\n\u0004\u0000\u0000"+
		"\u0984\u0985\u0005\u0086\u0000\u0000\u0985\u0986\u0003\u01d8\u00ec\u0000"+
		"\u0986\u0987\u0005\u0089\u0000\u0000\u0987\u0991\u0001\u0000\u0000\u0000"+
		"\u0988\u0989\n\u0003\u0000\u0000\u0989\u098a\u0005\u0084\u0000\u0000\u098a"+
		"\u0991\u0005e\u0000\u0000\u098b\u098c\n\u0001\u0000\u0000\u098c\u098d"+
		"\u0005\u0087\u0000\u0000\u098d\u098e\u0003\u017e\u00bf\u0000\u098e\u098f"+
		"\u0005\u008a\u0000\u0000\u098f\u0991\u0001\u0000\u0000\u0000\u0990\u0960"+
		"\u0001\u0000\u0000\u0000\u0990\u0962\u0001\u0000\u0000\u0000\u0990\u0964"+
		"\u0001\u0000\u0000\u0000\u0990\u0969\u0001\u0000\u0000\u0000\u0990\u096c"+
		"\u0001\u0000\u0000\u0000\u0990\u0973\u0001\u0000\u0000\u0000\u0990\u0976"+
		"\u0001\u0000\u0000\u0000\u0990\u097c\u0001\u0000\u0000\u0000\u0990\u0983"+
		"\u0001\u0000\u0000\u0000\u0990\u0988\u0001\u0000\u0000\u0000\u0990\u098b"+
		"\u0001\u0000\u0000\u0000\u0991\u0994\u0001\u0000\u0000\u0000\u0992\u0990"+
		"\u0001\u0000\u0000\u0000\u0992\u0993\u0001\u0000\u0000\u0000\u0993\u01cf"+
		"\u0001\u0000\u0000\u0000\u0994\u0992\u0001\u0000\u0000\u0000\u0995\u0996"+
		"\u0005\u0086\u0000\u0000\u0996\u099c\u0005\u0089\u0000\u0000\u0997\u0998"+
		"\u0005\u0086\u0000\u0000\u0998\u0999\u0003\u01d2\u00e9\u0000\u0999\u099a"+
		"\u0005\u0089\u0000\u0000\u099a\u099c\u0001\u0000\u0000\u0000\u099b\u0995"+
		"\u0001\u0000\u0000\u0000\u099b\u0997\u0001\u0000\u0000\u0000\u099c\u01d1"+
		"\u0001\u0000\u0000\u0000\u099d\u09a2\u0003\u01d4\u00ea\u0000\u099e\u099f"+
		"\u0005\u008b\u0000\u0000\u099f\u09a1\u0003\u01d4\u00ea\u0000\u09a0\u099e"+
		"\u0001\u0000\u0000\u0000\u09a1\u09a4\u0001\u0000\u0000";
	private static final String _serializedATNSegment1 =
		"\u0000\u09a2\u09a0\u0001\u0000\u0000\u0000\u09a2\u09a3\u0001\u0000\u0000"+
		"\u0000\u09a3\u01d3\u0001\u0000\u0000\u0000\u09a4\u09a2\u0001\u0000\u0000"+
		"\u0000\u09a5\u09b0\u0003\u017c\u00be\u0000\u09a6\u09a7\u0003\u0208\u0104"+
		"\u0000\u09a7\u09a8\u0005\u008c\u0000\u0000\u09a8\u09a9\u0003\u017c\u00be"+
		"\u0000\u09a9\u09b0\u0001\u0000\u0000\u0000\u09aa\u09b0\u0003\u0224\u0112"+
		"\u0000\u09ab\u09ac\u0003\u0208\u0104\u0000\u09ac\u09ad\u0005\u008c\u0000"+
		"\u0000\u09ad\u09ae\u0003\u0224\u0112\u0000\u09ae\u09b0\u0001\u0000\u0000"+
		"\u0000\u09af\u09a5\u0001\u0000\u0000\u0000\u09af\u09a6\u0001\u0000\u0000"+
		"\u0000\u09af\u09aa\u0001\u0000\u0000\u0000\u09af\u09ab\u0001\u0000\u0000"+
		"\u0000\u09b0\u01d5\u0001\u0000\u0000\u0000\u09b1\u09b2\u0003\u01aa\u00d5"+
		"\u0000\u09b2\u01d7\u0001\u0000\u0000\u0000\u09b3\u09b7\u0003\u01da\u00ed"+
		"\u0000\u09b4\u09b6\u0003\u01da\u00ed\u0000\u09b5\u09b4\u0001\u0000\u0000"+
		"\u0000\u09b6\u09b9\u0001\u0000\u0000\u0000\u09b7\u09b5\u0001\u0000\u0000"+
		"\u0000\u09b7\u09b8\u0001\u0000\u0000\u0000\u09b8\u01d9\u0001\u0000\u0000"+
		"\u0000\u09b9\u09b7\u0001\u0000\u0000\u0000\u09ba\u09bb\u0003\u0208\u0104"+
		"\u0000\u09bb\u09bc\u0005\u008c\u0000\u0000\u09bc\u01db\u0001\u0000\u0000"+
		"\u0000\u09bd\u09be\u0005n\u0000\u0000\u09be\u09bf\u0005\u0086\u0000\u0000"+
		"\u09bf\u09c0\u0005o\u0000\u0000\u09c0\u09c1\u0005\u008c\u0000\u0000\u09c1"+
		"\u09c2\u0003\u017c\u00be\u0000\u09c2\u09c3\u0005\u0089\u0000\u0000\u09c3"+
		"\u01dd\u0001\u0000\u0000\u0000\u09c4\u09c5\u0006\u00ef\uffff\uffff\u0000"+
		"\u09c5\u09ce\u0003\u01f8\u00fc\u0000\u09c6\u09ce\u0003\u01fa\u00fd\u0000"+
		"\u09c7\u09ce\u0003\u01ee\u00f7\u0000\u09c8\u09ce\u0003\u01e2\u00f1\u0000"+
		"\u09c9\u09ce\u0003\u01e6\u00f3\u0000\u09ca\u09ce\u0003\u01fc\u00fe\u0000"+
		"\u09cb\u09ce\u0005r\u0000\u0000\u09cc\u09ce\u0005f\u0000\u0000\u09cd\u09c4"+
		"\u0001\u0000\u0000\u0000\u09cd\u09c6\u0001\u0000\u0000\u0000\u09cd\u09c7"+
		"\u0001\u0000\u0000\u0000\u09cd\u09c8\u0001\u0000\u0000\u0000\u09cd\u09c9"+
		"\u0001\u0000\u0000\u0000\u09cd\u09ca\u0001\u0000\u0000\u0000\u09cd\u09cb"+
		"\u0001\u0000\u0000\u0000\u09cd\u09cc\u0001\u0000\u0000\u0000\u09ce\u09db"+
		"\u0001\u0000\u0000\u0000\u09cf\u09d0\n\u0007\u0000\u0000\u09d0\u09da\u0005"+
		"\u0092\u0000\u0000\u09d1\u09d2\n\u0006\u0000\u0000\u09d2\u09da\u0005\u0091"+
		"\u0000\u0000\u09d3\u09d4\n\u0004\u0000\u0000\u09d4\u09d5\u0005\u0084\u0000"+
		"\u0000\u09d5\u09da\u0005p\u0000\u0000\u09d6\u09d7\n\u0003\u0000\u0000"+
		"\u09d7\u09d8\u0005\u0084\u0000\u0000\u09d8\u09da\u0005q\u0000\u0000\u09d9"+
		"\u09cf\u0001\u0000\u0000\u0000\u09d9\u09d1\u0001\u0000\u0000\u0000\u09d9"+
		"\u09d3\u0001\u0000\u0000\u0000\u09d9\u09d6\u0001\u0000\u0000\u0000\u09da"+
		"\u09dd\u0001\u0000\u0000\u0000\u09db\u09d9\u0001\u0000\u0000\u0000\u09db"+
		"\u09dc\u0001\u0000\u0000\u0000\u09dc\u01df\u0001\u0000\u0000\u0000\u09dd"+
		"\u09db\u0001\u0000\u0000\u0000\u09de\u09e0\u0005\u008c\u0000\u0000\u09df"+
		"\u09e1\u0003\u0174\u00ba\u0000\u09e0\u09df\u0001\u0000\u0000\u0000\u09e0"+
		"\u09e1\u0001\u0000\u0000\u0000\u09e1\u09e3\u0001\u0000\u0000\u0000\u09e2"+
		"\u09e4\u0005s\u0000\u0000\u09e3\u09e2\u0001\u0000\u0000\u0000\u09e3\u09e4"+
		"\u0001\u0000\u0000\u0000\u09e4\u09e5\u0001\u0000\u0000\u0000\u09e5\u09e6"+
		"\u0003\u01de\u00ef\u0000\u09e6\u01e1\u0001\u0000\u0000\u0000\u09e7\u09e9"+
		"\u0003\u01e4\u00f2\u0000\u09e8\u09ea\u0003\u0088D\u0000\u09e9\u09e8\u0001"+
		"\u0000\u0000\u0000\u09e9\u09ea\u0001\u0000\u0000\u0000\u09ea\u09ed\u0001"+
		"\u0000\u0000\u0000\u09eb\u09ec\u0005\u0084\u0000\u0000\u09ec\u09ee\u0003"+
		"\u01e2\u00f1\u0000\u09ed\u09eb\u0001\u0000\u0000\u0000\u09ed\u09ee\u0001"+
		"\u0000\u0000\u0000\u09ee\u01e3\u0001\u0000\u0000\u0000\u09ef\u09f0\u0003"+
		"\u0206\u0103\u0000\u09f0\u01e5\u0001\u0000\u0000\u0000\u09f1\u09f3\u0005"+
		"\u0086\u0000\u0000\u09f2\u09f4\u0003\u01e8\u00f4\u0000\u09f3\u09f2\u0001"+
		"\u0000\u0000\u0000\u09f3\u09f4\u0001\u0000\u0000\u0000\u09f4\u09f5\u0001"+
		"\u0000\u0000\u0000\u09f5\u09f6\u0005\u0089\u0000\u0000\u09f6\u01e7\u0001"+
		"\u0000\u0000\u0000\u09f7\u09fd\u0003\u01ea\u00f5\u0000\u09f8\u09f9\u0003"+
		"\u01ea\u00f5\u0000\u09f9\u09fa\u0005\u008b\u0000\u0000\u09fa\u09fb\u0003"+
		"\u01e8\u00f4\u0000\u09fb\u09fd\u0001\u0000\u0000\u0000\u09fc\u09f7\u0001"+
		"\u0000\u0000\u0000\u09fc\u09f8\u0001\u0000\u0000\u0000\u09fd\u01e9\u0001"+
		"\u0000\u0000\u0000\u09fe\u09ff\u0003\u01ec\u00f6\u0000\u09ff\u0a00\u0003"+
		"\u01e0\u00f0\u0000\u0a00\u0a03\u0001\u0000\u0000\u0000\u0a01\u0a03\u0003"+
		"\u01de\u00ef\u0000\u0a02\u09fe\u0001\u0000\u0000\u0000\u0a02\u0a01\u0001"+
		"\u0000\u0000\u0000\u0a03\u01eb\u0001\u0000\u0000\u0000\u0a04\u0a05\u0003"+
		"\u0208\u0104\u0000\u0a05\u01ed\u0001\u0000\u0000\u0000\u0a06\u0a08\u0003"+
		"\u0174\u00ba\u0000\u0a07\u0a06\u0001\u0000\u0000\u0000\u0a07\u0a08\u0001"+
		"\u0000\u0000\u0000\u0a08\u0a09\u0001\u0000\u0000\u0000\u0a09\u0a0b\u0003"+
		"\u01f0\u00f8\u0000\u0a0a\u0a0c\u0005,\u0000\u0000\u0a0b\u0a0a\u0001\u0000"+
		"\u0000\u0000\u0a0b\u0a0c\u0001\u0000\u0000\u0000\u0a0c\u0a0d\u0001\u0000"+
		"\u0000\u0000\u0a0d\u0a0e\u0003\u0218\u010c\u0000\u0a0e\u0a0f\u0003\u01de"+
		"\u00ef\u0000\u0a0f\u0a19\u0001\u0000\u0000\u0000\u0a10\u0a12\u0003\u0174"+
		"\u00ba\u0000\u0a11\u0a10\u0001\u0000\u0000\u0000\u0a11\u0a12\u0001\u0000"+
		"\u0000\u0000\u0a12\u0a13\u0001\u0000\u0000\u0000\u0a13\u0a14\u0003\u01f0"+
		"\u00f8\u0000\u0a14\u0a15\u0005-\u0000\u0000\u0a15\u0a16\u0003\u0218\u010c"+
		"\u0000\u0a16\u0a17\u0003\u01de\u00ef\u0000\u0a17\u0a19\u0001\u0000\u0000"+
		"\u0000\u0a18\u0a07\u0001\u0000\u0000\u0000\u0a18\u0a11\u0001\u0000\u0000"+
		"\u0000\u0a19\u01ef\u0001\u0000\u0000\u0000\u0a1a\u0a1b\u0005\u0086\u0000"+
		"\u0000\u0a1b\u0a24\u0005\u0089\u0000\u0000\u0a1c\u0a1d\u0005\u0086\u0000"+
		"\u0000\u0a1d\u0a1f\u0003\u01f2\u00f9\u0000\u0a1e\u0a20\u0003\u021a\u010d"+
		"\u0000\u0a1f\u0a1e\u0001\u0000\u0000\u0000\u0a1f\u0a20\u0001\u0000\u0000"+
		"\u0000\u0a20\u0a21\u0001\u0000\u0000\u0000\u0a21\u0a22\u0005\u0089\u0000"+
		"\u0000\u0a22\u0a24\u0001\u0000\u0000\u0000\u0a23\u0a1a\u0001\u0000\u0000"+
		"\u0000\u0a23\u0a1c\u0001\u0000\u0000\u0000\u0a24\u01f1\u0001\u0000\u0000"+
		"\u0000\u0a25\u0a2b\u0003\u01f4\u00fa\u0000\u0a26\u0a27\u0003\u01f4\u00fa"+
		"\u0000\u0a27\u0a28\u0005\u008b\u0000\u0000\u0a28\u0a29\u0003\u01f2\u00f9"+
		"\u0000\u0a29\u0a2b\u0001\u0000\u0000\u0000\u0a2a\u0a25\u0001\u0000\u0000"+
		"\u0000\u0a2a\u0a26\u0001\u0000\u0000\u0000\u0a2b\u01f3\u0001\u0000\u0000"+
		"\u0000\u0a2c\u0a2e\u0003\u0174\u00ba\u0000\u0a2d\u0a2c\u0001\u0000\u0000"+
		"\u0000\u0a2d\u0a2e\u0001\u0000\u0000\u0000\u0a2e\u0a30\u0001\u0000\u0000"+
		"\u0000\u0a2f\u0a31\u0005s\u0000\u0000\u0a30\u0a2f\u0001\u0000\u0000\u0000"+
		"\u0a30\u0a31\u0001\u0000\u0000\u0000\u0a31\u0a32\u0001\u0000\u0000\u0000"+
		"\u0a32\u0a37\u0003\u01de\u00ef\u0000\u0a33\u0a34\u0003\u01f6\u00fb\u0000"+
		"\u0a34\u0a35\u0003\u01e0\u00f0\u0000\u0a35\u0a37\u0001\u0000\u0000\u0000"+
		"\u0a36\u0a2d\u0001\u0000\u0000\u0000\u0a36\u0a33\u0001\u0000\u0000\u0000"+
		"\u0a37\u01f5\u0001\u0000\u0000\u0000\u0a38\u0a39\u0003\u0208\u0104\u0000"+
		"\u0a39\u01f7\u0001\u0000\u0000\u0000\u0a3a\u0a3b\u0005\u0087\u0000\u0000"+
		"\u0a3b\u0a3c\u0003\u01de\u00ef\u0000\u0a3c\u0a3d\u0005\u008a\u0000\u0000"+
		"\u0a3d\u01f9\u0001\u0000\u0000\u0000\u0a3e\u0a3f\u0005\u0087\u0000\u0000"+
		"\u0a3f\u0a40\u0003\u01de\u00ef\u0000\u0a40\u0a41\u0005\u008c\u0000\u0000"+
		"\u0a41\u0a42\u0003\u01de\u00ef\u0000\u0a42\u0a43\u0005\u008a\u0000\u0000"+
		"\u0a43\u01fb\u0001\u0000\u0000\u0000\u0a44\u0a47\u0003\u01fe\u00ff\u0000"+
		"\u0a45\u0a46\u0005\u0094\u0000\u0000\u0a46\u0a48\u0003\u01fe\u00ff\u0000"+
		"\u0a47\u0a45\u0001\u0000\u0000\u0000\u0a48\u0a49\u0001\u0000\u0000\u0000"+
		"\u0a49\u0a47\u0001\u0000\u0000\u0000\u0a49\u0a4a\u0001\u0000\u0000\u0000"+
		"\u0a4a\u01fd\u0001\u0000\u0000\u0000\u0a4b\u0a4c\u0003\u01e2\u00f1\u0000"+
		"\u0a4c\u01ff\u0001\u0000\u0000\u0000\u0a4d\u0a4e\u0005\u008c\u0000\u0000"+
		"\u0a4e\u0a4f\u0003\u0204\u0102\u0000\u0a4f\u0a50\u0005\u008b\u0000\u0000"+
		"\u0a50\u0a51\u0003\u0202\u0101\u0000\u0a51\u0a57\u0001\u0000\u0000\u0000"+
		"\u0a52\u0a53\u0005\u008c\u0000\u0000\u0a53\u0a57\u0003\u0204\u0102\u0000"+
		"\u0a54\u0a55\u0005\u008c\u0000\u0000\u0a55\u0a57\u0003\u0202\u0101\u0000"+
		"\u0a56\u0a4d\u0001\u0000\u0000\u0000\u0a56\u0a52\u0001\u0000\u0000\u0000"+
		"\u0a56\u0a54\u0001\u0000\u0000\u0000\u0a57\u0201\u0001\u0000\u0000\u0000"+
		"\u0a58\u0a5e\u0003\u01e2\u00f1\u0000\u0a59\u0a5a\u0003\u01e2\u00f1\u0000"+
		"\u0a5a\u0a5b\u0005\u008b\u0000\u0000\u0a5b\u0a5c\u0003\u0202\u0101\u0000"+
		"\u0a5c\u0a5e\u0001\u0000\u0000\u0000\u0a5d\u0a58\u0001\u0000\u0000\u0000"+
		"\u0a5d\u0a59\u0001\u0000\u0000\u0000\u0a5e\u0203\u0001\u0000\u0000\u0000"+
		"\u0a5f\u0a60\u0005$\u0000\u0000\u0a60\u0205\u0001\u0000\u0000\u0000\u0a61"+
		"\u0a64\u0005\u0083\u0000\u0000\u0a62\u0a64\u0003\u020a\u0105\u0000\u0a63"+
		"\u0a61\u0001\u0000\u0000\u0000\u0a63\u0a62\u0001\u0000\u0000\u0000\u0a64"+
		"\u0207\u0001\u0000\u0000\u0000\u0a65\u0a68\u0005\u0083\u0000\u0000\u0a66"+
		"\u0a68\u0003\u020c\u0106\u0000\u0a67\u0a65\u0001\u0000\u0000\u0000\u0a67"+
		"\u0a66\u0001\u0000\u0000\u0000\u0a68\u0209\u0001\u0000\u0000\u0000\u0a69"+
		"\u0a6a\u0007\u0006\u0000\u0000\u0a6a\u020b\u0001\u0000\u0000\u0000\u0a6b"+
		"\u0a6c\u0007\u0007\u0000\u0000\u0a6c\u020d\u0001\u0000\u0000\u0000\u0a6d"+
		"\u0a6e\u0004\u0107\u0015\u0000\u0a6e\u0a6f\u0005\u0096\u0000\u0000\u0a6f"+
		"\u020f\u0001\u0000\u0000\u0000\u0a70\u0a71\u0004\u0108\u0016\u0000\u0a71"+
		"\u0a72\u0005\u0095\u0000\u0000\u0a72\u0211\u0001\u0000\u0000\u0000\u0a73"+
		"\u0a74\u0004\u0109\u0017\u0000\u0a74\u0a75\u0005\u0094\u0000\u0000\u0a75"+
		"\u0a76\u0005\u0094\u0000\u0000\u0a76\u0213\u0001\u0000\u0000\u0000\u0a77"+
		"\u0a78\u0004\u010a\u0018\u0000\u0a78\u0a79\u0005\u0097\u0000\u0000\u0a79"+
		"\u0a7a\u0005\u0097\u0000\u0000\u0a7a\u0215\u0001\u0000\u0000\u0000\u0a7b"+
		"\u0a7c\u0004\u010b\u0019\u0000\u0a7c\u0a7d\u0005\u008f\u0000\u0000\u0a7d"+
		"\u0a7e\u0005\u0096\u0000\u0000\u0a7e\u0217\u0001\u0000\u0000\u0000\u0a7f"+
		"\u0a80\u0004\u010c\u001a\u0000\u0a80\u0a81\u0005\u0095\u0000\u0000\u0a81"+
		"\u0a82\u0005\u008f\u0000\u0000\u0a82\u0219\u0001\u0000\u0000\u0000\u0a83"+
		"\u0a84\u0004\u010d\u001b\u0000\u0a84\u0a85\u0005\u0084\u0000\u0000\u0a85"+
		"\u0a86\u0005\u0084\u0000\u0000\u0a86\u0a87\u0005\u0084\u0000\u0000\u0a87"+
		"\u021b\u0001\u0000\u0000\u0000\u0a88\u0a89\u0004\u010e\u001c\u0000\u0a89"+
		"\u0a8a\u0005\u0096\u0000\u0000\u0a8a\u0a8b\u0005\u0096\u0000\u0000\u0a8b"+
		"\u021d\u0001\u0000\u0000\u0000\u0a8c\u0a8d\u0004\u010f\u001d\u0000\u0a8d"+
		"\u0a8e\u0003\u0224\u0112\u0000\u0a8e\u021f\u0001\u0000\u0000\u0000\u0a8f"+
		"\u0a90\u0004\u0110\u001e\u0000\u0a90\u0a91\u0003\u0224\u0112\u0000\u0a91"+
		"\u0221\u0001\u0000\u0000\u0000\u0a92\u0a93\u0004\u0111\u001f\u0000\u0a93"+
		"\u0a94\u0003\u0224\u0112\u0000\u0a94\u0223\u0001\u0000\u0000\u0000\u0a95"+
		"\u0a9a\u0003\u0228\u0114\u0000\u0a96\u0a97\u0004\u0112 \u0000\u0a97\u0a99"+
		"\u0003\u0226\u0113\u0000\u0a98\u0a96\u0001\u0000\u0000\u0000\u0a99\u0a9c"+
		"\u0001\u0000\u0000\u0000\u0a9a\u0a98\u0001\u0000\u0000\u0000\u0a9a\u0a9b"+
		"\u0001\u0000\u0000\u0000\u0a9b\u0aa6\u0001\u0000\u0000\u0000\u0a9c\u0a9a"+
		"\u0001\u0000\u0000\u0000\u0a9d\u0aa2\u0003\u022a\u0115\u0000\u0a9e\u0a9f"+
		"\u0004\u0112!\u0000\u0a9f\u0aa1\u0003\u022c\u0116\u0000\u0aa0\u0a9e\u0001"+
		"\u0000\u0000\u0000\u0aa1\u0aa4\u0001\u0000\u0000\u0000\u0aa2\u0aa0\u0001"+
		"\u0000\u0000\u0000\u0aa2\u0aa3\u0001\u0000\u0000\u0000\u0aa3\u0aa6\u0001"+
		"\u0000\u0000\u0000\u0aa4\u0aa2\u0001\u0000\u0000\u0000\u0aa5\u0a95\u0001"+
		"\u0000\u0000\u0000\u0aa5\u0a9d\u0001\u0000\u0000\u0000\u0aa6\u0225\u0001"+
		"\u0000\u0000\u0000\u0aa7\u0aaa\u0003\u0228\u0114\u0000\u0aa8\u0aaa\u0005"+
		"\u009f\u0000\u0000\u0aa9\u0aa7\u0001\u0000\u0000\u0000\u0aa9\u0aa8\u0001"+
		"\u0000\u0000\u0000\u0aaa\u0227\u0001\u0000\u0000\u0000\u0aab\u0aae\u0007"+
		"\b\u0000\u0000\u0aac\u0aae\u0005\u009e\u0000\u0000\u0aad\u0aab\u0001\u0000"+
		"\u0000\u0000\u0aad\u0aac\u0001\u0000\u0000\u0000\u0aae\u0229\u0001\u0000"+
		"\u0000\u0000\u0aaf\u0ab0\u0005\u0084\u0000\u0000\u0ab0\u022b\u0001\u0000"+
		"\u0000\u0000\u0ab1\u0ab4\u0005\u0084\u0000\u0000\u0ab2\u0ab4\u0003\u0226"+
		"\u0113\u0000\u0ab3\u0ab1\u0001\u0000\u0000\u0000\u0ab3\u0ab2\u0001\u0000"+
		"\u0000\u0000\u0ab4\u022d\u0001\u0000\u0000\u0000\u0ab5\u0aba\u0003\u0230"+
		"\u0118\u0000\u0ab6\u0aba\u0003\u0238\u011c\u0000\u0ab7\u0aba\u0003\u0232"+
		"\u0119\u0000\u0ab8\u0aba\u0003\u0234\u011a\u0000\u0ab9\u0ab5\u0001\u0000"+
		"\u0000\u0000\u0ab9\u0ab6\u0001\u0000\u0000\u0000\u0ab9\u0ab7\u0001\u0000"+
		"\u0000\u0000\u0ab9\u0ab8\u0001\u0000\u0000\u0000\u0aba\u022f\u0001\u0000"+
		"\u0000\u0000\u0abb\u0abd\u0003\u0210\u0108\u0000\u0abc\u0abb\u0001\u0000"+
		"\u0000\u0000\u0abc\u0abd\u0001\u0000\u0000\u0000\u0abd\u0abe\u0001\u0000"+
		"\u0000\u0000\u0abe\u0ac4\u0003\u0236\u011b\u0000\u0abf\u0ac1\u0003\u0210"+
		"\u0108\u0000\u0ac0\u0abf\u0001\u0000\u0000\u0000\u0ac0\u0ac1\u0001\u0000"+
		"\u0000\u0000\u0ac1\u0ac2\u0001\u0000\u0000\u0000\u0ac2\u0ac4\u0005\u00a6"+
		"\u0000\u0000\u0ac3\u0abc\u0001\u0000\u0000\u0000\u0ac3\u0ac0\u0001\u0000"+
		"\u0000\u0000\u0ac4\u0231\u0001\u0000\u0000\u0000\u0ac5\u0ac6\u0007\t\u0000"+
		"\u0000\u0ac6\u0233\u0001\u0000\u0000\u0000\u0ac7\u0ac8\u0005\u0080\u0000"+
		"\u0000\u0ac8\u0235\u0001\u0000\u0000\u0000\u0ac9\u0aca\u0007\n\u0000\u0000"+
		"\u0aca\u0237\u0001\u0000\u0000\u0000\u0acb\u0acc\u0007\u000b\u0000\u0000"+
		"\u0acc\u0239\u0001\u0000\u0000\u0000\u013f\u023b\u0241\u0245\u0249\u024d"+
		"\u0251\u0255\u0259\u025d\u0261\u0263\u026b\u0271\u0275\u0279\u027d\u0283"+
		"\u0287\u028b\u028f\u0293\u0297\u029d\u02aa\u02b1\u02b7\u02c1\u02cb\u02d1"+
		"\u02d7\u02e2\u02e8\u02f0\u02f8\u02fc\u0301\u0317\u0323\u0327\u032b\u0331"+
		"\u033c\u0340\u0344\u0347\u034d\u0351\u0354\u035b\u0360\u0365\u0369\u037d"+
		"\u0387\u0389\u039c\u03b4\u03c4\u03d2\u03de\u03e8\u03ed\u03f7\u0406\u041b"+
		"\u0420\u0423\u0427\u042c\u0430\u043b\u0440\u0443\u0446\u0450\u0455\u046d"+
		"\u0476\u047d\u0480\u0483\u048c\u0495\u0498\u049b\u04a1\u04a4\u04a8\u04b3"+
		"\u04bc\u04bf\u04c2\u04c7\u04ca\u04d1\u04da\u04dd\u04e1\u04e6\u04ea\u04ef"+
		"\u04f2\u04f7\u0503\u0507\u050a\u050d\u0510\u0516\u051a\u051d\u0522\u0524"+
		"\u0528\u0534\u053b\u053f\u0544\u0547\u054d\u0553\u055d\u0560\u0564\u0567"+
		"\u056a\u056d\u0572\u0575\u0578\u057c\u0582\u0587\u058a\u058d\u0597\u059b"+
		"\u05a4\u05a8\u05b0\u05b5\u05b8\u05c2\u05c6\u05ce\u05d1\u05d4\u05d9\u05dc"+
		"\u05df\u05e9\u05f0\u05f3\u05f6\u05f9\u05fe\u0601\u0604\u0609\u060c\u0610"+
		"\u0615\u0618\u061b\u061f\u0627\u062e\u0631\u0634\u0639\u0643\u064a\u0652"+
		"\u065c\u0660\u0664\u0668\u066b\u066f\u0674\u0676\u067d\u0680\u0685\u0688"+
		"\u068c\u0690\u0693\u0699\u069e\u06a2\u06a5\u06a8\u06ac\u06af\u06b4\u06b7"+
		"\u06bb\u06c0\u06c6\u06c9\u06ce\u06d3\u06d6\u06dd\u06e3\u06ea\u06f8\u06fb"+
		"\u06fe\u0705\u070c\u071a\u0725\u072d\u0735\u0746\u0763\u0768\u0783\u078a"+
		"\u078e\u0793\u079a\u07a1\u07ac\u07b0\u07b9\u07bf\u07c4\u07ce\u07d9\u07de"+
		"\u07f2\u07fa\u07fd\u0801\u0808\u0810\u081a\u0821\u0827\u082c\u0831\u0835"+
		"\u0844\u0848\u0854\u085e\u0862\u0868\u086e\u0879\u087d\u0883\u08aa\u08bf"+
		"\u08c4\u08d5\u08d8\u08dd\u08e1\u08e4\u08eb\u08f4\u08fb\u0903\u0908\u090e"+
		"\u091b\u091f\u0934\u0938\u093f\u0954\u095e\u0966\u097a\u0990\u0992\u099b"+
		"\u09a2\u09af\u09b7\u09cd\u09d9\u09db\u09e0\u09e3\u09e9\u09ed\u09f3\u09fc"+
		"\u0a02\u0a07\u0a0b\u0a11\u0a18\u0a1f\u0a23\u0a2a\u0a2d\u0a30\u0a36\u0a49"+
		"\u0a56\u0a5d\u0a63\u0a67\u0a9a\u0aa2\u0aa5\u0aa9\u0aad\u0ab3\u0ab9\u0abc"+
		"\u0ac0\u0ac3";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}