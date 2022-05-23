-- Display all Department Details for which we have employees 

select * from Dept where deptno = ANY(select deptno from Emp);

-- Display all Agents who did policies (exists in both Agent and AgentPolicy tables) 

select * From Agent where AgentId = ANY(select AgentId from AgentPolicy);

-- Dispaly all Policy details, who have Agents means (exists in both Policy and AgentPolicy Tables) 

select * from Policy where PolicyId = ANY(select PolicyID from AgentPolicy);

-- Display Dept details for which no employes exists means (exists in Dept table, but not in Emp table) 

select * from Dept where deptno <> ALL(select deptno from Emp);

-- Display Idle agents (exits in Agent table, but no in AgentPolicy Table) 

select * from Agent where AgentID <> ALL(select AgentId from AgentPolicy);

-- Display Idle Policies (Exists in Policy Table, but not in AgentPolicy Table) 

select * from Policy where PolicyId <> ALL (select policyId from AgentPolicy);

