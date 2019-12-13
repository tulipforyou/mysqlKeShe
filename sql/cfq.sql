use keShe;

create trigger triggerName
after insert on admin
for each row #这句话在mysql是固定的
begin
    insert into adminLog(adminName) values (new.adminName);
end;


create trigger triggerNameOnSal
after insert on salDesc
for each row #这句话在mysql是固定的
begin
    insert into salLog(staffId, sumSal) values (new.staffId,new.salBase+new.salComm+new.salExtra+new.salElse-new.salDeduct);
end;

create trigger triggerNameOnSalUpdate
after update on salDesc
for each row #这句话在mysql是固定的
begin
    update salLog set sumSal= (new.salBase+new.salComm+new.salExtra+new.salElse-new.salDeduct)
    where salLog.staffId=new.staffId;
end;



