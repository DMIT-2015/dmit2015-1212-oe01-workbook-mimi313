package dmit2015.dmit20151212jsfdemo.repository;

import common.jpa.AbstractJpaRepository;
import dmit2015.dmit20151212jsfdemo.entity.TodoItem;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class TodoItemRepository extends AbstractJpaRepository<TodoItem, Long> {

    public TodoItemRepository() {
        super(TodoItem.class);
    }

}