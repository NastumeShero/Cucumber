package com.xiao.study.cucumber.chapter02;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableRowTransformer;
import io.cucumber.datatable.TableTransformer;

import java.util.List;
import java.util.Locale;

import static java.util.Locale.ENGLISH;
//

public class TypeRegistryConfiguration implements TypeRegistryConfigurer{

    @Override
    public Locale locale() {
        return ENGLISH;
    }


    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(new DataTableType(
                Board.class,
                (TableTransformer<Board>) table -> new Board(table.cells())));

//
//        typeRegistry.defineDataTableType(new DataTableType(
//                Board.class,new TableTransformer(){
//
//                    @Override
//                    public Object transform(DataTable dataTable) throws Throwable {
//                        return new Board(dataTable.cells());
//                    }
//                }));


    }
//
//    static class Board {
//
//        private final List<List<String>> board;
//
//        private Board(List<List<String>> board) {
//            this.board = board;
//        }
//    }
}
